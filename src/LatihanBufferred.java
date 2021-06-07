
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class LatihanBufferred {
    public static void main(String[] args) throws Exception{
        InputStreamReader keyreader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(keyreader);
        
        String kata1,kata2;
         System.out.println("Masukkan kata pertama : ");
         kata1 = input.readLine();
         System.out.println("Masukkan kata kedua : ");
         kata2 = input.readLine();
         System.out.println("Hasil input string  "+ kata1 + "" +kata2);
        
        
        
    }
}
