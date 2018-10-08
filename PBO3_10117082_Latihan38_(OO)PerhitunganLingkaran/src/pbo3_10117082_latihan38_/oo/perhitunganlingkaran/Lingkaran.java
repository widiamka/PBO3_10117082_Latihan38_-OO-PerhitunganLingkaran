/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan38_.oo.perhitunganlingkaran;
import java.util.Scanner;
/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan perhitungan 
* lingkaran  yang inputannya berasal dari user dengan konsep oop
 */
public class Lingkaran {
     public double diameter;
    public double jari2;
    Scanner scn = new Scanner(System.in);

    public void validasiInput() {
        String d;
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            d = scn.nextLine();
            System.out.println((!d.matches("[0-9]*"))?"Nilai Diameter Tidak Sesuai\n":"");

        } while (!d.matches("[0-9]*"));
        diameter = Double.parseDouble(d);
    }
    public double hitungJari2(double parDiameter) {
        return parDiameter/2;
    }
    public double hitungLuas(double parJari2) {
        return Math.PI*parJari2*parJari2;
    }
    public double hitungKeliling(double parJari2) {
        return 2*Math.PI*parJari2;
    }
    public void hasilPerhitungan(double parDiameter){
        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.printf("Jari-jari Lingkaran %.2f cm %n",hitungJari2
        (parDiameter));
        System.out.printf("Luas Lingkaran %.2f cm %n",hitungLuas(hitungJari2
        (parDiameter)));
        System.out.printf("Keliling Lingkaran %.2f cm %n",hitungKeliling
        (hitungJari2(parDiameter)));
    }

}
