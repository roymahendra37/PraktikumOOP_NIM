/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan10;

/**
 *
 * @author royma
 */
public class Mamalia extends MahklukHidup implements DapatKomunikasiTelevisi {
    int jmlKaki;
    String suara;

    public Mamalia() {
        nama = "Kuda";
    }
    
    @Override
    String Bernafas(){
        return "Bernafas menggunakan paru-paru";
    }

    @Override
    public String tekanPower() {
        return "Tekan Tombol Bulat";
    }

    @Override
    public String tekanChannel() {
        return "Tekan Tombol Segitiga Kanan";
    }

    @Override
    public String tekanVolume() {
        return "Tekan Tombol Segitiga Kiri";
    }
    
}
