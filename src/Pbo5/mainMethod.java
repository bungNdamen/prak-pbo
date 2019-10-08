/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo5;

/**
 *
 * @author atha
 */
public class mainMethod {
    public static void main(String[] args) {
        method ob = new method();
        int a[] = {1,2,3,4,5};
        ob.tampil("Array : ");
        ob.setMHS1(a);
        ob.tampil(ob.getMHS1());
        ob.tampil("====================");
        ob.tampil("Penjumlahan isi Array : ");
        ob.setPenjumlahan(a);
        ob.tampil(ob.getPenjumlahan());
        ob.tampil("====================");
        ob.tampil("Rata - Rata dari Array : ");
        ob.setRata(a);
        ob.tampil(ob.getRata());
        ob.tampil("====================");
        ob.tampil("Nilai Minimum Dari Array");
        ob.setMin(a);
        ob.tampil(ob.getMin());
        ob.tampil("====================");
        ob.tampil("Nilai Maximum Dari Array");
        ob.setMax(a);
        ob.tampil(ob.getMax());
    }
}
