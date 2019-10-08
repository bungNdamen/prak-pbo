package Pbo2;
public class file {
    public static void main(String[] args) {
        Search q = new Search();
        Search w = new Search();
        Search e = new Search();
        Search r = new Search();
        
        q.setJenis("Bolpoint");
        w.setJenis("Pensil");
        e.setJenis("Peghapus");
        
        q.setStok(10);
        w.setStok(10);
        e.setStok(10);
        
        q.setHargasat(2000);
        w.setHargasat(1000);
        e.setHargasat(500);
        
        q.setHargatot(q.getStok()*q.getHargasat());
        w.setHargatot(w.getStok()*w.getHargasat());
        e.setHargatot(e.getStok()*e.getHargasat());
        
        r.setTotal(q.getHargatot()+w.getHargatot()+e.getHargatot());
        
        System.out.println("Nama Alat Tulis: "+q.getJenis());
        System.out.println("Stok: "+q.getStok());
        System.out.println("Harga Satuan: "+q.getHargasat());
        System.out.println("Harga Bolpoint: "+q.getHargatot());
        System.out.println("");
        System.out.println("Nama Alat Tulis: "+w.getJenis());
        System.out.println("Stok: "+w.getStok());
        System.out.println("Harga Satuan: "+w.getHargasat());
        System.out.println("Harga Bolpoint: "+w.getHargatot());
        System.out.println("");
        System.out.println("Nama Alat Tulis: "+e.getJenis());
        System.out.println("Stok: "+e.getStok());
        System.out.println("Harga Satuan: "+e.getHargasat());
        System.out.println("Harga Bolpoint: "+e.getHargatot());
        System.out.println("");
        System.out.println("Total Harga: "+r.getTotal());
    
    }
    
}

