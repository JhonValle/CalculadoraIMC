package com.example.calcuimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Salud extends AppCompatActivity {
    EditText EtxtAltura,EtxtPeso;
    Button btnCalcular,btnLimpiar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salud);
            EtxtAltura=(EditText) findViewById(R.id.txtAltura);
            EtxtPeso=(EditText) findViewById(R.id.txtPeso);
            btnCalcular=(Button) findViewById(R.id.btnCalcular);
            btnLimpiar=(Button) findViewById(R.id.btnLimpiar);


            btnLimpiar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Limpiar();
                }
            });
            btnCalcular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    CalcularIMC();
                }
            });
        }

        private void Limpiar(){
            EtxtAltura.setText("");
            EtxtPeso.setText("");
        }

        private String MensajeIMC(double IMC){
            String mensaje="";
            if (IMC<16)
                mensaje ="Peso bajo muy grave";
            else if (IMC>=16 & IMC< 16.99)
                mensaje="Peso bajo grave";
            else if (IMC>=17 & IMC< 18.49)
                mensaje="Peso bajo ";
            else if (IMC>=18.50 & IMC< 24.99)
                mensaje="Peso Normal ";
            else if (IMC>=25 & IMC< 29.99)
                mensaje="Sobrepeso ";
            else if (IMC>=30 & IMC< 34.99)
                mensaje="Obesidad Grado I";
            else if (IMC>=35 & IMC< 39.99)
                mensaje="Obesidad Grado II";
            else if (IMC>40)
                mensaje="Obesidad Grado III";
            return mensaje;
        }
        private void CalcularIMC() {

            Double altura=Double.valueOf(EtxtAltura.getText().toString());
            Double peso=Double.valueOf(EtxtPeso.getText().toString());
            double IMC=peso/Math.pow(altura,2);
            Toast.makeText(this,"Tu IMC es"+String.format("%.2f",IMC)+MensajeIMC(IMC), Toast.LENGTH_SHORT).show();

    }

    public void recomendacion(View view) {
            Intent recomendacion1 =new Intent(Salud.this,Recomendaciones.class);
            startActivity(recomendacion1);

    }
}