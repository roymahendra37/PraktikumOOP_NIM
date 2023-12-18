/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

/**
 *
 * @author royma
 */
public class Mamalia extends MahklukHidup {
    int jmlKaki;
    String warna;
    
    String Kelas(){
        return "Kelas Mamalia";
    }

    @Override
    String bernafas() {
        return "Bernafas Menggunakan Paru-Paru";
    }
    String berkembangbiak(){
        return "Melahirkan";
    }
    
}
