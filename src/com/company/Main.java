
package com.company;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Password password = new Password();
        Scanner scanner = new Scanner(System.in);
        String userName;
        System.out.println("Enter your name:");
        userName = scanner.nextLine();
        password.setPassword();
        System.out.println("Password generated is:");
        password.printPassword();
        try{
            FileWriter file = new FileWriter("password.txt");
            file.write("user: ");
            file.write(userName);
            file.write(" password ");
            file.write(password.returnPassword());
            file.close();
        }catch (IOException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
}