
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
public class IfElseClass {
    Scanner input = new Scanner(System.in);
    String keterangan,nama;
    int nilai;
    
    public void setInputData(){
        System.out.println("Masukkan nama anda : ");
        nama = input.nextLine();
        System.out.println("Masukkan nilai akhir");
        nilai = input.nextInt();
        
    }
    public String getKeterangan(){
        if (nilai >= 0){
            keterangan = "Lulus";
        }
        else{
            keterangan = "Gagal";
        }
        return keterangan;
    }
    
}
