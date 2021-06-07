/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class AksiScanner {
    public static void main(String[] args) {
        ClassScanner scan = new ClassScanner();
        scan.inputScanner();
        System.out.println("Nama anda :"+ scan.getnama());
        System.out.println("Nilai anda :" + scan.rata());
    }
}
