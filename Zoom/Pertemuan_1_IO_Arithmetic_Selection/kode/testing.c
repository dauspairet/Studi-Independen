#include <stdio.h>
#include <stdbool.h>
// #include <string.h>


int main(){

// template variable:
// [tipe data] [nama var] (= [isi]);
    int nilai = 100; // deklarasi
    int umur = 10; // inisialisasi
    umur = 15; // re-assignment

    char grade = 'A';

// Output

    // printf
    // printf("Hello world\n");
    // printf("Umur user %d %d", umur, nilai);
    // printf("Grade adalah %c\n", grade);

    // printf("%-10s : %d\n", "Umur", umur);
    // printf("%-10s : %d\n", "Nilai", nilai);
    // printf("%-10s : %c\n", "Grade", grade);

    // printf("Mr bilang, \"Hallo Semua\". Baterai 100%%");

    // putchar
    // putchar('H');

    // puts
    // 1. Maksimal Paramater
    // 2. Otomatis menambah garis baru
    // 3. Hanya untuk string
    // puts("\nHello world");

    
// Input
    // printf("Sebelum masukkan -> Grade = %c\n", grade);

    // scanf
    // printf("Masukkan huruf \n");
    // scanf("%c", &grade);
    // printf("Output huruf %c", grade);

    // getchar
    // grade = getchar();
    // printf("%c", grade);

    // gets
    // char alamat[100] = "Indonesia";
    // printf("Sebelum perubahan -> %s\n", alamat);
    // gets(alamat);
    // puts(alamat);

    // Membatasi 5 karakter
    // scanf("%5s", alamat);
    // printf("Hasil = %s", alamat);


    char ch;
    char ch2;

    // scanf("%c", &ch);
    // getchar();
    // fflush(stdin);

    // scanf("%c", &ch2);
    // getchar();

    // printf("ch = %c--\n", ch);
    // printf("ch2 = %c--\n", ch2);

// Operator
    int a = 10,
    b = 20,
    c = 15;

    // printf("a + b = %d\n", a+b);
    // printf("a - b = %d\n", a-b);
    // printf("a * b = %d\n", a*b);
    // printf("a / b = %d\n", a/b);
    // printf("a %% b = %d\n", a%b);

    //++
    // pre increment (sebelum perintah)
    // printf("%d\n", ++a);

    // post increment (setelah perintah)
    // printf("%d\n", a++);

    // printf("%d\n", a);

    //--
    // pre decrement
    // printf("%d\n", --a);

    // post decrement
    // printf("%d\n", a--);

// bool hasil;
    // 10 < 20 = apakah 10 kurang dari 20? (ya/tidak)
    // 1 = true (non-zero)
    // 0 = false
    // printf("a < b = %d\n", a < b);

    // a == 10 -> apakah a sama dengan (adalah) 10? (Perbandingan)
    // a = 10 -> pernyataaan a sama dengan 10 (Assignment)

    // 10 < 20 < 15
    // 10 < 20 = 1
    // 1 < 15 = 1

    a = 1,
    b = 2,
    c = 15;
    printf("a && b = %d\n", a && b);
    printf("a & b = %d\n", a & b);

    return 0;
}