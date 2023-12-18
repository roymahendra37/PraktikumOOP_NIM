/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

/**
 *
 * @author royma
 */
public class Driver_Mamalia {
    public static void main(String[] args) {
        Mamalia kucing = new Mamalia();
        kucing.berat = 1;
        kucing.tinggi = 50;
        kucing.jmlKaki = 4;
        kucing.warna = "putih";
        System.out.println(kucing.Kelas());
        System.out.println("Berat = "+kucing.berat);
        System.out.println("Tinggi = "+kucing.tinggi);
        System.out.println("Jumlah kaki = "+kucing.jmlKaki);
        System.out.println("Warna = "+kucing.warna);
        System.out.println("Cara bernafas = "+kucing.bernafas());
    }
}
