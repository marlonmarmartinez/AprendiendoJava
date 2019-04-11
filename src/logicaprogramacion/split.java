/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaprogramacion;

import java.util.Arrays;

/**
 *
 * @author Lnv
 */
public class split {
    public static void main(String[] args) {
        String palabra="marlon martinez";
        String[]palabras=palabra.split(" ");
        System.out.println(Arrays.toString(palabras));
    }
}
