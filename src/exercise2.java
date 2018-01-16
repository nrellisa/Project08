/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer_User
 */
import java.util.Scanner;
public class exercise2 {
public static void main(String[] args){
Scanner input = new Scanner (System.in);

    
    double no1;
    double no3;
    double tambah;
    double tolak;
    double darab;
    double bahagi;
    
    System.out.println("Masukkan nombor pertama: ");
    no1=input.nextDouble();
    
    System.out.println("Masukkan nombor kedua: ");
    no3=input.nextDouble();
    
    tambah=no1+no3;
    tolak=no1-no3;
    darab=no1*no3;
    bahagi=no1/no3;
    
    System.out.println("jumlah tambah: "+tambah);
    System.out.println("jumlah tolak: "+tolak);
    System.out.println("jumlah darab: "+darab);
    System.out.println("jumlah bahagi: "+bahagi);
}
}
