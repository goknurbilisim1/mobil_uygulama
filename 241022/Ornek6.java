package com.example.uygulama1;

import java.util.Scanner;

public class Ornek6 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int sayi,sonuc=1;
        System.out.print("Bir Sayı Giriniz:");
        sayi= oku.nextInt();

        for(int i=1;i<=sayi;i++){
            sonuc*=i;
        }
        System.out.print("Sonuç: "+sonuc);

    }
}