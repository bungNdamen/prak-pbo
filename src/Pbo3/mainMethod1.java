/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo3;

/**
 *
 * @author atha
 */
public class mainMethod1 {
    public static void main(String[] args) {
        allMethod1 ar = new allMethod1();
        String [][] mhs = {
            {"NIM","Nama"},
            {"18650045","david"},
            {"1865001", "aziz"},
            {"18650012","javier"},
            {"18650032", "agus"}
        };
        ar.display("Data Mahasiswa");
        ar.setMhs(mhs);
        ar.display(ar.getMhs());
        ar.display("============================");
        
    }
}
