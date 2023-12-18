/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author royma
 */
public class Gaji {
    //atribut
    int gapok;
    int T_trans;
    int lembur;
    int total;
    
    //konstruktor
    public Gaji() {
        gapok = 3200000;
        T_trans = 25000;
        lembur = 60000;
    }
    
    //method1
    int Gaji(){
        total = gapok;
        return total;
    }
    
    //method2
    int Gaji(int jlmHadir){
        total = gapok + (jlmHadir * T_trans);
        return total;
    }
    
    //method3
    int Gaji(int jlmHadir, int jlmLembur){
        total = gapok + (jlmHadir * T_trans) + (jlmLembur * lembur);
        return total;
    }
}
