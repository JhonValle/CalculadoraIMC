package com.example.calcuimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Recomendaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recomendaciones);
    }

    public void R1(View view) {
        Intent recomendacion1 =new Intent(Recomendaciones.this,PesobajomuyGrave.class);
        startActivity(recomendacion1);
    }

    public void R2(View view) {
        Intent recomendacion2 =new Intent(Recomendaciones.this,PesobajoGrave.class);
        startActivity(recomendacion2);
    }

    public void R3(View view) {
        Intent recomendacion3 =new Intent(Recomendaciones.this,Pesobajo.class);
        startActivity(recomendacion3);
    }

    public void R4(View view) {
        Intent recomendacion4 =new Intent(Recomendaciones.this,PesoNormal.class);
        startActivity(recomendacion4);
    }

    public void R5(View view) {
        Intent recomendacion5 =new Intent(Recomendaciones.this,Sobrepeso.class);
        startActivity(recomendacion5);
    }

    public void R6(View view) {
        Intent recomendacion6 =new Intent(Recomendaciones.this,ObesidadGrado1.class);
        startActivity(recomendacion6);
    }

    public void R7(View view) {
        Intent recomendacion7 =new Intent(Recomendaciones.this,ObesidadGrado2.class);
        startActivity(recomendacion7);
    }

    public void R8(View view) {
        Intent recomendacion8 =new Intent(Recomendaciones.this,ObesidadGrado3.class);
        startActivity(recomendacion8);
    }
}