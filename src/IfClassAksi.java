
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
public class IfClassAksi {
    public static void main(String[] args) {
        double tot_beli;
        Scanner input = new Scanner(System.in);
        Ifclass fungsiif = new Ifclass();
        System.out.print("Jumlah Beli Rp.");
        fungsiif.tot_beli = input.nextDouble();
        System.out.println("Besarnya potongan Rp."+ fungsiif.getPotongan());
        System.out.println("Jumlah yang harus dibayarkan Rp." + fungsiif.setJumlahbayar());
        
    }
    
}
