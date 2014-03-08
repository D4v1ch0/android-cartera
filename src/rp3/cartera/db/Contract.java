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
	
}
