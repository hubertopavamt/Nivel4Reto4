package usa.sesion15.reto4_grupo35.Vista;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import usa.sesion15.reto4_grupo35.R;
import usa.sesion15.reto4_grupo35.Contolador.MainActivity;

public class SplashScreen extends AppCompatActivity implements Runnable {

    Thread h1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        ImageView caballo = (ImageView)findViewById(R.id.caballo);
        caballo.setBackgroundResource(R.drawable.caballo);

        AnimationDrawable ejecutarAnimacion = (AnimationDrawable)caballo.getBackground();
        ejecutarAnimacion.start();

        //***********************
        h1= new Thread(this);
        h1.start();
        //***********************

    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            Intent pasarPantalla = new Intent(getApplicationContext(), MainActivity.class );
            startActivity(pasarPantalla);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}