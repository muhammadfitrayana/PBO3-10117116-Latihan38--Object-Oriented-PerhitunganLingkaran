/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan38.objectoriented.perhitunganlingkaran;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program Perhitungan Lingkaran Berbasis Objek
 *  
 */
public class PBO310117116Latihan38ObjectOrientedPerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hitung lingkar = new hitung();

        System.out.println("=======Perhitungan Lingkaran=======");
        lingkar.validasiInput();
        lingkar.hasilPerhitungan(lingkar.diameter);
    }
    
}
