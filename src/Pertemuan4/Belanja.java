/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author royma
 */
public class Belanja {
    //atribut
    private int total,diskon;
    private String inputkode;
    private String kode1, kode2;
    public int bayar;
    
    //konstruktor
    public Belanja() {
        kode1 = "P001";
        kode2 = "G003";
    }
    
    //method
    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setInputkode(String inputkode) {
        this.inputkode = inputkode;
    }
    
    int diskon(){
        if(kode1.compareTo(inputkode)==0){
            diskon = total * 10/100;
        }
        else if(kode2.compareTo(inputkode)==0){
            diskon = total * 15/100;
        }
        else{
            diskon = 0;
        }
        return diskon;
    }
    
    int ctkbayar(){
        bayar = total - diskon;
        return bayar;
    }
}
