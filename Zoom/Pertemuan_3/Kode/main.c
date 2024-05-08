#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>
#define clear() fflush(stdin);

int main(){
    
    // Stdio.h - 
    // printf, scanf, getchar, puts

    // Ctype.h - 
    // library untuk manipulasi karakter
    // char inisial = 'c';
    /* 
    apakah karakter ini adalah alfabet
    0 = false
    1 = true
    2 = true
    */ 
    // printf("isalpha = %d\n", isalpha(inisial));

    // if(inisial >= 'A' && inisial <= 'Z'){
    //     puts("Ini adalah huruf kapital");
    // }
    // else if(inisial >= 'a' && inisial <= 'z'){
    //     puts("Ini adalah huruf kecil");
    // }
    // else if (inisial >= '0' && inisial <= '9')
    // {
    //     puts("Ini adalah digit");
    // }
    

    /*
    apakah karakter ini nomor
    */
    // printf("isdigit = %d\n", isdigit(inisial));

    // inisial = tolower(inisial);
    // printf("tolower = %c\n", tolower('A'));
    // inisial = toupper(inisial);
    // printf("toupper = %c\n", toupper('A'));

    // String.h - 
    // manipulasi string
    // char nama[100] = "Coursenet Indonesia";
    
    // cek panjang string
    // int length = strlen(nama);
    // printf("strlen = %d\n", length);

    // copy string
    // int a = 10;
    // int b = a;
    
    // char str[50] = "Coursenet";
    // strcpy([str dest], [str target]);
    // strcpy(str, nama);
    // printf("str     : %s\n", str);
    // printf("nama    : %s\n", nama);
    
    // membandingkan string
    // strcmp([str1, [str2]]);
    // printf("%d", strcmp(nama, str));
    // printf("nama = str = %d\n", strcmp(nama, str));
    // printf("AA = AB = %d\n", strcmp("AA", "AB"));
    // printf("AA = AA = %d\n", strcmp("AA", "AA"));
    // printf("a = A = %d\n", strcmp("a", "A"));

    // strrev string reverse (tidak direkomendasikan)
    // Halo >> olaH

    // Stdlib.h -
    // random srand
    // srand(time(NULL));
    // for (int i = 0; i <= 10; i++)
    // {
    //     for (int j = 0; j <= 10; j++)
    //     {
    //         printf("%5d ", rand());
    //     }
    //     puts("");
    // }

    // struct mahasiswa
    // {
    //     char nama[10];
    //     char alamat[10];
    //     int umur;
    // }mhs1;

    
    // scanf("%[^\n]", mhs1.nama);
    // clear();
    // scanf("%[^\n]", mhs1.alamat);
    // clear();
    // scanf("%d", &mhs1.umur);
    // clear();
    
    // printf("Nama    = %s\n", mhs1.nama);
    // printf("Alamat  = %s\n", mhs1.alamat);
    // printf("Umur    = %d\n", mhs1.umur);

    char input[100];
    // masukan
    scanf("%[^\n]", input);
    clear();

    // menghitung panjang kata
    int panjangKata;
    panjangKata = strlen(input);

    // Output sebelum
    printf("Sebelum = %s\n", input);

    // Proses perubahan
    for (int i = 0; i < panjangKata; i++)
    {
        if (i % 2 == 0)
        {
            input[i] = toupper(input[i]);
        }
        else{
            input[i] = tolower(input[i]);
        }
    }
    
    // Output sesudah
    printf("Sesudah = %s\n", input);

    return 0;
}