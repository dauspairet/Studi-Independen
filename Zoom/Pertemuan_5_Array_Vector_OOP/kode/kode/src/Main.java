// import java.util.*;

// public class Main {
    
//     public float tambah(int a, float b){
//         return a+b;
//     }

//     public float tambah(float a, float b){
//         return a + b;
//     }

//     public static void main(String[] args) throws Exception {
        // Array
        // int [] nilai = {100, 90, 70};

        // System.out.println(nilai[0]);
        // System.out.println(nilai[1]);
        // System.out.println(nilai[2]);
        // System.out.println(nilai.length);

        // Array List
        // ArrayList<Integer> umur = new ArrayList<>();
        // umur.add(25);
        // umur.add(30);
        // umur.add(10);
        // System.out.println(umur.get(0));
        // System.out.println(umur.get(0));
        // System.out.println(umur.get(1));
        // System.out.println(umur.get(2));
        // System.out.println(umur.size());

        // vector
        // Vector<String> nama = new Vector<>();
        // nama.add("Indonesia");
        // nama.add("Malaysia");
        // nama.add("Filipina");
        // System.out.println(name.get(0));
        // System.out.println(name.get(0));
        // System.out.println(name.get(1));
        // System.out.println(umur.size());
        
        // Manusia m = new Manusia("Vannesa", "Indonesia");
        // m.perkenalanDiri();
        // m.makan();

        // Dosen vannessa = new Dosen("Vannessa", "Course-net", "123");
        // vannessa.perkenalanDiri();

        // Mahasiswa mhs = new Mahasiswa("Vannessa", "Universitas XYZ", "456");
        // mhs.perkenalanDiri();
//     }
// }

/*Latihan*/

// Interface untuk fungsi-fungsi yang harus disediakan oleh kelas yang mengimplementasikannya
interface MenuActions {
    void addBurger();
    void sellBurger();
    void updateBurgerData();
    void exit();
}

// Abstract class yang menyediakan fungsi umum dan menampilkan menu
abstract class MenuHome {
    public void displayMenu() {
        System.out.println("Course-Net Burger");
        System.out.println("-------------------------");
        System.out.println("1. Add Burger");
        System.out.println("2. Sell Burger");
        System.out.println("3. Update Data Burger");
        System.out.println("4. Exit");
    }

    public abstract void executeOption(int choice);
}

// Implementasi kelas yang menggabungkan abstract class dengan interface untuk mengimplementasikan fungsi-fungsi menu
class BurgerMenu extends MenuHome implements MenuActions {
    private int totalIncome;

    @Override
    public void addBurger() {
        System.out.println("Adding a new burger to the menu...");
        // Implementasi logika untuk menambahkan burger
    }

    @Override
    public void sellBurger() {
        System.out.println("Selling a burger...");
        // Implementasi logika untuk menjual burger
    }

    @Override
    public void updateBurgerData() {
        System.out.println("Updating burger data...");
        // Implementasi logika untuk memperbarui data burger
    }

    @Override
    public void exit() {
        System.out.println("Exiting the program...");
        // Implementasi logika untuk keluar dari program
    }

    @Override
    public void executeOption(int choice) {
        switch (choice) {
            case 1:
                addBurger();
                break;
            case 2:
                sellBurger();
                break;
            case 3:
                updateBurgerData();
                break;
            case 4:
                exit();
                break;
            default:
                System.out.println("Invalid choice! Please choose a number between 1 and 4.");
        }
    }

    // Method untuk menambahkan total pemasukan
    public void addToTotalIncome(int amount) {
        totalIncome += amount;
    }

    // Method untuk mendapatkan total pemasukan
    public int getTotalIncome() {
        return totalIncome;
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas BurgerMenu
        BurgerMenu menu = new BurgerMenu();

        // Menampilkan menu awal
        menu.displayMenu();

        // Menjalankan program
        // Misalnya, jika user memilih menu nomor 2 (Sell Burger)
        menu.executeOption(2);
    }
}
