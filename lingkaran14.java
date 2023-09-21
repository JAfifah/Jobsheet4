import java.util.Scanner;

public class lingkaran14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Mendeklarasikan variabel untuk menyimpan input dan hasil perhitungan
        int jari;
        float luas, keliling;
        float phi = 3.14f;

        // Meminta pengguna untuk memasukkan nilai panjang
        System.out.print("Masukkan Jari-Jari: ");
        jari = input.nextInt();

        // Menghitung keliling
        keliling = 2 * phi * jari;

        // Menampilkan hasil keliling
        System.out.println(String.format("keliling Lingkaran adalah %f cm",keliling ));

        // Menghitung luas
        luas = phi * (jari * jari);

        // Menampilkan hasil Luas
        System.out.println(String.format("Luas Lingkaran adalah %f cm.", luas));


        // Menutup objek Scanner
        input.close();
    }
}