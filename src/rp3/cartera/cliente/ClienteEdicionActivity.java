package rp3.cartera.cliente;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import rp3.app.BaseActivity;
import rp3.cartera.R;

public class ClienteEdicionActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cliente_edicion);
		setFragment(R.id.content_clienteEdicion, ClienteEdicionFragment.newInstance());
	}
	
	public static Intent newIntent(Context context, int id){
		Intent f = new Intent(context, ClienteEdicionActivity.class);
		
		return f;
	}
}
