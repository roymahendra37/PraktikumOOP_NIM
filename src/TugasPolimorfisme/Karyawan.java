/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPolimorfisme;

/**
 *
 * @author royma
 */
public class Karyawan extends Pegawai{
String id_karyawan;
    int jmlhadir;
    public Karyawan() {
        Gaji_Pokok = 3200000;
    }
    String Id_karyawan(){
        return id_karyawan;
    }
    void Id_karyawan(String Id_karyawan){
        this.id_karyawan = Id_karyawan;
    }
    @Override
    int hitGaji() {
        Gaji_Total = Gaji_Pokok;
        return Gaji_Total;
    }
}
