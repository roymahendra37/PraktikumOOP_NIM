/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author royma
 */
public class PersegiPanjang {
    //atribut
    int p, l, luas, keliling;
    
    //method
    int hitLuas(){
        luas = p*l;
        return luas;
    }
    int hitKeliling(){
        keliling = 2 * (p+l);
        return keliling;
    }
    
    //konstruktor
    public PersegiPanjang() {
        p = 10;
        l = 8;
    }
    
}
