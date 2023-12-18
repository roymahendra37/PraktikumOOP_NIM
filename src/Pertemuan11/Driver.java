/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan11;

/**
 *
 * @author royma
 */
public class Driver {
    public static void main(String[] args) {
        Pembagian obj = new Pembagian();
        
        obj.bil1 = 10;
        obj.bil2 = 0;
        try{
            System.out.println("Hasil bagi : "+obj.bagi());
        }
        catch(Exception e){
            System.out.println("ERROR KARENA DIBAGI 0!");
        }
    }
}
