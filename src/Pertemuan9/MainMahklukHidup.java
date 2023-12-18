/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;

/**
 *
 * @author royma
 */
public class MainMahklukHidup {
    public static void main(String[] args) {
        
        MahklukHidup MH;
        MH = new Mamalia(); //upcast
        System.out.println(MH.Bernafas()); //1
        
        Mamalia MH1 = (Mamalia) MH; //downcast
        System.out.println(MH1.Bernafas()); //2
        
        MH = new Pisces();
        System.out.println(MH.Bernafas()); //3
        Pisces MH2 = (Pisces) MH;
        System.out.println(MH2.Bernafas()); //4
        // 1 dan 3 polimorfisfe karena kelasnya sama
        
        
//        Mamalia sapi = new Mamalia();
//        Pisces gurami = new Pisces();
//        sapi.setNama("Sapi");
//        System.out.println(sapi.KelasMH(sapi));
//        System.out.println(sapi.KelasMH(gurami));
//        
//        System.out.println(sapi.Bernafas());
//        System.out.println(gurami.Bernafas());
    }
}
