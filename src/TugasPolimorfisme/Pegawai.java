/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPolimorfisme;

/**
 *
 * @author royma
 */
public class Pegawai {
String nama;
int Gaji_Pokok, t_hadir, j_lembur, Gaji_Total, jmlhadir,Jmllembur; 
    public String nama(){
        return nama;
    }
    void Nama(String Nama){
        this.nama = nama;
    }
    public Pegawai() {
        Gaji_Pokok = 3200000;
        t_hadir = 25000;
        j_lembur = 60000;
        jmlhadir = 0;
        Jmllembur = 0;
    }
    public void Jmlhadir(int jmlhadir) {
        this.jmlhadir = jmlhadir;
    }
    public void Jlembur(int Jlembur) {
        this.Jmllembur = Jlembur;
    }
    int hitGaji(){
        return Gaji_Total;
    }
}
