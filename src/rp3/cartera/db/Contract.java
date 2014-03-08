package rp3.cartera.db;

import android.provider.BaseColumns;

public class Contract {
	public abstract class CategoriaCliente implements BaseColumns {

		public static final String TABLE_NAME = "tbCategoriaCliente";

		public static final String COLUMN_NOMBRE = "Nombre";

		public static final String FIELD_NOMBRE = COLUMN_NOMBRE;

		public static final String COLUMN_ACTIVO = "Activo";

		public static final String FIELD_ACTIVO = COLUMN_ACTIVO;

		public static final String CONDITION_ACTIVE = COLUMN_ACTIVO + " = ?";
	}

	public abstract class TipoCliente implements BaseColumns {

		public static final String TABLE_NAME = "tbTipoCliente";

		public static final String COLUMN_NOMBRE = "Nombre";

		public static final String FIELD_NOMBRE = COLUMN_NOMBRE;

		public static final String COLUMN_ACTIVO = "Activo";

		public static final String FIELD_ACTIVO = COLUMN_ACTIVO;

		public static final String CONDITION_ACTIVE = COLUMN_ACTIVO + " = ?";
	}

	public abstract class Zona implements BaseColumns {

		public static final String TABLE_NAME = "tbZona";

		public static final String COLUMN_NOMBRE = "Nombre";

		public static final String FIELD_NOMBRE = COLUMN_NOMBRE;

		public static final String COLUMN_ACTIVO = "Activo";

		public static final String FIELD_ACTIVO = COLUMN_ACTIVO;

		public static final String CONDITION_ACTIVE = COLUMN_ACTIVO + " = ?";
	}

	public abstract class EstructuraComercial implements BaseColumns {

		public static final String TABLE_NAME = "tbEstructuraComercial";

		public static final String COLUMN_NOMBRE = "Nombre";

		public static final String FIELD_NOMBRE = COLUMN_NOMBRE;

		public static final String COLUMN_ACTIVO = "Activo";

		public static final String FIELD_ACTIVO = COLUMN_ACTIVO;

		public static final String CONDITION_ACTIVE = COLUMN_ACTIVO + " = ?";
	}

	public abstract class ActividadCliente implements BaseColumns {

		public static final String TABLE_NAME = "tbActividadCliente";

		public static final String COLUMN_NOMBRE = "Nombre";

		public static final String FIELD_NOMBRE = COLUMN_NOMBRE;

		public static final String COLUMN_ACTIVO = "Activo";

		public static final String FIELD_ACTIVO = COLUMN_ACTIVO;

		public static final String CONDITION_ACTIVE = COLUMN_ACTIVO + " = ?";
	}

	public abstract class EstadoCivil implements BaseColumns {

		public static final String TABLE_NAME = "tbEstadoCivil";

		public static final String COLUMN_NOMBRE = "Nombre";

		public static final String FIELD_NOMBRE = COLUMN_NOMBRE;

		public static final String COLUMN_ACTIVO = "Activo";

		public static final String FIELD_ACTIVO = COLUMN_ACTIVO;

		public static final String CONDITION_ACTIVE = COLUMN_ACTIVO + " = ?";
	}

	public abstract class Genero implements BaseColumns {

		public static final String TABLE_NAME = "tbGenero";

		public static final String COLUMN_NOMBRE = "Nombre";

		public static final String FIELD_NOMBRE = COLUMN_NOMBRE;

		public static final String COLUMN_ACTIVO = "Activo";

		public static final String FIELD_ACTIVO = COLUMN_ACTIVO;

		public static final String CONDITION_ACTIVE = COLUMN_ACTIVO + " = ?";
	}

	public abstract class TipoIdentificacion implements BaseColumns {

		public static final String TABLE_NAME = "tbTipoIdentificacion";

		public static final String COLUMN_NOMBRE = "Nombre";

		public static final String FIELD_NOMBRE = COLUMN_NOMBRE;

		public static final String COLUMN_ACTIVO = "Activo";

		public static final String FIELD_ACTIVO = COLUMN_ACTIVO;

		public static final String CONDITION_ACTIVE = COLUMN_ACTIVO + " = ?";
	}

	public abstract class Cliente implements BaseColumns {

		public static final String TABLE_NAME = "tbCliente";

		public static final String COLUMN_NOMBRES = "Nombres";

		public static final String FIELD_NOMBRES = COLUMN_NOMBRES;

		public static final String COLUMN_APELLIDOS = "Apellidos";

		public static final String FIELD_APELLIDOS = COLUMN_APELLIDOS;

		public static final String COLUMN_RAZONSOCIAL = "RazonSocial";

		public static final String FIELD_RAZONSOCIAL = COLUMN_RAZONSOCIAL;

		public static final String COLUMN_NOMBRECOMERCIAL = "NombreComercial";

		public static final String FIELD_NOMBRECOMERCIAL = COLUMN_NOMBRECOMERCIAL;

		public static final String COLUMN_IDCIUDAD = "IdCiudad";

		public static final String FIELD_IDCIUDAD = COLUMN_IDCIUDAD;

		public static final String COLUMN_IDTIPOCLIENTE = "IdTipoCliente";

		public static final String FIELD_IDTIPOCLIENTE = COLUMN_IDTIPOCLIENTE;

		public static final String COLUMN_IDESTRUCTURACOMERCIAL = "IdEstructuraComercial";

		public static final String FIELD_IDESTRUCTURACOMERCIAL = COLUMN_IDESTRUCTURACOMERCIAL;

		public static final String COLUMN_IDTIPOIDENTIFICACION = "IdTipoIdentificacion";

		public static final String FIELD_IDTIPOIDENTIFICACION = COLUMN_IDTIPOIDENTIFICACION;

		public static final String COLUMN_IDCATEGORIACLIENTE = "IdCategoriaCliente";

		public static final String FIELD_IDCATEGORIACLIENTE = COLUMN_IDCATEGORIACLIENTE;

		public static final String COLUMN_IDACTIVIDADCLIENTE = "IdActividadCliente";

		public static final String FIELD_IDACTIVIDADCLIENTE = COLUMN_IDACTIVIDADCLIENTE;

		public static final String COLUMN_IDGENERO = "IdGenero";

		public static final String FIELD_IDGENERO = COLUMN_IDGENERO;

		public static final String COLUMN_IDESTADOCIVIL = "IdEstadoCivil";

		public static final String FIELD_IDESTADOCIVIL = COLUMN_IDESTADOCIVIL;

		public static final String COLUMN_IDESTADOCLIENTE = "IdEstadoCliente";

		public static final String FIELD_IDESTADOCLIENTE = COLUMN_IDESTADOCLIENTE;

		public static final String COLUMN_EMAIL = "Email";

		public static final String FIELD_EMAIL = COLUMN_EMAIL;

		public static final String COLUMN_FECHANACIMIENTO = "FechaNacimiento";

		public static final String FIELD_FECHANACIMIENTO = COLUMN_FECHANACIMIENTO;

		public static final String COLUMN_FECHAINICIOACTIVIDAD = "FechaInicioActividad";

		public static final String FIELD_FECHAINICIOACTIVIDAD = COLUMN_FECHAINICIOACTIVIDAD;

		public static final String COLUMN_PLAZO = "Plazo";

		public static final String FIELD_PLAZO = COLUMN_PLAZO;

		public static final String COLUMN_NOTAS = "Notas";

		public static final String FIELD_NOTAS = COLUMN_NOTAS;

		public static final String COLUMN_CUPODISPONIBLE = "CupoDisponible";

		public static final String FIELD_CUPODISPONIBLE = COLUMN_CUPODISPONIBLE;

		public static final String COLUMN_DEUDATOTAL = "DeudaTotal";

		public static final String FIELD_DEUDATOTAL = COLUMN_DEUDATOTAL;
		
		public static final String COLUMN_MONTOVENCIDO = "MontoVencido";

		public static final String FIELD_MONTOVENCIDO = COLUMN_MONTOVENCIDO;
		
		public static final String COLUMN_MONTOPORVENCER = "MontoPorVencer";

		public static final String FIELD_MONTOPORVENCER = COLUMN_MONTOPORVENCER;
		
		public static final String COLUMN_FECHAULTIMACOMPRA = "FechaUltimaCompra";

		public static final String FIELD_FECHAULTIMACOMPRA = COLUMN_FECHAULTIMACOMPRA;
		
		public static final String COLUMN_FECHAULTIMOPAGO = "FechaUltimoPago";

		public static final String FIELD_FECHAULTIMOPAGO = COLUMN_FECHAULTIMOPAGO;
		
		public static final String COLUMN_ULTIMOPAGO = "UltimoPago";

		public static final String FIELD_ULTIMOPAGO = COLUMN_ULTIMOPAGO;
		
		public static final String COLUMN_USRING = "UsrIng";

		public static final String FIELD_USRING = COLUMN_USRING;
		
		public static final String COLUMN_FECING = "FecIng";

		public static final String FIELD_FECING = COLUMN_FECING;

		public static final String COLUMN_USRMOD = "UsrMod";

		public static final String FIELD_USRMOD = COLUMN_USRMOD;
		
		public static final String COLUMN_FECMOD = "FecMod";

		public static final String FIELD_FECMOD = COLUMN_FECMOD;

	}
	
	
}
