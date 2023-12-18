/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;

/**
 *
 * @author royma
 */
public class Karyawan extends Gaji{
    //Atribut
    private String id_karyawan;
    
    //Konstruktor
    public Karyawan() {
    gapok = 3000000;
    }
    
    //method
    String Id_karyawan() { //mendapatkan ID karyawan
    return id_karyawan;
    }
    void Id_karyawan(String Id_karyawan) { //mengatur ID karyawan
    this.id_karyawan = Id_karyawan;
    }
    @Override
    int hitGaji() { // Menghitung total gaji karyawan
    gatot = gapok; // Total gaji adalah gaji pokok
    return gatot;
    }
}
