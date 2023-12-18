/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

/**
 *
 * @author royma
 */
public class Sekretaris extends Pegawai implements Keterangan{
    //konstruktor
    public Sekretaris() {
        gapok = 3200000;
        T_trans = 25000;
        lembur = 60000;
    }
    
    //abstract method
    @Override
    int hitGaji(int jmlHadir, int jmlembur){
        total = gapok + (jmlHadir * T_trans);
        return total;
    }
    
    @Override
    public String jabatan(){
        return "Sekretaris";
    }
    
    @Override
    public String info(){
        return "Total Gaji Didapat Dari Gaji Pokok dan Uang Transport";
    }
}