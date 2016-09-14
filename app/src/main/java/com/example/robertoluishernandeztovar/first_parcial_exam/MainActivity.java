package com.example.robertoluishernandeztovar.first_parcial_exam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void calcular(View view) {
        EditText n1 = (EditText) findViewById(R.id.n1);
        EditText n2 = (EditText) findViewById(R.id.n2);
        TextView comp = (TextView) findViewById(R.id.lytcomparacion);
        TextView sum = (TextView) findViewById(R.id.lytsuma);
        TextView rest = (TextView) findViewById(R.id.lytresta);
        TextView mult = (TextView) findViewById(R.id.lytmulti);
        TextView msj = (TextView) findViewById(R.id.mensaje);


        int numero1 = Integer.parseInt(n1.getText().toString());
        int numero2 = Integer.parseInt(n2.getText().toString());
        int cero = 0;


        if (numero2 == cero) {
            msj.setText(String.valueOf("ERRROR, PLEASE CLEAN AND AGAIN"));

        } else {

            int resultadomulti = numero1 * numero2;
            mult.setText(String.valueOf("" + resultadomulti));

            int resultadoresta = numero1 - numero2;
            rest.setText(String.valueOf("" + resultadoresta));

            int resultado = numero1 + numero2;
            sum.setText(String.valueOf("" + resultado));


            if (numero1 == numero2) {
                comp.setText(String.valueOf(numero1 + "=" + numero2));
            } else if (numero1 < numero2) {
                comp.setText(String.valueOf(numero1 + "<" + numero2));
            } else if (numero1 > numero2) {
                comp.setText(String.valueOf(numero1 + ">" + numero2));
            }
        }
    }

    public void limpiar (View view) {
        String msj;
        msj = "";

        TextView sum = (TextView) findViewById(R.id.lytsuma);
        TextView comp = (TextView) findViewById(R.id.lytcomparacion);
        TextView mensj = (TextView) findViewById(R.id.mensaje);
        TextView mult = (TextView) findViewById(R.id.lytmulti);
        TextView rest = (TextView) findViewById(R.id.lytresta);


        sum.setText(msj);
        comp.setText(msj);
        mensj.setText(msj);
        mult.setText(msj);
        rest.setText(msj);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}