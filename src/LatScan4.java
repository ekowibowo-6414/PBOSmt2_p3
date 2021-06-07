
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
public class LatScan4 {
    
    public static void main(String[] args) {
        int kd;
        String nb;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kode barang[1..3]");
        kd = input.nextInt();
        switch(kd){
            case 1:
                nb ="Alat Olahraga";
            break;
            case 2:
                nb ="Alat Elektronik";
                break;
            case 3:
                nb ="Alat-alat masak";
                break;
            default :
                nb ="anda salah kode ";
                break;
                
        }
        System.out.println("Nama barang : " + nb);
        
    }
    
}
