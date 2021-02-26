package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner input = new Scanner(System.in);
        System.out.print("Import integer: ");
        int n = Integer.parseInt(input.nextLine());
        System.out.print("Import double: ");
        double m = Double.parseDouble(input.nextLine());
        System.out.print("Import string: ");
        String text = input.nextLine();

        System.out.println();
        System.out.println(i + n);
        System.out.println(d + m);
        System.out.println(s + text);
    }
}
