package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        double meal_cost = Double.parseDouble(input.nextLine());

        int tip_percent = Integer.parseInt(input.nextLine());

        int tax_percent = Integer.parseInt(input.nextLine());

        solve(meal_cost, tip_percent, tax_percent);
        input.close();
    }

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;
        long total_cost = Math.round(meal_cost + tax + tip);
        System.out.println(total_cost);
    }
}
