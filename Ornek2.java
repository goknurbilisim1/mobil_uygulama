package com.example.uygulama1;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        double sonuc,kisaKenar,uzunKenar,cevre,alan;
        Scanner oku=new Scanner(System.in);

        System.out.print("KısaKenarı Gİr: ");
        kisaKenar=oku.nextDouble();

        System.out.print("UzunKenarı Gir: ");
        uzunKenar=oku.nextDouble();

        cevre=2*(kisaKenar+uzunKenar);
        System.out.println("Çevre Sonuc: "+cevre);

        alan=kisaKenar*uzunKenar;
        System.out.println("Alan Sonuç: "+alan);



    }
}
