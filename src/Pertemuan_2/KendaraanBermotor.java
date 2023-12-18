/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_2;

/**
 *
 * @author royma
 */
public class KendaraanBermotor {
    // atribut
        int jmlroda;
        String transmisi;
        String warna;
        String berat;
        String bahanbakar;
    // method
        // non void (function)
        String maju()
        {
            return "Hidupkan mesin, gigi1, tekan gas";
        }
        
        // void (procedur)
        void setJudul()
        {
            System.out.println("Belajar Java...");
        }
    // konstruktor

    public KendaraanBermotor() {
        this.jmlroda = 4;
        this.transmisi = "Manual";
        this.warna = "Merah";
        this.berat = "1250 kg";
        this.bahanbakar = "Premium";
    }
        
        
}
