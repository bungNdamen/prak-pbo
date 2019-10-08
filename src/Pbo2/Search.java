package Pbo2;
public class Search {
    private String jenis;
    private int stok, hargatot, hargasat, total;
    
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    public String getJenis(){
        return jenis;
    }
    
    public void setStok(int stok){
        this.stok = stok;
    }
    public int getStok(){
        return stok;
    }
    
    public void setHargasat(int hargasat){
        this.hargasat = hargasat;
    }
    public int getHargasat(){
        return hargasat;
    }
    
    public void setHargatot(int hargatot){
        this.hargatot = stok * hargasat;
    }
    public int getHargatot(){
        return hargatot;
    }
    
    public void setTotal(int total){
        this.total = total;
    }
    public int getTotal(){
        return total;
    }

}