package Pbo3;

/**
 *
 * @author atha
 */
public class allMethod {

    private String[] mhs;
    private int[] deret;
    private int hasilPenjumlahan;
    private int minValue;
    private int maxValue;
    private int index1;
    private int index2;

    public void setMhs(String[] mhs) {
        this.mhs = mhs;
        mhs = null;
    }

    public String[] getMhs() {
        return mhs;
    }

    public void setDeret(int[] deret) {
        this.deret = deret;
        deret = null;
    }

    public int[] getDeret() {
        return deret;
    }

    public void setPenjumlahan(int[] deret) {
        hasilPenjumlahan = 0;
        for (int i = 0; i < deret.length; i++) {
            hasilPenjumlahan += deret[i];

        }
        deret = null;
    }

    public int getPenjumlahan() {
        return hasilPenjumlahan;
    }

    public void setRata2(int[] deret) {
        int z = 0;
        hasilPenjumlahan = 0;
        for (int i = 0; i < deret.length; i++) {
            z += deret[i];
            hasilPenjumlahan = z / deret.length;
        }
        deret = null;
    }

    public int getRata2() {
        return hasilPenjumlahan;
    }

    public void setIndex(int a, int[] deret) {
        int x = 0;
        for (int i = 0; i < deret.length; i++) {
            if (a == deret[i]) {
                index1 = x;
                index2 = i;
                x = i;
            }
        }
        deret = null;
    }

    public int getIndex() {
        return index1;
    }

    public int getIndex1() {
        return index2;
    }

    public void setMin1(int[] deret) {
        minValue = deret[0];
        for (int i = 0; i < deret.length; i++) {
            if (deret[i] < minValue) {
                minValue = deret[i];
            }
        }
        deret = null;
    }

    public int getMin1() {
        return minValue;
    }

    public void setMax1(int[] deret) {
        maxValue = deret[0];
        for (int i = 0; i < deret.length; i++) {
            if (deret[i] > maxValue) {
                maxValue = deret[i];
            }
        }
        deret = null;
    }

    public int getMax1() {
        return maxValue;
    }

    public void tampil(String a) {
        System.out.println(a);
    }

    public void tampil(String a[]) {
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

    public void tampil(int a) {
        System.out.println(a);
    }

    public void tampil(int a[]) {
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
        mhs = null;
        deret = null;
        hasilPenjumlahan = 0;
    }
}
