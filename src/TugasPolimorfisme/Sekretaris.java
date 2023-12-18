/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPolimorfisme;

/**
 *
 * @author royma
 */
public class Sekretaris extends Pegawai{
String id_sekretaris;
    public Sekretaris() {
        Gaji_Pokok = 3200000;
        t_hadir = 25000;
    }
    void Id_sekertaris(String Id_sekertaris){
        this.id_sekretaris = Id_sekertaris;
    }
    String id_sekretaris(){
        return id_sekretaris;
    }
    @Override
    int hitGaji() {
        Gaji_Total = Gaji_Pokok + (jmlhadir * t_hadir);
        return Gaji_Total; 
    }
    public void Jmlhadir(int jmlhadir) {
        this.jmlhadir = jmlhadir;
    }
}