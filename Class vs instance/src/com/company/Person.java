package com.company;

public class Person {
    public int age;

    public Person(int initialAge) {
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
        }
        age = initialAge;
    }

    public void amIOld() {
        String s;
        if (age < 13) {
            s = "You are young.";
        } else if (age < 18) {
            s = "You are a teenager.";
        } else {
            s = "you are old.";
        }
        System.out.println(s);
    }

    public void yearPasses() {
        age += 1;
    }
}
