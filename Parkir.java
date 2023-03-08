import java.util.Scanner;

public class Parkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan waktu masuk (jam): ");
        int jamMasuk = scanner.nextInt();

        System.out.print("Masukkan waktu keluar (jam): ");
        int jamKeluar = scanner.nextInt();

        System.out.print("Masukkan biaya per jam: ");
        int biayaPerJam = scanner.nextInt();

        int lamaParkir = jamKeluar - jamMasuk;
        int biayaParkir = lamaParkir * biayaPerJam;

        System.out.println("Lama parkir: " + lamaParkir + " jam");
        System.out.println("Biaya parkir: Rp" + biayaParkir);
    }
}
