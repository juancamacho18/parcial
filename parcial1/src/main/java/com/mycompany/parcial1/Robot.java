/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;

/**
 *
 * @author Camilo
 */
public class Robot {
    private int id;
    private String tipo;
    private int porcentajeVida;

    public Robot(int id, String tipo, int porcentajeVida) {
        this.id = id;
        this.tipo = tipo;
        this.porcentajeVida = porcentajeVida;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPorcentajeVida() {
        return porcentajeVida;
    }

    public void setPorcentajeVida(int porcentajeVida) {
        this.porcentajeVida = porcentajeVida;
    }

    @Override
    public String toString() {
        return "Robot ID: "+id+", "+tipo+", Vida:"+porcentajeVida+"%";
    }
}
