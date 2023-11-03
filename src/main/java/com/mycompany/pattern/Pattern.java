/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pattern;

/**
 *
 * @author MolokoSehata
 */
public class Pattern {

    public static void main(String[] args) {
         int rows = 4;
        
        int i = 1;
        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }       
    }
}
