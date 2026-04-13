/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thabiso mashego
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstname, lastname, username, password, phone;
        
        System.out.print("Enter First Name: ");
        firstname = input.nextLine();
        System.out.print("Enter Last Name: ");
        lastname = input.nextLine();
        System.out.print("Enter Username (with underscore, <=5 chars): ");
        username = input.nextLine();
        System.out.print("Enter Password (8+ chars, capital, small, digit, special): ");
        password = input.nextLine();
        System.out.print("Enter Phone Number (starting with +27): ");
        phone = input.nextLine();

        Login login = new Login();
        String result = login.registerUser(username, password, phone);
        System.out.println(result);

        if (result.equals("User is successfully registered")) {
            System.out.println("Proceed to login:");
            System.out.print("Enter Username: ");
            String loginUsername = input.nextLine();
            System.out.print("Enter Password: ");
            String loginPassword = input.nextLine();

            if (login.loginUser(loginUsername, loginPassword)) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Login Failed");
            }
        }
    }
}