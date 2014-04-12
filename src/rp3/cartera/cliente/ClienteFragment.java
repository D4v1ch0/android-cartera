package rp3.cartera.cliente;


import android.database.Cursor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import rp3.app.BaseFragment;
import rp3.cartera.R;
import rp3.content.SimpleCursorLoader;

public class ClienteFragment extends BaseFragment {

	private ClienteListadoFragment clienteListadoFragment;
	
	public static ClienteFragment newInstance(){
		ClienteFragment  f = new ClienteFragment();
		
		return f;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_cliente, R.menu.fragment_cliente);
		clienteListadoFragment = ClienteListadoFragment.newInstance();
	}
	
	@Override
	public void onFragmentCreateView(View rootView, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onFragmentCreateView(rootView, savedInstanceState);
		
		setFragment(R.id.content_clienteListado, clienteListadoFragment);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
		
		case R.id.action_new:
			startActivity(ClienteEdicionActivity.newIntent(getContext(), 0));
			return true;
			
		}
		
		
		return super.onOptionsItemSelected(item);
	}
	
}
