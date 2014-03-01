package rp3.cartera.model;

import rp3.data.entity.EntityBase;

public class Cliente extends EntityBase<Cliente> {
	
	private long id;
	private String nombres;
	private String identificacion;
	private int idCategoriaCliente;
	private int idTipoCliente;
	private int idEstructuraPolitica;
	private int idZona;
	private int idEstructuraComercial;
	
	
	@Override
	public long getID() {
		// TODO Auto-generated method stub
		return id;
	}
	@Override
	public void setID(long id) {
		// TODO Auto-generated method stub
		this.id = id;
	}
	@Override
	public boolean isAutoGeneratedId() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setValues() {
		// TODO Auto-generated method stub
		
	}
	

}