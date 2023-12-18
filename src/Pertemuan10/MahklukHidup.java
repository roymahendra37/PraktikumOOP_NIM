/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan10;

import Pertemuan9.Mamalia;
import Pertemuan9.Pisces;

/**
 *
 * @author royma
 */
public abstract class MahklukHidup {
    String nama;

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    abstract String Bernafas();
    
    String KelasMH(Mamalia A){
        return nama + " Adalah mahkluk hidup kelas Mamalia";
    }
    
    String KelasMH(Pisces A){
        return nama + " Adalah mahkluk hidup kelas Pisces";
    }
}
