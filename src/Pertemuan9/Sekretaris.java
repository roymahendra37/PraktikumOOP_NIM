/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;

/**
 *
 * @author royma
 */
public class Sekretaris extends Gaji{
     //atribut
     private String id_sekertaris;
     
     //konstructor
     public Sekretaris() {
     gapok = 3300000;
     t_hadir = 15000;
     }
     
     //method
     void Id_sekertaris(String Id_sekertaris) { //mengatur ID sekretaris
     this.id_sekertaris = Id_sekertaris;
     }
     String Id_sekertaris() { //mendapatkan ID sekretaris
     return id_sekertaris;
     }
     @Override
     int hitGaji() { // Menghitung total gaji sekretaris
     gatot = gapok + (jmlhadir * t_hadir); // Total gaji yaitu gaji pokok ditambah dengan komisi jumlah kehadiran
     return gatot;
     }
     @Override
     public void Jmlhadir(int jmlhadir) { // mengatur jumlah kehadiran
     this.jmlhadir = jmlhadir;
     }
}
