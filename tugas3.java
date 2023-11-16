import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
      Scanner scan =  new Scanner(System.in);
      int pilihan;
    float r1,r2,r3,respengganti;
    System.out.print("Masukkan besar R1:");
    r1 = scan.nextFloat();
    System.out.print("Masukkan besar R2:");
    r2 = scan.nextFloat();
    System.out.print("Masukkan besar R3:");
    r3 = scan.nextFloat();
    System.out.print("Masukkan pilihan (seri/paralel):");
    pilihan = scan.nextInt();
    switch (pilihan) {
    case 1:
    respengganti = r1+r2+r3;
    break;
    case 2:
    respengganti = (1*r1)+(1*r2)+(1*r3);
    respengganti = 1*respengganti;
    System.out.print("Resistor"+respengganti);
    break;
    }
    scan.close();
}
}