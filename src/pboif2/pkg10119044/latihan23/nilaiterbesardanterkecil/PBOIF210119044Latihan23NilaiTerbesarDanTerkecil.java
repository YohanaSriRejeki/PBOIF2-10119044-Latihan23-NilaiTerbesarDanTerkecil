/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan23.nilaiterbesardanterkecil;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan nilai terbesar dan 
 * terkecil dari nilai yang diinputkan oleh user
 */
public class PBOIF210119044Latihan23NilaiTerbesarDanTerkecil {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String petugas;
        int i,jumlah,terkecil,terbesar,nilaiMhs[];
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa");
        System.out.print("Masukkan Nama Petugas : ");
        petugas = input.next();
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        jumlah = input.nextInt();
        
        nilaiMhs = new int[jumlah];
        
        for (i=0; i<jumlah; i++){
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+(i+1)+": ");
            nilaiMhs[i] = input.nextInt();
        }
        
        terbesar = nilaiMhs[0];
        terkecil = nilaiMhs[0];
        for (i=0; i<jumlah; i++){
            if (nilaiMhs[i] < terkecil)
                terkecil = nilaiMhs[i];    
            if (nilaiMhs[i] > terbesar){
                terbesar = nilaiMhs[i];
            }
        }
        
        System.out.println();
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        for (i=0; i<jumlah; i++){
            System.out.printf("Nilai Mahasiswa Ke-%1$d = %2$d%n",i+1,nilaiMhs[i]);
        }
        System.out.println();
        System.out.println("Nilai Terbesar adalah "+terbesar);
        System.out.println("Nilai Terkecil adalah "+terkecil);
        System.out.println();
        System.out.println("Petugas : "+petugas);
      
    
    }  
}
