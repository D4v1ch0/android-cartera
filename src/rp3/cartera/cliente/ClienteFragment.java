package rp3.cartera.cliente;


import android.os.Bundle;
import android.view.View;
import rp3.app.BaseFragment;
import rp3.cartera.R;

public class ClienteFragment extends BaseFragment {

	private ClienteListadoFragment clienteListadoFragment;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_cliente);
		clienteListadoFragment = ClienteListadoFragment.newInstance();
	}
	
	@Override
	public void onFragmentCreateView(View rootView, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onFragmentCreateView(rootView, savedInstanceState);
		
		setFragment(R.id.content_clienteListado, clienteListadoFragment);
	}
	
	@Override
	public void setRetainInstance(boolean retain) {
		// TODO Auto-generated method stub
		super.setRetainInstance(retain);
	}
	
	
}
