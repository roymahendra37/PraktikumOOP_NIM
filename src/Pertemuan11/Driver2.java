/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan11;

/**
 *
 * @author royma
 */
public class Driver2 {
    public static void main(String[] args) {
        Mahasiswa obj = new Mahasiswa();
        for(int i = 0; i < 3; i++){
            System.out.println("Nama Mahasiswa = "+obj.nama[i]);
        }
        try{
            obj.nama[3] = "unyil";
            System.out.println("Nama yang tertinggal : "+obj.nama[3]); 
        }
        catch(Exception e){
            System.out.println("ERROR MELEBIHI INDEX ARRAY!");
        }
        
    }
}
