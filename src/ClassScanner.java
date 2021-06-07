
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
public class ClassScanner {
    public String nama;
    public double n1;
    public int n2,n3;
    Scanner input = new Scanner(System.in);
    public String getnama(){
        return nama;
    }
        public void inputScanner(){
            System.out.println("Masukkan nama anda :");
    nama = input.nextLine();
        System.out.println("Masukkan nilai 1 :");
    n1 = input.nextDouble();
        System.out.println("Masukkan nilai 2 :");
    n2 = input.nextInt();
    }
        public double rata(){
            return((n1+n2)/2);
        }
    
}
