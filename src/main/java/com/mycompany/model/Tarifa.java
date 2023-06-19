/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author ESTUDIANTE
 */
public class Tarifa {
    
    private int Cod_tarifa;
    private String Tipo_tarifa;
    private double Costo;

    public int getCod_tarifa() {
        return Cod_tarifa;
    }

    public void setCod_tarifa(int Cod_tarifa) {
        this.Cod_tarifa = Cod_tarifa;
    }

    public String getTipo_tarifa() {
        return Tipo_tarifa;
    }

    public void setTipo_tarifa(String Tipo_tarifa) {
        this.Tipo_tarifa = Tipo_tarifa;
    }

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
    }
}
