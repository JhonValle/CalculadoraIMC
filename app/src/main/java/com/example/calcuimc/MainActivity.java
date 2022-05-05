package com.example.calcuimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void Operacion(View view) {
        Intent operaciones =new Intent(MainActivity.this,Operaciones.class);
        startActivity(operaciones);
    }

    public void salud1(View view) {
        Intent salud1 =new Intent(MainActivity.this,Salud.class);
        startActivity(salud1);
    }

    public void salir(View view) {
        finish();
    }
}