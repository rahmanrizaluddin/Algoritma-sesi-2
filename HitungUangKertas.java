import java.util.Scanner;

public class HitungUangKertas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nominal uang: Rp");
        int nominal = input.nextInt();

        int jumlah50rb = nominal / 50000;
        nominal = nominal % 50000;

        int jumlah20rb = nominal / 20000;
        nominal = nominal % 20000;

        int jumlah5rb = nominal / 5000;
        nominal = nominal % 5000;

        int jumlah2rb = nominal / 2000;
        nominal = nominal % 2000;

        int jumlah500 = nominal / 500;

        System.out.println("Jumlah uang kertas/keping:");
        System.out.println(jumlah50rb + " lembar 50 ribuan");
        System.out.println(jumlah20rb + " lembar 20 ribuan");
        System.out.println(jumlah5rb + " lembar 5 ribuan");
        System.out.println(jumlah2rb + " lembar 2 ribuan");
        System.out.println(jumlah500 + " keping 500an");
    }
}
