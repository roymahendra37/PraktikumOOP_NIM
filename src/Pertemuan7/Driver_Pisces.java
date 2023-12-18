/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

/**
 *
 * @author royma
 */
public class Driver_Pisces {
    public static void main(String[] args) {
        Pisces mujair = new Pisces();
        mujair.berat = 1;
        mujair.tinggi = 50;
        mujair.jmlSirip = 4;
        mujair.warna = "silver kombinasi";
        System.out.println(mujair.Kelas());
        System.out.println("Berat = "+mujair.berat);
        System.out.println("Tinggi = "+mujair.tinggi);
        System.out.println("Jumlah sirip = "+mujair.jmlSirip);
        System.out.println("Warna = "+mujair.warna);
        System.out.println("Cara bernafas = "+mujair.bernafas());
    }
}
