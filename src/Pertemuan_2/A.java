/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_2;

/**
 *
 * @author royma
 */
public class A {
    public static void main(String[]args)
    {
        //KendaraanBermotor mobilA;
        //mobilA = new KendaraanBermotor();
        
        KendaraanBermotor mobilA = new KendaraanBermotor();
        
        mobilA.jmlroda = 10;
        mobilA.setJudul();
        
        
        System.out.println("jumlah roda = " + mobilA.jmlroda);
        System.out.println("Jenis BBM = " + mobilA.bahanbakar);
        System.out.println("Berat Kendaraan = " + mobilA.berat);
        System.out.println("Jenis Transmisi = " + mobilA.transmisi);
        System.out.println("Warna Kendaraan = " + mobilA.warna);
        
    }
}
