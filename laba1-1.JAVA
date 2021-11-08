package com.laba.cu.laba1;

import java.util.Arrays;
import java.util.Scanner;

public class Stroki {

    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.print("Введите количество строк :");

        int n = scaner.nextInt();
        String[] strokik = new String[n];
        int[] arrays = new int[n];

        System.out.println("Введите " + n + " сторк:");

        strokik [0] = scaner.nextLine();
        arrays [0] = strokik[0].length();

       for (int i=0;i<n;i++){
           //System.out.println(i);
           strokik [i]= scaner.nextLine();
           arrays[i] = strokik[i].length();
       }

        int max = arrays[0],min = arrays[1];
        for (int i=0;i<n;i++){
            if (arrays[i]>max){
                max = arrays[i];
            }
            if (arrays[i]<min){
                min = arrays [i];
            }
        }
        int midle = (min+max)/2;

        System.out.println("Строки размер которых меньше среднего:");
        for (int i=0;i<n;i++){
            //System.out.println(arrays[i]);
            if (strokik[i].length()<midle){
                System.out.println(strokik[i]);
            }
        }
    }
}
