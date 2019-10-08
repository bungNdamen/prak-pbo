package Pbo2;

public class hasil {

    public static void main(String[] args) {
        operasi obj = new operasi();
        obj.setVariabel1(10);
        obj.setVariabel2(30);
        obj.setPerkalian(obj.getVariabel1()*obj.getVariabel2());
        
        operasi trg = new operasi();
        trg.setVariabel1(8);
        trg.setVariabel2(2);
        trg.setPembagian(trg.getVariabel1()/trg.getVariabel2());
        
        System.out.println("Perkalian dari " +obj.getVariabel1()+" x "+obj.getVariabel2()+ " = "+ obj.getPerkalian());
        System.out.println("Pembagian dari " +trg.getVariabel1()+" : "+trg.getVariabel2()+" = "+ trg.getPembagian());
    }
    
}
