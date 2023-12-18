/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_2;

/**
 *
 * @author royma
 */
public class MainGFX {
    public static void main(String[]args){
        //membuat objek
        GuitarFX DigitalFX = new GuitarFX();
        DigitalFX.merek = "NUX";
        DigitalFX.tipe = "MG300";
        DigitalFX.jenis = "Multi-FX";
        DigitalFX.jmlFX = 20;
        DigitalFX.jmlKNOB = 4;
        System.out.println("\tGUITAR EFFECTS");
        System.out.println("Merek : "+ DigitalFX.merek);
        System.out.println("Tipe : "+ DigitalFX.tipe);
        System.out.println("Jenis : "+ DigitalFX.jenis);
        System.out.println("Jumlah Effects : "+ DigitalFX.jmlFX);
        System.out.println("Jumlah Knob : "+ DigitalFX.jmlKNOB);
        System.out.println("GUITAR EFFECTS ON...");
        System.out.println("Distorsion -> " + DigitalFX.DistorsionFX("ON"));
        System.out.println("Delay -> " + DigitalFX.DelayFX("OFF"));
        System.out.println("Reverb -> " + DigitalFX.ReverbFX("ON"));
        System.out.println("Chorus -> " + DigitalFX.ChorusFX("OFF"));
    }
}
