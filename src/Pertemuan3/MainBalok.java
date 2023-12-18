/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author royma
 */
public class MainBalok {
    public static void main(String[]args){
        Balok kolam = new Balok();
        System.out.println("Value Konstruktor...");
        System.out.println("Panjang : "+ kolam.p+" meter");
        System.out.println("Lebar : "+ kolam.l+" meter");
        System.out.println("Tinggi : "+ kolam.t+" meter");
        System.out.println("Value Baru...");
        kolam.p = 20;
        kolam.l = 10;
        kolam.t = 2;
        System.out.println("Panjang : "+ kolam.p+" meter");
        System.out.println("Lebar : "+ kolam.l+" meter");
        System.out.println("Tinggi : "+ kolam.t+" meter");
        System.out.println("Volume Kolam : "+ kolam.hitVolume()+" meter kubik");
        System.out.println("Volume Kolam (liter) : "+ kolam.volume*1000+" liter");
    }
}