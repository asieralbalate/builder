/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder;

/**
 *
 * @author alu10191634
 */
public abstract class Fries implements Item {
    
    @Override
    public Packing packing() {
        return new Bag();
    }

    @Override
    public abstract float price();
}
