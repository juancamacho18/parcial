/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;

/**
 *
 * @author Camilo
 */
public class Lista<T> {
    private Nodo inicio;
    private int elemento;
    
    public void Lista(){
        inicio=null;
        elemento=0;
    }
    
    public Nodo getInicio(){
        return inicio;
    }
    
    public boolean esVacia(){
        return inicio==null;  
    }
    
    public int getElemento(){
        return elemento;  
    }
    
    public void agregarAlInicio (T dato){
        Nodo nuevo= new Nodo();   
        nuevo.setDato(dato);      
        if (esVacia()){
            inicio=nuevo;        
        }else{
            nuevo.setSiguiente(inicio); 
            inicio=nuevo; 
        }
        elemento++;
    }
    
    public void agregarAlFinal(T dato){
        Nodo nuevo= new Nodo();   
        nuevo.setDato(dato);      
        if (esVacia()){
            inicio=nuevo;       
        }else{
            Nodo auxiliar=inicio;    
            while (auxiliar.getSiguiente()!=null){
                auxiliar=auxiliar.getSiguiente();  
            }
            auxiliar.setSiguiente(nuevo); 
        }
        elemento++;  
    } 
}
