/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.decorator;

/**
 *
 * @author Hp
 */
public abstract class BaseDecorator implements Transporte {

    private Transporte transporte;

    public BaseDecorator(Transporte transporte) {
        this.transporte = transporte;
    }
    
  
}
