/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author royma
 */
public class Login {
    //atribut
    String username;
    private String password;
    private String inputUser;
    String hasilcek;
    
    //konstruktor
    public Login() {
        password = "ITN_MALANG";
    }
    
    public void setInputUser(String inputUser) {
        this.inputUser = inputUser;
    }
    
    //method
    String cocokkanPass(){
        if(password.compareTo(inputUser)==0){
            hasilcek = "Password benar";
        }
        else{
            hasilcek = "Password salah";
        }
        return hasilcek;
    }
}
