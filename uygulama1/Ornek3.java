package com.example.uygulama1;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        float y1,y2,ortalama;

        System.out.print("1. Yazılı: ");
        y1= oku.nextFloat();

        System.out.print("2. Yazılı: ");
        y2= oku.nextFloat();

        ortalama=(y1+y2)/2;
        System.out.println("Ortalama: "+ortalama);

        if(ortalama<=1 & ortalama>=50){
            System.out.println("Kaldı");
        }
        else if (ortalama>=50 & ortalama<60){
            System.out.println("2 ile Geçtiniz");
        }
        else if (ortalama>=60 & ortalama<70){
            System.out.println("3 ile Geçtiniz");
        }
        else if (ortalama>=70 & ortalama<85){
            System.out.println("4 ile Geçtiniz");
        }
        else{
            System.out.println("5 ile Geçtiniz");
        }

    }
}