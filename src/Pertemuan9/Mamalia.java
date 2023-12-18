/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;

/**
 *
 * @author royma
 */
public class Mamalia extends MahklukHidup {
    int jmlKaki;
    String suara;

    public Mamalia() {
        nama = "Kuda";
    }
    
    @Override
    String Bernafas(){
        return "Bernafas menggunakan paru-paru";
    }
}
