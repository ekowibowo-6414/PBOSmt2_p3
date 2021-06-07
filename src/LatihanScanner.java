import java.util.Scanner;

public class LatihanScanner{
    public static void main(String[] args) {
//        Membuat objek baru
    Scanner input = new Scanner(System.in);
//    Deklarasi variabel
    String nama;
    int n2;
    double n1,n3;
    System.out.println("Masukkan nama anda :");
    nama = input.nextLine();
        System.out.println("Masukkan nilai 1 :");
    n1 = input.nextDouble();
        System.out.println("Masukkan nilai 2 :");
    n2 = input.nextInt();
    
    n3 = n1 + n2;
        System.out.println("Nama anda : "+ nama);
        System.out.println("Nilai anda : "+ n3);
    }
}