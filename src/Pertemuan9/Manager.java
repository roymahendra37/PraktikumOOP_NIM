/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;

/**
 *
 * @author royma
 */
public class Manager extends Gaji{
     //atribut
     private String id_manager; // ID manager
     //konstructor
     public Manager() {
     gapok = 3400000; // Inisialisasi gaji pokok
     t_hadir = 12000; // Inisialisasi uang perhadiran
     j_lembur = 26000; // Inisialisasi uang lembur
     }
     //method
     void Id_manager(String Id_Manager) { //mengatur ID manager
     this.id_manager = Id_Manager;
     }
     String Id_manager() { //mendapatkan ID manager
     return id_manager;
     }
     @Override
     int hitGaji() { // Menghitung total gaji manager
     gatot = gapok + (jmlhadir * t_hadir) + (jmlembur * j_lembur); // Total gaji adalah gaji pokok ditambah komisi hadi dan komisi lembur
     return gatot;
     }
     @Override
     public void Jmlhadir(int jmlhadir) { //mengatur jumlah kehadiran
     this.jmlhadir = jmlhadir;
     }
     public void jmlembur(int jmlembur) { //mengatur jumlah lembur
     this.jmlembur = jmlembur;
     }

}
