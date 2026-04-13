/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
package com.mycompany.login;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Registration ===");

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
*/
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter username (must contain _ and be max 5 characters): ");
        String username = scanner.nextLine();

        System.out.print("Enter password (8+ chars, capital, number, special character): ");
        String password = scanner.nextLine();
/*
        System.out.print("Enter cell phone number (e.g. +27838968976): ");
        String cellPhone = scanner.nextLine();

        // Create Login object
        Login login = new Login(firstName, lastName, username, password, cellPhone);

        // Attempt registration
        System.out.println("\n" + login.registerUser());

        // Only proceed to login if registration was successful
        if (login.checkUserName() && login.checkPasswordComplexity() && login.checkCellPhoneNumber()) {
            System.out.println("\n=== Login ===");

            System.out.print("Enter username: ");
            String enteredUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();

            System.out.println("\n" + login.returnLoginStatus(enteredUsername, enteredPassword));
        }

        scanner.close();
    }
}