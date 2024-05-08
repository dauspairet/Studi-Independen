import java.util.*;

public class Main {

    Scanner input = new Scanner(System.in);

    public Main(){ // Constructor
        // System.out.print("Hello, World!");
        // System.out.println("Hello, World!");
        // System.out.printf("%10s : Hello World", "Kata");
    
        // input
        // int angka;
        // angka = input.nextInt();
        // System.out.println(angka);

        // float IPK;
        // IPK = input.nextFloat();
        // System.out.println(IPK);

        // input.nextLine(); // string lengkap
        // input.next(); // string 1 kata
        // input.next().charAt(0); // char

        // int[] nilai = {100, 90, 80};
        // System.out.println(nilai[0]);
        // System.out.println(nilai[1]);
        // System.out.println(nilai[2]);

        // for (int i = 0; i < nilai.length; i++) {
        //     System.out.println(nilai[i]);
        // }

        // for (int i : nilai) {
        //     System.out.println(i);
        // }

        // Wrapper class
        // int umur = 20;
        // Integer umur2 = 20;

        // String angka = "123";
        // umur2 = Integer.parseInt(angka);

        // System.err.println(umur2);

        /*Latihan soal*/
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Welcome to Course-Net");
        // System.out.println("---------------------");

        // // Meminta input pengguna
        // System.out.print("Enter your NIM         : ");
        // int nim = scanner.nextInt();
        
        // scanner.nextLine();
        // System.out.print("Enter your full name   : ");
        // String fullName = scanner.nextLine();

        // System.out.print("Enter your age         : ");
        // int age = scanner.nextInt();

        // System.out.print("Enter your GPA target  : ");
        // float gpaTarget = scanner.nextFloat();

        // // Menampilkan data yang dimasukkan pengguna
        // System.out.println("\nBelow this, they are your data:");
        // System.out.println("NIM         : " + nim);
        // System.out.println("Full Name   : " + fullName);
        // System.out.println("Age         : " + age);
        // System.out.println("GPA Target  : " + gpaTarget);

        // // Menutup scanner
        // scanner.close();
        
        System.out.println("Odd or Even number");
        System.out.println("------------------");
        System.out.print("Input A Number : ");
        int bilangan = scanner.nextInt();
        
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " is Even Number");
        }else{
            System.out.println(bilangan + " is Odd Number");
        }
    }

    public static void main(String[] args) throws Exception {
        new Main();
    }
}
