import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int masuk;
        int keluar;
        int lama;
        int biaya;
        System.out.print("Masukkan jam masuk:");
        masuk = scan.nextInt();
        System.out.print("Masukkan jam keluar:");
        keluar = scan.nextInt();
        if (keluar >= masuk) {
            lama = keluar - masuk;
        } else {
            lama = (12 - masuk) + keluar;
        }
        if (lama > 2) {
            biaya = 2000 + ((lama - 2) * 500);
        } else {
            biaya = 2000;
            System.out.print("Biaya:" + biaya);
        }
        scan.close();
    }
}
