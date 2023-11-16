import java.util.Scanner;

public class tugas5 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int golongan;
        int jam;
        int upah;
        int gajih;
        System.out.print("Masukkan golongan:");
        golongan = scan.nextInt();
        System.out.print("Masukkan jam kerja anda:");
        jam = scan.nextInt();
        upah = 0;
        switch (golongan) {
            case 1:
                upah = 3000;
                break;
            case 2:
                upah = 3500;
                break;
                case 3:
                upah = 4000;
                break;
                case 4:
                upah = 5000;
                break;
            default:
                break;
        }
        if (jam > 40){
            gajih = 40 * upah + ((jam - 40)* 15 *upah);
        }
        else{ gajih=jam * upah;
        }
        System.out.print("Total gajih anda:"+gajih);
        scan.close();
    }
}
