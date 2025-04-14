package com.mycompany.teamchatapplication;

import java.util.Scanner;
import java.util.regex.Pattern;

    //ST10451316
//Sinenhlanhla Zulu Group 3
   

public class TeamChatApplication {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//message that user will recieve
         System.out.println("Password should be at least 8 characters long with special charaters");
         System.out.println("Cellphone number must start with '0' or '27'");
        System.out.println("If the cellphone number starting with '0', must be 10 digits long");
        System.out.println("If cellphone number starting with '27', must be 12 digits long");
        
  
        System.out.print("Enter username: ");
        String Username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String Password = scanner.nextLine();
        
        System.out.print("Enter Cellphone number: ");
        String Number = scanner.nextLine();
 
        
      
        boolean isAuthenticated = false;
         // Output the result
        if (isAuthenticated) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed! Invalid username, password or Cellphone number.");
        } 

        scanner.close();
    }
    public static boolean Username(String username) {
        if (username.length() < 5) {
            return false;
        }return true;
    }
    
    
    public static boolean Password(String password) {
        if (password.length() < 8) {
            return false;
        }
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }
        if (!password.matches(".*[a-z].*")) { 
            return false;
        }
        if (!password.matches(".*\\d.*")) { 
            return false;
        }
        if (!password.matches(".*[!@#$%^&*()\\-_=+\\[\\]{}|;:'\",.<>?/].*")) { 
            return false;
        }
        if (password.contains(" ")) { 
            return false;
        }
        return true;
    }
    
    public static boolean Number(String Number) {
        if (Number.startsWith("0")) {
            if (Number.length() != 10 || !Number.substring(1).matches("\\d{9}")) {
                return false;
            }
        } else if (Number.startsWith("27")) {
            if (Number.length() != 12 || !Number.substring(2).matches("\\d{10}")) {
                return false;
            }
        } else {
            return false; 
        }
        return true;
    
       
    } 
    private static String createPersonalizedMessage(String Name) {
        return "Welcome, " + Name + "! We're glad to see you here.";
    }
}


