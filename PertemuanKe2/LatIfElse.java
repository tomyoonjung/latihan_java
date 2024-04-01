/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanKe3;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class LatIfElse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String keterangan,nama;
        int nilai;
        
        System.out.print("Masukkan Nama Siswa");
        nama = input.nextLine();
        System.out.print("Masukkan Nilai Akhir");
        nilai = input.nextInt();
        if(nilai > 70){
            // peritah jika kondisi true
            keterangan = "Lulus";
        }else{
            // peritah jika kondisi false
            keterangan = "Gagal";
                    }
        System.out.println("Hasil Akhir");
        System.out.println("===================================");
        System.out.println("Nama Siswa                :"+nama);
        System.out.println("Nilai Akhir Yang Di Dapat :"+nilai);
        System.out.println("Keterangan                :"+keterangan);
        System.out.println("===================================");  
    }
}
