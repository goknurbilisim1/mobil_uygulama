package com.example.uygulama1;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
         float y1,y2,ortalama;
         int devamsizlik;

        System.out.print("1. Yazılı:");
        y1= oku.nextFloat();

        System.out.print("2. Yazılı:");
        y2= oku.nextFloat();

        ortalama=(y1+y2)/2;
        System.out.println("Ortalama: "+ortalama);
        System.out.println("Devamsızlık Gir:");
        devamsizlik= oku.nextInt();

        if(devamsizlik>=10){
            System.out.print(" Devamsızlıktan Kaldı.");
        }
        else if (ortalama<=50) {
            System.out.print("Ortalama ile kaldınız.");
        }
        else{
            System.out.print("Geçtiniz:)");
        }


    }
}
