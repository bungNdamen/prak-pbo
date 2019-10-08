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
public class method {

    private int[] mhs1, mhs2;
    private int mhs5, mhs6, mhs7;

    public void setMHS1(int[] mhs1) {
        this.mhs1 = mhs1;
        mhs1 = null;
    }

    public int[] getMHS1() {
        return mhs1;
    }

    public void setPenjumlahan(int[] a) {
        mhs5 = 0;
        for (int i = 0; i < a.length; i++) {
            mhs5 += a[i];
        }
        a = null;
    }

    public int getPenjumlahan() {
        return mhs5;
    }

    public void setRata(int[] a) {
        int b = 0;
        mhs5 = 0;
        for (int i = 0; i < a.length; i++) {
            b += a[i];
            mhs5 = b / a.length;
        }
    }

    public int getRata() {
        return mhs5;
    }

    public void setMin(int[] a) {
        mhs6 = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < mhs6) {
                mhs6 = a[i];
            }
        }
        a = null;
    }

    public int getMin() {
        return mhs6;
    }

    public void setMax(int[] a) {
        mhs7 = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > mhs7) {
                mhs7 = a[i];
            }
        }a = null;
    }
    public int getMax(){
        return mhs7;
    }

    public void tampil(String a) {
        System.out.println(a);
    }

    public void tampil(int a) {
        System.out.println(a);
    }

    public void tampil(int[] a) {
        String data = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                data += a[i];
            } else {
                data += ", " + a[i];
            }
        }
        System.out.println(data);
        a = null;
        data = null;
    }

    public void hapus() {
        mhs1 = null;

    }
}
