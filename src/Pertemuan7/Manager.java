/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

/**
 *
 * @author royma
 */
public class Manager extends Pegawai implements Keterangan{
    //konstruktor
    public Manager() {
        gapok = 3200000;
        T_trans = 25000;
        lembur = 60000;
    }
    
    //abstract method
    @Override
    int hitGaji(int jmlHadir, int jmlLembur){
        total = gapok + (jmlHadir * T_trans) + (jmlLembur * lembur);;
        return total;
    }
    
    @Override
    public String jabatan(){
        return "Manager";
    }
    
    @Override
    public String info(){
        return "Total Gaji Didapat Dari Gaji Pokok, Uang Transport dan Bonus Lembur";
    }
}