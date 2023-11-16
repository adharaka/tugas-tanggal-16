import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        char jenis;
        int kode;
        int harga;
        int diskon;
        System.out.print("Masukkan jenisnya:");
        jenis = scan.next().charAt(0);
        System.out.print("Masukkan kodenya:");
        kode = scan.nextInt();
        System.out.print("Masukkan harganya:");
        harga = scan.nextInt();
        switch (jenis) {
        case 'A':
        diskon = 5* harga;
        break;
        case 'B':
        diskon = 20* harga;
        break;
        case 'C':
        diskon = 8 * harga;
        System.out.print("Anda mendapatkan diskon, dengan kode:"+diskon+kode);
        break;
        }
        scan.close();
     }
}
