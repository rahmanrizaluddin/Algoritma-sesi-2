import java.util.Scanner;

public class HitungGajiLembur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: Rp");
        double gajiPokok = scanner.nextDouble();

        System.out.print("Masukkan jam lembur: ");
        double jamLembur = scanner.nextDouble();

        System.out.print("Masukkan upah lembur per jam: Rp");
        double upahLembur = scanner.nextDouble();

        double gajiBersih = gajiPokok + (jamLembur * upahLembur);

        System.out.println("Gaji bersih: Rp" + gajiBersih);
    }
}
