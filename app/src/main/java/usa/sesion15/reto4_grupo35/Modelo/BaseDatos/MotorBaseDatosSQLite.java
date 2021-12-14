package usa.sesion15.reto4_grupo35.Modelo.BaseDatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MotorBaseDatosSQLite extends SQLiteOpenHelper {

    public MotorBaseDatosSQLite(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        /* ====================================================================================================== */
        //TABLA FAVORITOS
        db.execSQL("CREATE TABLE favoritos (id INT, titulo TEXT,descripcion TEXT)");
        //---- Registros
        /*
        db.execSQL("INSERT INTO favoritos VALUES ('Blazer','Blazer Cruzado')");
        db.execSQL("INSERT INTO favoritos VALUES ('Gabardina','Tipo tres cuartos')");
        db.execSQL("INSERT INTO favoritos VALUES ('Fracs','Vestido entero')");

         */

        /* ====================================================================================================== */
        //TABLA PRODUCTOS
        db.execSQL("CREATE TABLE productos (imagen INT, titulo TEXT,descripcion TEXT)");
        //---- Registros
        db.execSQL("INSERT INTO productos VALUES (0, 'Chaqueta Masculina','Linea Masculina 2022')");
        db.execSQL("INSERT INTO productos VALUES (1, 'Chaqueta Femenina','Linea Femenina 2022')");
        db.execSQL("INSERT INTO productos VALUES (2, 'Chaqueta Deportiva','Linea Deportiva 2022')");

        /* ====================================================================================================== */
        //TABLA SERVICIOS
        db.execSQL("CREATE TABLE servicios (titulo TEXT,descripcion TEXT)");
        //---- Registros
        db.execSQL("INSERT INTO servicios VALUES ('Ventas','Venta en nuestras sucursales')");
        db.execSQL("INSERT INTO servicios VALUES ('Diseño','Diseños Personalizados')");
        db.execSQL("INSERT INTO servicios VALUES ('Mantenimiento','Arreglo de sus productos')");
        /* ====================================================================================================== */
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE favoritos");
        db.execSQL("DROP TABLE productos");
        db.execSQL("DROP TABLE servicios");
        onCreate(db);

    }
}
