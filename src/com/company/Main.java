package com.company;

import com.sun.nio.sctp.SctpServerChannel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        no1();
        no2();
        no3();
    }
    public static void no1() {
        //tampilkan output judul
        System.out.println("###Aris Heryana###");
        System.out.println("****Memisahkan bilangan ganjil dan genap****");
        System.out.print("Masukan bilangan :");
        //deklarasi variabel dan Scanner
        Scanner keyboard = new Scanner(System.in);
        int i = keyboard.nextInt();
        System.out.println("Bilangan ganjil");
        //bilangan ganjil
        for (int x = 1; x <= i; x += 2) {
            System.out.print(" "+x);
        }
        System.out.println("\nBilangan genap");
        //bilangan genap
        for (int y = 2; y <=i; y +=2) {
            System.out.print(" " + y);
        }

    }
    public static void no2() {
        //tampilkan output judul
        System.out.println("\n****Membandingkan angka besar dan kecil****");
        System.out.print("Masukan bilangan pertama:");
       //tampilkan scanner
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        System.out.print("Masukan bilangan kedua:");
        Scanner scan1 = new Scanner(System.in);
        int y = scan1.nextInt();

        //perintah
        if (i<y){
            System.out.print("Bilangan kedua lebih besar");
        } else if (i > y) {
            System.out.print("Bilangan pertama lebih besar");
        }else if (i==y){
            System.out.print("Bilangan sama besar");
        }


    }
    public static void no3() {
        //tampilkan output judul
        System.out.println("\n****Mencari jumlah volume kerucut****");

        //Membuat Scanner
        Scanner r = new Scanner(System.in);
        System.out.print("Masukan r:");
        int r1 = r.nextInt();
        Scanner t = new Scanner(System.in);
        System.out.print("Masukan t: ");

        //Deklarasi variabel
        int t1 = t.nextInt();
        double pi1 = 3.14;
        int pi2 = 22 / 7;
//
        //Proses
         double volume = pi1 * r1* r1 * t1 / 3;
         int volume2 = pi2 * r1 * r1 * t1 / 3;

         //Perintah
        if ( r1 % 7 == 0){
        System.out.print("Menggunakan pi 22/7 \n"+volume2);
        }else {
            System.out.print("Menggunakan pi 3.14 \n"+volume);
        }
    }


}
