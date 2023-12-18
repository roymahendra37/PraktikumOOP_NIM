/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPolimorfisme;

/**
 *
 * @author royma
 */

public class Manager extends Pegawai{
    String id_manager;
    public Manager() {
        Gaji_Pokok = 3200000;
        t_hadir = 25000;
        j_lembur = 60000;
    }
    void Id_manager(String Id_Manager){
        this.id_manager = Id_Manager;
    }
    String Id_manager(){
        return id_manager;
    }
    @Override
    int hitGaji() {
        Gaji_Total = Gaji_Pokok + (jmlhadir * t_hadir)+(Jmllembur * j_lembur);
        return Gaji_Total;
    }
    public void Jmlhadir(int jmlhadir) {
        this.jmlhadir = jmlhadir;
    }
    public void Jlembur(int Jlembur) {
        this.Jmllembur = Jlembur;
    }
}

