/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan10;

/**
 *
 * @author royma
 */
public class DriverInterface {
    public static void main(String[] args) {
        Mamalia manusia = new Mamalia();
        manusia.nama = "Roy";
        System.out.println("nama : "+manusia.nama);
        System.out.println("Dapat berkomunikasi dengan televisi");
        System.out.println(manusia.tekanPower());
        System.out.println(manusia.tekanChannel());
        System.out.println(manusia.tekanVolume());
        System.out.println();
        
    }
}
