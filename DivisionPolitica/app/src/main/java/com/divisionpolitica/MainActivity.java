package com.divisionpolitica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void Latacunga(View view)
    {
        Intent pasar = new Intent(MainActivity.this, GalLatacunga.class);
        startActivity(pasar);
    }

    public void Lamana(View view)
    {
        Intent pasar = new Intent(MainActivity.this, GalLaMana.class);
        startActivity(pasar);
    }

    public void Pangua(View view)
    {
        Intent pasar = new Intent(MainActivity.this, GalPangua.class);
        startActivity(pasar);
    }

    public void Pujili(View view)
    {
        Intent pasar = new Intent(MainActivity.this, GalPujili.class);
        startActivity(pasar);
    }

    public void Salcedo(View view)
    {
        Intent pasar = new Intent(MainActivity.this, GalSalcedo.class);
        startActivity(pasar);
    }

    public void Saquisili(View view)
    {
        Intent pasar = new Intent(MainActivity.this, GalSaquisili.class);
        startActivity(pasar);
    }

    public void Sigchos(View view)
    {
        Intent pasar = new Intent(MainActivity.this, GalSigchos.class);
        startActivity(pasar);
    }

}
