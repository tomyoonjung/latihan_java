/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanKe3;
import java.util.Scanner;
/**
 *
 * @author Tomi
 */
public class LatScanner {

    /**
     *
     * @param args
     */
    public static void main(String args[])
    {
        // membuat objek baru
    Scanner input = new Scanner(System.in);
    
    String nama;
    int n2;
    double n1, n3;
    
    System.out.print("Masukkan Nama Anda : ");
    nama = input.nextLine();
    System.out.print("Masukkan Nama Nilai 1 : ");
    n1 = input.nextDouble();
    System.out.print("Masukkan Nama Nilai 2 : ");
    n2 = input.nextInt();
    
    n3 = n1 + n2;
    System.out.println("\nNama Anda :" + nama);
    System.out.println("\nNilai Anda :" +n3);
    }
}
       
