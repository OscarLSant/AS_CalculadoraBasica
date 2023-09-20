package com.example.a2u1calculadorasimple;

import android.widget.TextView;

public class Calculadora {

    private double ValorA;
    private double ValorB;

    public Calculadora(double vA, double vB) {
        this.ValorA = vA;
        this.ValorB = vB;

    }

    public double sumarValores(){

        double suma = this.getValorA() + this.getValorB();
        return suma;
    }
    public double restarValores(){
        double restar = this.getValorA() - this.getValorB();
        return restar;
    }

    public double multiplicarValores(){
        double multiplicacion = this.getValorA() * this.getValorB();
        return multiplicacion;
    }
    public double dividirValores(){
        double division = this.getValorA() / this.getValorB();
        return division;
    }

    public double getValorA() {
        return ValorA;
    }

    public void setValorA(double valorA) {
        ValorA = valorA;
    }

    public double getValorB() {
        return ValorB;
    }

    public void setValorB(double valorB) {
        ValorB = valorB;
    }
}
