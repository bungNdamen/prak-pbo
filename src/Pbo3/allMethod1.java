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
public class allMethod1 {
    private String [][] mhs;
    private int [][] data,hasil;
    
    public void setMhs(String[][] mhs){
        this.mhs = mhs;
        mhs = null;
    }
    public String[][] getMhs(){
        return mhs;
    }
    
    public void setData(int [][]data){
        this.data = data;
        data = null;
    }
    public int[][] getData (){
        return data;
    }
    
    public void setData1(int [][] data,int a){
        hasil = data;
        int i, j;
        for(i=0;i<data.length;i++){
            for(j=0;j<data[i].length;j++){
                hasil[i][j]=a+data[i][j];
            }
        }
        data = null;
    }
    public int[][] getData1(){
        return hasil;
    }
    public void display(String a){
        System.out.println(a);
        a = null;
    }
    public void display(String data[][]){
        int i, j;
        for(i=0;i<data.length;i++){
            for(j=0;j<data[i].length;j++){
                System.out.println(data[i][j]+"   ");
            }System.out.println();
        } 
        data = null;
    }
    public void display(int[][]data){
        int i, j;
        for(i=0;i<data.length;i++){
            for(j=0;j<data[i].length;j++){
                System.out.println(data[i][j]+"   ");
            }System.out.println();
        }data = null;
    }
    public void delete(){
        mhs = null;
        data = null;
        hasil = null;
    }
}
