/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parcial1;

import java.util.Random;


/**
 *
 * @author Camilo
 */
public class Parcial1 {
    public static void main(String[] args) {
        Lista<Robot> listarobots=new Lista<>();
        crearRobots(listarobots);
        System.out.println("datos de los robots:");
        mostrarRobots(listarobots);
        System.out.println("robots con más del 60% de vida:");
        mostrarRobots_masde60(listarobots);
        int robotsConVidaDisminuida=disminuir_vida(listarobots.getInicio());
        System.out.println("número total de robots a los que se les disminuyó el porcentaje de vida: " + robotsConVidaDisminuida);
    }

    public static void crearRobots(Lista<Robot> lista) {
        Random random=new Random();
        int numderobots=random.nextInt(31) + 10; 
        for (int i=0; i<numderobots;i++) {
            int id=i+1;
            String tipo="Tipo "+random.nextInt(5);
            int porcentaje_vida=random.nextInt(91)+10; 
            Robot robot=new Robot(id, tipo, porcentaje_vida);
            if (lista.esVacia()) {
                lista.agregarAlInicio(robot);
            } else {
                Nodo<Robot> actual=lista.getInicio();
                if (robot.getPorcentajeVida()<=actual.getDato().getPorcentajeVida()) {
                    lista.agregarAlInicio(robot);
                } else {
                    lista.agregarAlFinal(robot);
                }
            }
        }
    }

    public static void mostrarRobots(Lista<Robot> lista) {
        if (lista.esVacia()) {
            System.out.println("lista vacía.");
            return;
        }

        Nodo<Robot> actual=lista.getInicio();
        while (actual!=null) {
            System.out.println(actual.getDato());
            actual=actual.getSiguiente();
        }
    }

    public static void mostrarRobots_masde60(Lista<Robot> lista) {
        if (lista.esVacia()) {
            System.out.println("lista vacía.");
            return;
        }

        Nodo<Robot> actual=lista.getInicio();
        int num=0;
        while (actual!=null) {
            Robot robot=actual.getDato();
            if (robot.getPorcentajeVida()>60) {
                System.out.println(robot);
                num++;
            }
            actual=actual.getSiguiente();
        }
        System.out.println("Número de robots con más del 60% de vida: "+num);
    }

    public static int disminuir_vida(Nodo<Robot> nodo) {
        if (nodo==null) {
            return 0;
        }
        Robot robot = nodo.getDato();
        int modificados=0;
        if (robot.getPorcentajeVida()>=30 && robot.getPorcentajeVida()<=50) {
            robot.setPorcentajeVida(robot.getPorcentajeVida()-15);
            modificados++;
        }
        modificados+=disminuir_vida(nodo.getSiguiente());
        return modificados;
    }
}
