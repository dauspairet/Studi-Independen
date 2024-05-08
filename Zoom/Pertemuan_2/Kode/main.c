#include <stdio.h>

// prototype function
void printByValue(int angka);
void printByReference(int *angka);
// void printByAddress(int &angka);

void printByValue(int angka){
    angka = 100;
    printf("By value = %d\n", angka);
    printf("Alamat by value = %p\n", &angka);
}

void printByReference(int *angka){
    *angka = 100;
    printf("By reference = %d\n", *angka);
    printf("Alamat angka = %p\n", angka);
    printf("Alamat &angka = %p\n", &angka);
}

    // void printByAddress(int &angka){
    //     angka = 100;
    //     printf("By address = %d\n", angka);
    //     printf("Alamat &angka = %p\n", &angka);
    // }

int main(){
    /*Selection*/

    /* # if else
    if ([kondisi])
    {
        ...        
    } else{
        ...
    }
    */

    // ## Contoh
    // int nilai = 60;
    // char gender = 'P';
    // 100 >= 90 ? TRUE
    // if (nilai >= 90)
    // {
    //     puts("Selamat! Kamu dapat hadiah.");
    //     // Nested selection/condition
    //     if (gender == 'P')
    //     {
    //         puts("Hadiahnya adalah make up.");
    //     }
    //     else if (gender == 'L')
    //     {
    //         puts("Hadiahnya adalah game.");
    //     }
    //     else{
    //         puts("No gender :O");
    //     }
    // }else if (nilai >= 75)
    // {
    //     puts("Selamat sudah lulus.");
    // }else if (nilai >= 50)
    // {
    //     puts("Mungkin bisa belajar lebih giat lagi.");
    // }    
    // else
    // {
    //     puts("Sayang sekali.");
    // }

    // # Switch Case
    // hanya bisa perbandingan "=="
    // char grade = 'B';
    // switch (grade)
    // {
    // case 'A':
    //     puts("Baik Sekali");
    //     break;
    // case 'B':
    //     puts("Baik");
    //     break;
    // case 'C':
    //     puts("Cukup");
    //     break;
    // default:
    //     puts("Invalid");
    //     break;
    // }    

    // # Ternary Operator
    // [kondisi] ? [jika benar] : [jika salah];
    // nilai = 100;
    // if (nilai >= 90)
    // {
    //     puts("Dapat Hadiah");
    // }
    // else if (nilai >= 60)
    // {
    //     puts("Lulus");
    // }

    // nilai >= 90 ? printf("Ada\n") : printf("Tidak");

    // ------------------------------------------------
    /*Looping/Repetition/Perulangan */

    /* for
    for([inisialisasi]; [kondisi]; [perubahan data]){
         ...
    }
    */ 

    // int count = 10;
    // puts("For :");
    // for (int i = 0; i < count; i++)
    // {
    //     printf("%d\n", i+1);
    // }
    // puts("");

    // while
    /*
    while([kondisi]){
        ...
    }
    */

    // puts("While : ");
    // int i = 1;
    // while (i <= 10)
    // {
    //     printf("%d\n", i);
    //     i++;
    // }

    // int i = 1;
    // do
    // {
    //     printf("%d", i);
    //     i++;
    // } while (i <= 10);
    
    // ------------------------------------------------
    /*Array Pointer*/

    // # Array
    // Ukuran -1
    // char alamat[100] = "Indonesia";
    // char nama[10] = {'H', 'a', 'l', 'o'};

    // int nilai[3] = {100, 90, 80};

    // printf("%s\n", alamat);
    // printf("%d\n", nilai[0]);
    // printf("%d\n", nilai[1]);
    // printf("%d\n", nilai[2]);

    // for (int i = 0; i < 3; i++)
    // {
    //     printf("Data ke-%d = %d\n", i+1,nilai[i]);
    // }
    
    // # Pointer
    // int angka = 10;
    // int *pAngka = &angka;

    // printf("angka = %d\n", angka);
    // printf("pAngka = %p\n", pAngka);
    // printf("*pAngka = %d\n", *pAngka); // dereference / derefencing

    // char kalimat[100] = "Halo";
    // scanf("%s", kalimat);

    // printf("kalimat = %p\n", kalimat);
    // printf("&kalimat = %p\n", &kalimat);
    // printf("&kalimat[0] = %p\n", kalimat[0]);

    // for (int i = 0; i < 3; i++)
    // {
    //     printf("Data %d alamat %p\n", i+1, &kalimat[i]);
    // }
    
    // ------------------------------------------------------
    /*Function*/

        // Cara passing data di function
    int angka = 10;
    printf("main = %d\n", angka);
    printf("Alamat by value = %p\n", &angka);

    // 1. Passing by value
    /*
    Meng-copy value tanpa mengubah data asli karena hal yang berbeda
    */
    // printByValue(angka);
    
    

    // 2. Passing by reference (pointer)
    /*
    Data saling terpengaruhi jika salah satu diubah
    */
   printByReference(&angka);

    // 3. Passing by address
    /*
    Tidak ada data copy, data asli diubah secara langsung
    */
    // printByAddress(angka);

    printf("main = %d\n", angka);
    printf("Alamat di main = %p\n", &angka);

    return 0;
}

