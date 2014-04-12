package rp3.cartera.cliente;


import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.content.Loader;
import android.view.View;
import android.widget.SimpleCursorAdapter;
import rp3.app.BaseListFragment;
import rp3.cartera.R;
import rp3.cartera.db.Contract;
import rp3.content.SimpleCursorLoader;
import rp3.db.sqlite.DataBase;


public class ClienteListadoFragment extends BaseListFragment {

	SimpleCursorAdapter adpater;
	private static final int LOADER_CLIENTES = 1;
	
	public static ClienteListadoFragment newInstance(){
		ClienteListadoFragment  f = new ClienteListadoFragment();
		
		return f;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {		
		super.onCreate(savedInstanceState);
		adpater = new SimpleCursorAdapter(getContext(), R.layout.rowlist_cliente, null, new String[] {Contract.Cliente.FIELD_NOMBRES, Contract.Cliente.FIELD_IDENTIFICACION, Contract.Cliente.FIELD_DEUDATOTAL, Contract.Cliente.FIELD_MONTOVENCIDO}, new int[] { R.id.textView_nombres, R.id.textView_identificacion, R.id.textView_deudaTotal, R.id.textView_montoVencido}, 0 );		 
	}	
	
	@Override
	public void onFragmentCreateView(View rootView, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onFragmentCreateView(rootView, savedInstanceState);	
		
		setListAdapter(adpater);
	}
	
	public void refrescarListado(){
		getLoaderManager().restartLoader(LOADER_CLIENTES, null, this);
	}
	
	
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {		
		super.onActivityCreated(savedInstanceState);
		DataBase db = getDataBase();
		executeLoader(LOADER_CLIENTES, null, this);
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
		this.notifyListChanged();
	}
	
	@Override
	public void onLoaderReset(Loader<Cursor> loader) {		
		super.onLoaderReset(loader);
		
		adpater.swapCursor(null);
		this.notifyListChanged();
	}
}
