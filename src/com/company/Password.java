
package com.company;

import java.util.Random;

public class Password {
    private static final int SIZE = 15;
    private final String alphabet = "ABCDEFGHIJKLMNOPGRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#&?[]";
    private static char[] password = new char[SIZE];
    Random random = new Random();

    Password() {

    }

    void setPassword() {
        for (int i = 0; i < SIZE; i++) {
            password[i] = alphabet.charAt(random.nextInt(alphabet.length()));
        }
    }

    public void printPassword() {
        for (int j = 0; j < 15; j++) {
            System.out.print(password[j]);
        }
        System.out.println();
    }

    public char[] returnPassword(){
        return password;
    }

}