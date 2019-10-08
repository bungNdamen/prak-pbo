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
public class method {

    private String[][] mhs1;
    private int[][] mhs2, mhs3;

    public void setMHS1(String[][] mhs1) {
        this.mhs1 = mhs1;
        mhs1 = null;
    }

    public String[][] getMHS1() {
        return mhs1;
    }

    public void setMHS2(int[][] mhs2) {
        this.mhs2 = mhs2;
        mhs2 = null;
    }

    public int[][] getMHS2() {
        return mhs2;
    }

    public void setPerkalianSkalar(int[][] mhs2, int a) {
        mhs3 = mhs2;
        int i, j;
        for (i = 0; i < mhs2.length; i++) {
            for (j = 0; j < mhs2[i].length; j++) {
                mhs3[i][j] = a * mhs2[i][j];
            }
        }
        mhs2 = null;
    }

    public int[][] getPerkalianSkalar() {
        return mhs3;
    }

    public void tampil(String a) {
        System.out.println(a);
        a = null;
    }

    public void tampil(String[][] data) {
        int i, j;
        for (i = 0; i < data.length; i++) {
            for (j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "  ");
            }
            System.out.println();
        }
        data = null;
    }

    public void tampil(int[][] a) {
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "   ");
            }
            System.out.println();
        }
        a = null;
    }

    public void hapus() {
        mhs1 = null;
        mhs2 = null;
        mhs3 = null;
    }
}
