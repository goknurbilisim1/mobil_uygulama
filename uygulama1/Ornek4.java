package com.example.uygulama1;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        float sayi1,sayi2,sonuc,secim;

        System.out.print("1. Sayı:");
        sayi1= oku.nextFloat();


        System.out.print("2. Sayı:");
        sayi2= oku.nextFloat();

        System.out.println("(1) Topla");
        System.out.println("(2) Çıkar");
        System.out.println("(3) Çarpma");
        System.out.println("(4) Böl");
        System.out.println("Seçim Yap: ");
        secim= oku.nextFloat();

        if(secim==1){
            sonuc=sayi1+sayi2;
            System.out.println("Sonuç: "+sonuc);
        }
        else if(secim==2){
            sonuc=sayi1-sayi2;
            System.out.println("Sonuç: "+sonuc);
        }
        else if(secim==3){
            sonuc=sayi1*sayi2;
            System.out.println("Sonuç: "+sonuc);
        }
        else{
            sonuc=sayi1*sayi2;
            System.out.println("Sonuç: "+sonuc);
        }


    }
}
