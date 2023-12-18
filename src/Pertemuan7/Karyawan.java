/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

/**
 *
 * @author royma
 */
public class Karyawan extends Pegawai implements Keterangan{
    //konstruktor
    public Karyawan() {
        gapok = 3200000;
    }
    
    //abstract method
    @Override
    int hitGaji(int jmlHadir, int jmlembur){
        total = gapok;
        return total;
    }
    
    @Override
    public String jabatan(){
        return "Karyawan";
    }
    
    @Override
    public String info(){
        return "Total Gaji Didapat Dari Gaji Pokok";
    }
}
