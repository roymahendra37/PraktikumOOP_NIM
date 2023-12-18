/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author royma
 */
public class MainKeramik {
        public static void main(String[] args) 
    {
        PersegiPanjang obj = new PersegiPanjang();
        obj.p = 7;
        obj.l = 3;
        int luasAlas = obj.hitLuas();
        
        obj.p = 7;
        obj.l = 1;
        int luasSamping = 2 * (obj.hitLuas());
        
        obj.p = 3;
        obj.l = 1;
        int luasDepan = 2 * (obj.hitLuas());
        
        int luasTotal = luasAlas + luasSamping + luasDepan;
        System.out.println("Luas Total Permukaan = "+luasTotal+" meter");
        
        int luasKeramik = 50 * 50;
        
        double jumlahKeramik = (luasTotal * 10000 / luasKeramik);
        
        System.out.println("Jumlah Keramik Yang Dibutuhkan = " +jumlahKeramik + " Keping ");
    }
}
