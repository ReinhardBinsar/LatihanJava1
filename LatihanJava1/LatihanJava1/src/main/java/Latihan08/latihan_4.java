/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan08;

/**
 *
 * @author HP
 */

import java.util.Scanner;
public class latihan_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double upah = 2500;
        double pajak = 0.15;
        double jam, gajibersih, potonganpajak, total;
        
        System.out.print("Upah Per Jam = 2500 \n");
        System.out.print("Pajak 15% \n");
        System.out.print("Jumlah Jam Kerja = ");
        jam = input.nextDouble();
        gajibersih = jam*upah;
        potonganpajak = gajibersih*pajak;
        total = gajibersih-potonganpajak;
        System.out.print("Total Upah Yang Diterima = " + total);
       
        }
    }
   
