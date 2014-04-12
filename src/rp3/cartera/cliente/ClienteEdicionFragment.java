package rp3.cartera.cliente;

import android.os.Bundle;
import rp3.app.BaseFragment;
import rp3.cartera.R;

public class ClienteEdicionFragment extends BaseFragment {

	public static ClienteEdicionFragment newInstance(){
		ClienteEdicionFragment  f = new ClienteEdicionFragment();
		
		return f;
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_cliente_edicion);
	}
}
