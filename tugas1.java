import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int masuk;
        int keluar;
        int lama;
        System.out.print("Masukkan jam masuk kerja:");
        masuk =scan.nextInt();
        System.out.print("Masukkan jam keluar kerja:");
        keluar = scan.nextInt();
        if (keluar >= masuk) {
            lama = keluar - masuk;
        }
        else{lama = (12-masuk)+keluar;
        }
            System.out.print(lama);
            scan.close();
        }        
        }
