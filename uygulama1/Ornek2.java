package com.example.uygulama1;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int derece1;

        System.out.print("Derece Gir:");
        derece1= oku.nextInt();

        if(derece1<=5){
            System.out.println(" Çok Soğuk");
        }
        else if (derece1<=20){
            System.out.println("Soğuk");
        }
        else if (derece1<=20 && derece1>=27){
            System.out.println("Normal");
        }
        else if (derece1<=27 && derece1>=35){
            System.out.println("Sıcak");
        }
        else{
            System.out.println("Çok Sıcak");
        }

    }
}
