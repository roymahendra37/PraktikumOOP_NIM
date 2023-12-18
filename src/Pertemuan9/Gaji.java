/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;

/**
 *
 * @author royma
 */
public class Gaji {
    //Atribut
    public String Nama;
    public int gapok, t_hadir, j_lembur, gatot, jmlhadir,jmlembur;

    // Konstruktor
    public Gaji() {
    gapok = 3000000;
    t_hadir = 15000;
    j_lembur = 25000; 
    jmlhadir = 0;
    jmlembur = 0;
    }
    //method
    public String Nama() { //mendapatkan namakaryawan
    return Nama;
    }
    public void Nama(String Nama) { //mengatur nama karyawan
    this.Nama = Nama;
    }
    public void Jmlhadir(int jmlhadir) { //mengatur jumlah kehadiran
    this.jmlhadir = jmlhadir;
    }
    public void Jlembur(int jmlembur) { //mengaturjumlah lembur
    this.jmlembur = jmlembur;
    }
    int hitGaji() { // Menghitung total gaji
    return gatot;
    }
}
