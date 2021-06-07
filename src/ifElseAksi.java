/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class ifElseAksi {
    public static void main(String[] args) {
        IfElseClass input = new IfElseClass();
        input.setInputData();
        System.out.println("Hasil Akhir");
        System.out.println("========================");
        System.out.println("Nama : "+ input.nama);
        System.out.println("Nilai akhir : "+ input.nilai);
        System.out.println("Keterangan : "+ input.getKeterangan());
        System.out.println("========================");
    }
}
