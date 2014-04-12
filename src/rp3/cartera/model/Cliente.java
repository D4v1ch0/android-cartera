package rp3.cartera.model;

import rp3.db.sqlite.DataBase;

import java.util.Date;

import android.database.Cursor;

import rp3.cartera.db.Contract;
import rp3.data.entity.EntityBase;
import rp3.db.QueryDir;


public class Cliente extends EntityBase<Cliente> {
	
	private int idCliente;
	private String nombres;
	private String apellidos;
	private String razonSocial;
	private String nombreComercial;
	private int idCiudad;
	private String identificacion;
	
	private int idTipoCliente;
	private int idEstructuraPolitica;
	private int idTipoIdentificacion;
	private int idCategoriaCliente;
	private int idActividadCliente;
	private int idGenero;
	private int idEstadoCivil;
	private int idEstadoCliente;
	private String email;
	private Date fechaNacimiento;
	private Date fechaInicioActividad;
	private int plazo;
	private String notas;
	private Double cupoDisponible;
	private Double deudaTotal;
	private Double montoVencido;
	private Double montoPorVencer;
	private Date fechaUltimaCompra;
	private Date fechaUltimoPago;
	private Double valorUltimoPago;
	private String usrIng;
	private String usrMod;
	private Date fecIng;
	private Date fecMod;
	private int idZona;
	private int idEstructuraComercial;
	
	
	@Override
	public long getID() {
		// TODO Auto-generated method stub
		return getIdCliente();
	}
	@Override
	public void setID(long id) {
		// TODO Auto-generated method stub
		setIdCliente((int) id);
	}
	@Override
	public boolean isAutoGeneratedId() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return Contract.Cliente.TABLE_NAME;
	}
	@Override
	public void setValues() {
		// TODO Auto-generated method stub
		setValue(Contract.Cliente.COLUMN_APELLIDOS, this.getApellidos());
		setValue(Contract.Cliente.COLUMN_NOMBRES, this.getNombres());
		setValue(Contract.Cliente.COLUMN_RAZONSOCIAL, this.getRazonSocial());
		setValue(Contract.Cliente.COLUMN_NOMBRECOMERCIAL, this.getNombreComercial());		
		setValue(Contract.Cliente.COLUMN_IDENTIFICACION, this.getIdentificacion());
		setValue(Contract.Cliente.COLUMN_IDTIPOIDENTIFICACION, this.getIdTipoIdentificacion());
		setValue(Contract.Cliente.COLUMN_IDCIUDAD, this.getIdCiudad());
		setValue(Contract.Cliente.COLUMN_IDCIUDAD, this.getIdEstructuraPolitica());
		setValue(Contract.Cliente.COLUMN_IDESTRUCTURACOMERCIAL, this.getIdEstructuraComercial());
		setValue(Contract.Cliente.COLUMN_IDESTADOCLIENTE, this.getIdEstadoCliente());
		setValue(Contract.Cliente.COLUMN_IDESTADOCIVIL, this.getIdEstadoCivil());
		setValue(Contract.Cliente.COLUMN_IDACTIVIDADCLIENTE, this.getIdActividadCliente());
		setValue(Contract.Cliente.COLUMN_IDCATEGORIACLIENTE, this.getIdCategoriaCliente());
		setValue(Contract.Cliente.COLUMN_IDGENERO, this.getIdGenero());
		setValue(Contract.Cliente.COLUMN_IDTIPOCLIENTE, this.getIdTipoCliente());
		setValue(Contract.Cliente.COLUMN_VALORULTIMOPAGO, this.getValorUltimoPago());
		setValue(Contract.Cliente.COLUMN_FECHAULTIMOPAGO, this.getFechaUltimoPago());
		setValue(Contract.Cliente.COLUMN_FECHAULTIMACOMPRA, this.getFechaUltimaCompra());
		setValue(Contract.Cliente.COLUMN_MONTOPORVENCER, this.getMontoPorVencer());
		setValue(Contract.Cliente.COLUMN_MONTOVENCIDO, this.getMontoVencido());
		setValue(Contract.Cliente.COLUMN_DEUDATOTAL, this.getDeudaTotal());
		setValue(Contract.Cliente.COLUMN_CUPODISPONIBLE, this.getCupoDisponible());
		setValue(Contract.Cliente.COLUMN_NOTAS, this.getNotas());
		setValue(Contract.Cliente.COLUMN_PLAZO, this.getPlazo());
		setValue(Contract.Cliente.COLUMN_EMAIL, this.getEmail());
		setValue(Contract.Cliente.COLUMN_FECHAINICIOACTIVIDAD, this.getFechaInicioActividad());
		setValue(Contract.Cliente.COLUMN_FECHANACIMIENTO, this.getFechaNacimiento());
		setValue(Contract.Cliente.COLUMN_USRING, this.getUsrIng());
		setValue(Contract.Cliente.COLUMN_USRMOD, this.getUsrMod());
		setValue(Contract.Cliente.COLUMN_FECING, this.getFecIng());
		setValue(Contract.Cliente.COLUMN_FECMOD, this.getFecMod());
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente= idCliente;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getNombreComercial() {
		return nombreComercial;
	}
	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}
	public int getIdCiudad() {
		return idCiudad;
	}
	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public int getIdTipoCliente() {
		return idTipoCliente;
	}
	public void setIdTipoCliente(int idTipoCliente) {
		this.idTipoCliente = idTipoCliente;
	}
	public int getIdEstructuraPolitica() {
		return idEstructuraPolitica;
	}
	public void setIdEstructuraPolitica(int idEstructuraPolitica) {
		this.idEstructuraPolitica = idEstructuraPolitica;
	}
	public int getIdTipoIdentificacion() {
		return idTipoIdentificacion;
	}
	public void setIdTipoIdentificacion(int idTipoIdentificacion) {
		this.idTipoIdentificacion = idTipoIdentificacion;
	}
	public int getIdCategoriaCliente() {
		return idCategoriaCliente;
	}
	public void setIdCategoriaCliente(int idCategoriaCliente) {
		this.idCategoriaCliente = idCategoriaCliente;
	}
	public int getIdActividadCliente() {
		return idActividadCliente;
	}
	public void setIdActividadCliente(int idActividadCliente) {
		this.idActividadCliente = idActividadCliente;
	}
	public int getIdGenero() {
		return idGenero;
	}
	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}
	public int getIdEstadoCivil() {
		return idEstadoCivil;
	}
	public void setIdEstadoCivil(int idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}
	public int getIdEstadoCliente() {
		return idEstadoCliente;
	}
	public void setIdEstadoCliente(int idEstadoCliente) {
		this.idEstadoCliente = idEstadoCliente;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Date getFechaInicioActividad() {
		return fechaInicioActividad;
	}
	public void setFechaInicioActividad(Date fechaInicioActividad) {
		this.fechaInicioActividad = fechaInicioActividad;
	}
	public int getPlazo() {
		return plazo;
	}
	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
	public String getNotas() {
		return notas;
	}
	public void setNotas(String notas) {
		this.notas = notas;
	}
	public Double getCupoDisponible() {
		return cupoDisponible;
	}
	public void setCupoDisponible(Double cupoDisponible) {
		this.cupoDisponible = cupoDisponible;
	}
	public Double getDeudaTotal() {
		return deudaTotal;
	}
	public void setDeudaTotal(Double deudaTotal) {
		this.deudaTotal = deudaTotal;
	}
	public Double getMontoVencido() {
		return montoVencido;
	}
	public void setMontoVencido(Double montoVencido) {
		this.montoVencido = montoVencido;
	}
	public Double getMontoPorVencer() {
		return montoPorVencer;
	}
	public void setMontoPorVencer(Double montoPorVencer) {
		this.montoPorVencer = montoPorVencer;
	}
	public Date getFechaUltimaCompra() {
		return fechaUltimaCompra;
	}
	public void setFechaUltimaCompra(Date fechaUltimaCompra) {
		this.fechaUltimaCompra = fechaUltimaCompra;
	}
	public Date getFechaUltimoPago() {
		return fechaUltimoPago;
	}
	public void setFechaUltimoPago(Date fechaUltimoPago) {
		this.fechaUltimoPago = fechaUltimoPago;
	}
	public Double getValorUltimoPago() {
		return valorUltimoPago;
	}
	public void setValorUltimoPago(Double valorUltimoPago) {
		this.valorUltimoPago = valorUltimoPago;
	}
	public String getUsrIng() {
		return usrIng;
	}
	public void setUsrIng(String usrIng) {
		this.usrIng = usrIng;
	}
	public String getUsrMod() {
		return usrMod;
	}
	public void setUsrMod(String usrMod) {
		this.usrMod = usrMod;
	}
	public Date getFecIng() {
		return fecIng;
	}
	public void setFecIng(Date fecIng) {
		this.fecIng = fecIng;
	}
	public Date getFecMod() {
		return fecMod;
	}
	public void setFecMod(Date fecMod) {
		this.fecMod = fecMod;
	}
	public int getIdZona() {
		return idZona;
	}
	public void setIdZona(int idZona) {
		this.idZona = idZona;
	}
	public int getIdEstructuraComercial() {
		return idEstructuraComercial;
	}
	public void setIdEstructuraComercial(int idEstructuraComercial) {
		this.idEstructuraComercial = idEstructuraComercial;
	}
	public static Cursor getClientesCursor(DataBase db){
		Cursor c = db.query(Contract.Cliente.TABLE_NAME, 
				new String[] { Contract.Cliente._ID, Contract.Cliente.FIELD_NOMBRES,
				Contract.Cliente.FIELD_APELLIDOS, Contract.Cliente.FIELD_IDENTIFICACION, Contract.Cliente.FIELD_DEUDATOTAL, Contract.Cliente.FIELD_MONTOVENCIDO});
		
		return c;
	}

}
