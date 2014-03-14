package rp3.cartera.cliente;


import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.content.Loader;
import android.widget.SimpleCursorAdapter;
import rp3.app.BaseListFragment;
import rp3.content.SimpleCursorLoader;


public class ClienteListadoFragment extends BaseListFragment {

	SimpleCursorAdapter adpater;
	private static final int LOADER_CLIENTES = 1;
	
	
	public void refrescarListado(){
		getLoaderManager().restartLoader(LOADER_CLIENTES, null, this);
	}
	
	public static ClienteListadoFragment newInstance(){
		ClienteListadoFragment  f = new ClienteListadoFragment();
		
		return f;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {		
		super.onActivityCreated(savedInstanceState);
		
		getLoaderManager().initLoader(LOADER_CLIENTES, null, this);
	}

	@Override
	public Loader<Cursor> onCreateLoader(int id, Bundle args) {		
		super.onCreateLoader(id, args);
		
		switch(id){
		
		case LOADER_CLIENTES:
			return new SimpleCursorLoader(getActivity()) {
				
				@Override
				public Cursor loadInBackground() {
					
					return rp3.cartera.model.Cliente.getClientesCursor( getDataBase() );
					
				}
			};
		}
		return null;
	}
	
	@Override
	public void onLoadFinished(Loader<Cursor> loader, Cursor c) {		
		super.onLoadFinished(loader, c);
		
		adpater.swapCursor(c);
	}
	
	@Override
	public void onLoaderReset(Loader<Cursor> loader) {		
		super.onLoaderReset(loader);
		
		adpater.swapCursor(null);
	}
}
