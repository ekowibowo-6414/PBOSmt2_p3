/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Ifclass {
    public double tot_beli,potongan,jumlah_bayar;
    
    public void setTotBeli(double a){
        tot_beli = a;
}
    public double getPotongan(){
        if(tot_beli >= 50000){
            potongan = 0.2 * tot_beli;
    }
        return potongan;}
    public double setJumlahbayar(){
        return (tot_beli - potongan);
        
    }
    
}
