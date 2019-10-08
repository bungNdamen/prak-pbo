/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo4;

/**
 *
 * @author atha
 */
public class mainMethod {
    
    public static void main(String[] args) {
        method ob = new method();
        String[][] mhs = {
            {"NIM", "Nama"},
            {"17650123", "David"},
            {"17650124", "Ahmad"},
            {"17650125", "Ratih"},
            {"17650126", "Dina"}
        };
        ob.tampil("Data Mahasiswa :");
        ob.setMHS1(mhs);
        ob.tampil(ob.getMHS1());
        ob.tampil("==============================");
        int[][] data = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        int pengali = 2;
        ob.tampil("Data Matrik : ");
        ob.setMHS2(data);
        ob.tampil(ob.getMHS2());
        ob.tampil("Data Matrik X" + pengali + " : ");
        ob.setPerkalianSkalar(data, pengali);
        ob.tampil(ob.getPerkalianSkalar());
        ob.hapus();
        mhs = null;
        data = null;
        ob = null;
    }
}
