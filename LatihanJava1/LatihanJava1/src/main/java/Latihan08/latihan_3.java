/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan08;

/**
 *
 * @author HP
 *
 */

import java.util.Scanner;
public class latihan_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    int upah = 2500;
    int jam ;
    int jml ;
    
    System.out.print ("Gaji per Jam = 2500\n");
    
    System.out.print ("Masukkan jumlah Jam Kerja = \n");
    jam = input.nextInt();
    jml = upah*jam;
   
    System.out.print("Gaji Diterima = " + jml);
    }
    
    
}
