import java.util.Scanner;

public class tugas6 {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int iJamStart,iMenitStart,iMenitStop,iJamStop,iTotMenit1,iTotMenit2,iSelangMenit,iJamDurasi,iMenitDurasi;
    System.out.print("Jam start:");
    iJamStart = scan.nextInt();
    System.out.print("Menit start:");
    iMenitStart = scan.nextInt();
    System.out.print("Jam stop:");
    iJamStop = scan.nextInt();
    System.out.print("Menit stop:");
    iMenitStop = scan.nextInt();
    iTotMenit1 = iJamStart * 60 + iMenitStart;
    iTotMenit2 = iJamStop * 60 + iMenitStop;
    if (iTotMenit2 >= iTotMenit1)
    {iSelangMenit = iTotMenit2 - iTotMenit1;
    }else{
    iSelangMenit = ((12*60)-iTotMenit1) + iTotMenit2;}
    iJamDurasi = iSelangMenit/=60; 
    iMenitDurasi = iSelangMenit%=60;
    System.out.println(iJamDurasi);
    System.out.println(iMenitDurasi);
    scan.close();
    }
}
