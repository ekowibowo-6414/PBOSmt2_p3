
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
public class LatihanIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String keterangan,nama;
        int nilai;
        
        System.out.println("Masukkan nama siswa :");
        nama = input.nextLine();
        System.out.println("Masukkan nilai akhir :");
        nilai = input.nextInt();
        
        if(nilai > 70){
            keterangan ="Lulus";
        }
        else{
            keterangan = "Gagal";
        }
        System.out.println("Hasil Akhir");
        System.out.println("===========================");
        System.out.println("Nama : "+ nama);
        System.out.println("Nilai : " + nilai);
        System.out.println("keterangan : "+ keterangan);
        System.out.println("===========================");
    }
    
}
