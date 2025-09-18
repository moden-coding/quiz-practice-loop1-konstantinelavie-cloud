/**
 *  Write a Java program that reads an unspecified number of integers from the user 
 *  until the user enters -1. For each number, indicate whether it is odd or even. 
 *  After the user enters -1, print the count of even and odd numbers entered.
 */

import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

            int val1 = 0;
            int val2 = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;} 
            if (number % 2 == 0) {
                System.out.println("EVEN.");
                val1++;
            } else {
                System.out.println("ODD.");
                val2++;
            }
                
            } System.out.println("The sum of even and odd numbers is " + (val1 + val2));
        
        } 
    }

