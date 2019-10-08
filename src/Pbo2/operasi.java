package Pbo2;

public class operasi {

    private int perkalian,pembagian,penjumlahan,pengurangan,variabel1,variabel2;

    public void setVariabel1(int variabel1){
        this.variabel1 = variabel1;
    }
    public void setVariabel2(int variabel2){
        this.variabel2 = variabel2;
    }
    public int getVariabel1() {
        return variabel1;
    }
    public int getVariabel2() {
        return variabel2;
    }
    
    public void setPerkalian(int perkalian) {
        this.perkalian = variabel1 * variabel2;
    }
    public int getPerkalian() {
        return perkalian;
    }
    
    public void setPembagian(int pembagian) {
        this.pembagian = variabel1 / variabel2;
    }
    public int getPembagian() {
        return pembagian;
    }
    
    
    
}
