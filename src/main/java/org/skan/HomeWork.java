package org.skan;

public class HomeWork {

    public static void main(String[] args) {
        int a = 2147483647;
        short b = 32767;
        System.out.println("Переполлнение int:");
        System.out.println( a);
        System.out.println("Переполлнение short:");
        System.out.println(b+=10);



        int c = 10;
        int d = 15;
        double e = 52.5;
        double f = 45.5;

        System.out.println("Пробуем различные математические операции:");
        System.out.println(d*c);
        System.out.println(d*e);
        System.out.println(c+f);
        System.out.println(f/c);
        System.out.println(f>d);
        System.out.println(f<d);



    }
}
