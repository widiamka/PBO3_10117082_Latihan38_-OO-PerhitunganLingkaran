/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan38_.oo.perhitunganlingkaran;

/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan perhitungan 
* lingkaran  yang inputannya berasal dari user dengan konsep oop
 */
public class PBO3_10117082_Latihan38_OOPerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Lingkaran lingkar = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        lingkar.validasiInput();
        lingkar.hasilPerhitungan(lingkar.diameter);
    }
    
}
