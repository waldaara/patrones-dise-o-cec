package com.mycompany.mavenproject1.decorator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */
public class CiclistaDecorator extends BaseDecorator {

    public CiclistaDecorator(Transporte transporte) {
        super(transporte);
    }

    @Override
    public void enviar(Articulo articulo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
