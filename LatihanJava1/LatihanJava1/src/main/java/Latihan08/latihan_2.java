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
public class latihan_2 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double diskon ;
    double harga = 660000;
    double jml, bayar, total;
    
    System.out.print("Harga satuan Printer = 660000 \n");
    
    System.out.print("Jumlah Pembelian = ");
    jml = input.nextDouble();
    bayar = jml*harga;
    //Hitung Diskon 
    if (bayar > 15000000) {
        bayar = jml*harga;
        diskon = bayar*0.15;
        total = bayar-diskon;
        System.out.print("Diskon Yang Diterima = " + diskon);
        System.out.print(" \n");
        System.out.print("Total Yang Dibayar = " + total);
    }
    else{
        System.out.print("Total Yang Dibayar = " + bayar);
        
    }
    
    }
    
    
}
