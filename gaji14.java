import java.util.Scanner;
public class gaji14 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int jmlMasuk, JmlTdkMasuk, TotGaji;
        int gaji, potGaji;

        System.out.println("Masukan Jumlah Gaji ");
        gaji=sc.nextInt();
        System.out.println("Masukan Jumlah Potongan Gaji ");
        potGaji=sc.nextInt();
        System.out.println("Masukan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk=sc.nextInt();
        System.out.println("Masukan Jumlah Hari Tidak Masuk Kerja Anda ");
        JmlTdkMasuk=sc.nextInt();

        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah " +TotGaji);
    
    
    
    }
}