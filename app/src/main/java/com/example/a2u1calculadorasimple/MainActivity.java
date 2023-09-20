package com.example.a2u1calculadorasimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.logging.Level;

public class MainActivity extends AppCompatActivity {

    private EditText ValorA;
    private EditText ValorB;
    private TextView Resultado;


    public EditText getValorA() {
        return ValorA;
    }

    public void setValorA(EditText valorA) {
        ValorA = valorA;
    }

    public EditText getValorB() {
        return ValorB;
    }

    public void setValorB(EditText valorB) {
        ValorB = valorB;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void sumarValores(View view) {
        // se hace la asociación
        TextView resultado = findViewById(R.id.Resultado);

        EditText ValorAEdit = findViewById(R.id.ValorA);
        EditText ValorBEdit = findViewById(R.id.ValorB);
        double ValorA = Double.parseDouble(ValorAEdit.getText().toString());
        double ValorB = Double.parseDouble(ValorBEdit.getText().toString());

        Calculadora c1 = new Calculadora(ValorA, ValorB);

        resultado.setText(String.valueOf(c1.sumarValores()));
    }

    public void restarValores(View view) {
        // se hace la asociación
        TextView resultado = findViewById(R.id.Resultado);

        EditText ValorAEdit = findViewById(R.id.ValorA);
        EditText ValorBEdit = findViewById(R.id.ValorB);
        double ValorA = Double.parseDouble(ValorAEdit.getText().toString());
        double ValorB = Double.parseDouble(ValorBEdit.getText().toString());

        Calculadora c1 = new Calculadora(ValorA, ValorB);

        resultado.setText(String.valueOf(c1.restarValores()));
    }

    public void multiplicarValores(View view) {
        // se hace la asociación
        TextView resultado = findViewById(R.id.Resultado);

        EditText ValorAEdit = findViewById(R.id.ValorA);
        EditText ValorBEdit = findViewById(R.id.ValorB);
        double ValorA = Double.parseDouble(ValorAEdit.getText().toString());
        double ValorB = Double.parseDouble(ValorBEdit.getText().toString());

        Calculadora c1 = new Calculadora(ValorA, ValorB);

        resultado.setText(String.valueOf(c1.multiplicarValores()));
    }

    public void dividirValores(View view) {
        // se hace la asociación
        TextView resultado = findViewById(R.id.Resultado);

        EditText ValorAEdit = findViewById(R.id.ValorA);
        EditText ValorBEdit = findViewById(R.id.ValorB);
        double ValorA = Double.parseDouble(ValorAEdit.getText().toString());
        double ValorB = Double.parseDouble(ValorBEdit.getText().toString());

        Calculadora c1 = new Calculadora(ValorA, ValorB);

        resultado.setText(String.valueOf(c1.dividirValores()));
    }



}