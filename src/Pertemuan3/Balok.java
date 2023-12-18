/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author royma
 */
public class Balok extends PersegiPanjang {
    //atribut
    int t, volume;
    
    //method
    int hitVolume(){
        volume = hitLuas()*t;
        return volume;
    }

    //konstruktor
    public Balok() {
        p = 5; 
        l = 3;
        t = 2;
    }
}
