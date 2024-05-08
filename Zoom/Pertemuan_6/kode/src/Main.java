import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Burger.displayAllBurgers();
            // Menampilkan menu
            System.out.println("Course-Net Burger");
            System.out.println("-----------------");
            System.out.println("1. Add Burger");
            System.out.println("2. Sell Burger");
            System.out.println("3. Update Data Burger");
            System.out.println("4. Exit");

            // Meminta pilihan dari user
            System.out.print("Masukkan pilihan Anda [1..4]: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    // Menambahkan burger
                    System.out.println("Menambahkan burger...");
                    Burger.addBurger();
                    break;
                case 2:
                    // Menjual burger
                    System.out.println("Menjual burger...");
                    Burger.sellBurger();
                    break;
                case 3:
                    // Memperbarui data burger
                    System.out.println("Memperbarui data burger...");
                    // Masukkan kode untuk memperbarui data burger
                    break;
                case 4:
                    // Keluar dari program1
                    System.out.println("Terima kasih telah menggunakan Course-Net Burger!");
                    System.exit(0);
                default:
                    // Pilihan tidak valid
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }
}
