/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author royma
 */
public class MainPersegiPanjang {
    public static void main(String[]args){
        PersegiPanjang pp1 = new PersegiPanjang();
        System.out.println("Value Konstruktor...");
        System.out.println("Panjang : "+ pp1.p);
        System.out.println("Lebar : "+ pp1.l);
        System.out.println("Value Baru...");
        pp1.p = 25;
        pp1.l = 20;
        System.out.println("Panjang : "+ pp1.p);
        System.out.println("Lebar : "+ pp1.l);
        System.out.println("Luas : "+ pp1.hitLuas());
        System.out.println("Keliling : "+ pp1.hitKeliling());
    }
}
