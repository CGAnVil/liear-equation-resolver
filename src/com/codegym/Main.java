package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 1");
        System.out.println("Phương trình bậc 1 có dạng:'ax + b = c' mời nhập các hằng số");
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println("Phương trình có nghiệm là x = "+answer);
        }else if(b==c){
            System.out.println("Phương trình vô số nghiệm");
        }else {
            System.out.println("Phương trình vô nghiệm");
        }

    }
}
