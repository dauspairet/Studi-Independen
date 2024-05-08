import java.util.Scanner;

public class Burger {

    private String nama;
    private int jumlah;
    private double harga;
    private static double totalPendapatan = 0.0;

    private static Burger[] daftarBurger = new Burger[100]; // Array untuk menyimpan semua burger
    private static int jumlahBurger = 0; // Jumlah burger yang sudah ada

    public Burger(String nama, int jumlah, double harga) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public static double getTotalPendapatan() {
        return totalPendapatan;
    }

    public static void setTotalPendapatan(double totalPendapatan) {
        Burger.totalPendapatan = totalPendapatan;
    }

    public static void displayAllBurgers() {
        if (jumlahBurger == 0) {
            System.out.println("No Data\n");
            
            System.out.println("Total Income: $ " + getTotalPendapatan() + "\n");
        } else {
            System.out.println("No. Name                    Quantity    Price");
            
            // Menampilkan semua burger yang ada dalam array
            for (int i = 0; i < jumlahBurger; i++) {
                Burger burger = daftarBurger[i];
                String name = burger.getNama();
                int quantity = burger.getJumlah();
                double price = burger.getHarga();
                
                // Format penampilan
                String output = String.format("%2d. %-23s %-10d $ %.2f", (i + 1), name, quantity, price);
                System.out.println(output);
            }
            System.out.println("Total Income: $ " + getTotalPendapatan());
        }
    }

    public static void addBurger() {
        Scanner scanner = new Scanner(System.in);

        // Meminta data burger dari user
        System.out.print("Masukkan nama burger (5-15 karakter): ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jumlah burger (1-100): ");
        int jumlah = scanner.nextInt();

        System.out.print("Masukkan harga burger (4-9): ");
        double harga = scanner.nextDouble();

        // Membuat objek Burger baru
        Burger burger = new Burger(nama, jumlah, harga);

        // Menyimpan objek Burger ke dalam array
        daftarBurger[jumlahBurger++] = burger;

        // Menampilkan informasi burger yang baru ditambahkan
        System.out.println("Burger berhasil ditambahkan!");
    }

    public static void sellBurger() {
        Scanner scanner = new Scanner(System.in);

        // Memeriksa apakah ada burger yang tersedia
        if (jumlahBurger == 0) {
            System.out.println("Tidak ada burger yang tersedia untuk dijual.");
            return;
        }

        // Menampilkan daftar burger yang tersedia untuk dijual
        System.out.println("Daftar Burger yang Tersedia untuk Dijual:");
        for (int i = 0; i < jumlahBurger; i++) {
            Burger burger = daftarBurger[i];
            System.out.println((i + 1) + ". " + burger.getNama() + " (" + burger.getJumlah() + " tersedia)");
        }

        // Meminta input dari user
        System.out.print("Pilih burger yang ingin dijual (1-" + jumlahBurger + "): ");
        int indexBurger = scanner.nextInt() - 1;
        if (indexBurger < 0 || indexBurger >= jumlahBurger) {
            System.out.println("Input tidak valid.");
            return;
        }

        Burger burger = daftarBurger[indexBurger];
        int availableQuantity = burger.getJumlah();

        System.out.print("Masukkan jumlah yang ingin dijual (1-" + availableQuantity + "): ");
        int quantityToSell = scanner.nextInt();
        if (quantityToSell < 1 || quantityToSell > availableQuantity) {
            System.out.println("Input tidak valid.");
            return;
        }

        double totalCost = quantityToSell * burger.getHarga();

        // Memeriksa apakah user ingin menambahkan ekstra
        System.out.print("Tambahkan ekstra (Y/N)?: ");
        char addExtra = scanner.next().charAt(0);
        double extraCost = 0.0;
        if (addExtra == 'Y' || addExtra == 'y') {
            System.out.println("Pilih ekstra yang ingin ditambahkan:");
            System.out.println("1. Bacon Gravy       : $2.3");
            System.out.println("2. Chicken Strips    : $2.5");
            System.out.println("3. Liquid Strips     : $1.7");
            System.out.println("4. Mozza Sticks      : $2.0");
            System.out.println("5. Onion Rings       : $1.9");

            System.out.print("Pilih ekstra (1-5): ");
            int extraChoice = scanner.nextInt();
            switch (extraChoice) {
                case 1:
                    extraCost = 2.3;
                    break;
                case 2:
                    extraCost = 2.5;
                    break;
                case 3:
                    extraCost = 1.7;
                    break;
                case 4:
                    extraCost = 2.0;
                    break;
                case 5:
                    extraCost = 1.9;
                    break;
                default:
                    System.out.println("Input tidak valid.");
                    return;
            }
        }

        // Menghitung total biaya
        totalCost += extraCost;

        // Menambahkan total pendapatan
        totalPendapatan += totalCost;

        // Mengurangi jumlah burger yang dijual dari jumlah yang tersedia
        burger.setJumlah(availableQuantity - quantityToSell);

        // Jika habis terjual, hapus burger dari daftar
        if (burger.getJumlah() == 0) {
            removeBurger(indexBurger);
        }

        // Menampilkan total biaya
        System.out.println("Total biaya: $ " + totalCost);
    }
    // Metode untuk menghapus burger dari daftar
    private static void removeBurger(int index) {
        for (int i = index; i < jumlahBurger - 1; i++) {
            daftarBurger[i] = daftarBurger[i + 1];
        }
        jumlahBurger--;
    }
    
}
    
