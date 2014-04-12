package rp3.cartera.cliente;

import java.util.List;

import android.os.Bundle;
import rp3.app.NavActivity;
import rp3.app.nav.NavItem;
import rp3.cartera.R;
import rp3.cartera.db.DbOpenHelper;

public class MainActivity extends NavActivity {

	public final static int NAV_LISTADOCLIENTE  = 1;
	public final static int NAV_RUTACLIENTE  = 2;
	public final static int NAV_CARTERACLIENTE  = 3;
	public final static int NAV_COBRANZACLIENTE  = 4;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setDataBaseParameters(DbOpenHelper.class);
		
		if (savedInstanceState == null)
			setNavigationSelection(NAV_LISTADOCLIENTE);
	}
	
	
	
	
	@Override
	public void navConfig(List<NavItem> navItems, NavActivity currentActivity) {
		// TODO Auto-generated method stub
		super.navConfig(navItems, currentActivity);
		NavItem item_ClienteLista = new NavItem(NAV_LISTADOCLIENTE, getText(R.string.navItem_ClienteLista).toString(),  R.drawable.ic_action_person);
		NavItem item_RutaCliente = new NavItem(NAV_RUTACLIENTE, getText(R.string.navItem_RutaCliente).toString(),  R.drawable.ic_action_map);
		NavItem item_CarteraCliente = new NavItem(NAV_CARTERACLIENTE, getText(R.string.navItem_CarteraCliente).toString(),  R.drawable.ic_action_new_account);
		NavItem item_CobranzaCliente = new NavItem(NAV_COBRANZACLIENTE, getText(R.string.navItem_CobranzaCliente).toString(),  R.drawable.ic_action_cloud);
		
		navItems.add(item_ClienteLista);
		navItems.add(item_RutaCliente);
		navItems.add(item_CarteraCliente);
		navItems.add(item_CobranzaCliente);
		
		
	}
	
	@Override
	public void onNavItemSelected(NavItem item) {
		// TODO Auto-generated method stub
		super.onNavItemSelected(item);
	
		switch (item.getId())
		{
		case NAV_LISTADOCLIENTE:
			setNavFragment(ClienteFragment.newInstance(), item.getTitle());
			break;
		}
	}
	
}
