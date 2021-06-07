
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class LatihanIf {
    public static void main(String[] args) {
        double tot_beli,potongan=0,jumlah_bayar = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Total pembelian Rp");
        tot_beli = input.nextDouble();
        if (tot_beli >= 50000)
            potongan = 0.2 * tot_beli;
        System.out.println("Jumlah potongan Rp."+ potongan);
        jumlah_bayar = tot_beli - potongan;
        System.out.println("Jumlah yang harus dibayarkan Rp"+ jumlah_bayar);
        
        
    }
    
}
