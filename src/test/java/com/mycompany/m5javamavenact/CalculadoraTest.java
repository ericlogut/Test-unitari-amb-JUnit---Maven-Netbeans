/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.m5javamavenact;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ericl
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testSumar() {
        int num1 = 2;
        int num2 = 3;
        int resultado = Calculadora.sumar(num1, num2);
        assertEquals(5, resultado);
        System.out.println("El resultat de "+num1+" + "+num2+": " + resultado);
    }

    @Test
    public void testRestar() {
        int num1 = 5;
        int num2 = 3;
        int resultado = Calculadora.restar(num1, num2);
        assertEquals(2, resultado);
        System.out.println("El resultat de "+num1+" - "+num2+": " + resultado);
    }
    
}
