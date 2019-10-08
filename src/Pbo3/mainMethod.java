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
public class mainMethod {
    
    public static void main(String[] args) {
        allMethod x = new allMethod();
        String mahasiswa[] = {"dada", "didi", "dudu", "dede", "dodo"};
        int deret[] = {-5, -2, -3, -1, -3};
        
        x.tampil("Daftar Mahasiswa : ");
        x.setMhs(mahasiswa);
        x.tampil(x.getMhs());
        x.tampil("=================================");
        x.tampil("Deret : ");
        x.setDeret(deret);
        x.tampil(x.getDeret());
        x.setPenjumlahan(deret);
        x.tampil(x.getPenjumlahan());
        x.tampil("=================================");
        x.tampil("Nilai Rata-rata dari Deret : ");
        x.setRata2(deret);
        x.tampil(x.getRata2());
        x.tampil("=================================");
        x.tampil("Nilai Minimum dari Deret : ");
        x.setMin1(deret);
        x.tampil(x.getMin1());
        x.tampil("=================================");
        x.tampil("Nilai Maximum dari Deret : ");
        x.setMax1(deret);
        x.tampil(x.getMax1());
        x.tampil("=================================");
        x.setIndex(-3, deret);
        x.tampil("-3 berada pada index ke " + x.getIndex()+" dan "+x.getIndex1());
        x.hapus();
        mahasiswa = null;
        deret = null;
        x = null;
    }
    
}
