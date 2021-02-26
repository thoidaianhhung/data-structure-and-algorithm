package com.company;

public class MyList {

    public int recursive(int n) {
        int sum = 0;
        if(n == 1) {
            return sum = 1;
        }
        return recursive(n - 1) + n;
    }

}
