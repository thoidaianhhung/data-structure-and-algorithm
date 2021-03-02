package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số người:");
        int number = Integer.parseInt(input.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập số tuổi:");
            int age = Integer.parseInt(input.nextLine());
            Person person = new Person(age);
            person.amIOld();
            for (int j = 0; j < 3; j++) {
                person.yearPasses();
            }
            person.amIOld();
        }
    }
}
