/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.calculocombustivel.util;

/**
 *
 * @author lucas
 */
public class Utilitario {
    
    public double calculoCombustivel(double valorAlcool, double valorGasolina) {
        double resultado = 0d;
        resultado = valorAlcool / valorGasolina;
        return resultado;
    }
    
}
