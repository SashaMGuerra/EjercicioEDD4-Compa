/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd4;

import java.util.Scanner;

/**
 *
 * @author David Aparicio Sir
 * Modificado por Sasha.
 * In this program we try the conditional if and the loop for.
 * It asks the user for a number. If it's 7, displays it; if it's more than seven, displays all numbers between that and 7.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Here it's the definition of the variables;
        Scanner reader = new Scanner(System.in);
        int n;
        
        //Number introduction;
        System.out.println("Introduce un número: ");
        n = reader.nextInt();
        //Here it's the conditional if
        if (n == 7) {
            System.out.println("Ha introducido el 7");
        }
        else if (n>7) {
            for(int i=n;i>=7;i--){
                System.out.println(i);
            }
        }

    }
}
