package Pbo1;
public class Contoh2 {
    static void cetak(int a){
        System.out.println("Nilai X: "+a);
    }
    public static void main(String[] args) {
        int x;
        for (x=0; x<3; x++){
            cetak(x);
        }
        System.out.println("Nilai X terakhir: "+x);
    }
}
