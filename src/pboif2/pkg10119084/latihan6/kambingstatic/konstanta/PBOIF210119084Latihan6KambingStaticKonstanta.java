/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan6.kambingstatic.konstanta;

/**
 *
 * @author 
 * Nama  : Muhammad Idris Merdefi
 * Kelas : PBOIF2
 * NIM   : 10119084
 * Deskripsi Program : Program ini berisi program untuk menampilkan jumlah kambing sattic dan Konstanta
 */
class Mamalia{
    public static int jumlahKambing;
}

public class PBOIF210119084Latihan6KambingStaticKonstanta {
    
    //Nama_Kambing sebagai konstatnta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
      Mamalia.jumlahKambing = 485000;
      System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
       
    }
    
}
