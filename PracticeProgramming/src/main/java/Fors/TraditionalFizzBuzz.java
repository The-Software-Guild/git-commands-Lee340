/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fors;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author boram2
 */
public class TraditionalFizzBuzz {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> fizzbuzz = new ArrayList<Integer>();
        System.out.print("How many units of fizzing and buzzing do you need in your life? ");
        int num = Integer.parseInt(userInput.next());
            int i = 0;
            do { 
                if (i % 5 == 0 && i % 3 == 0) {
                    System.out.println("fizz buzz");
                    i++;
                    fizzbuzz.add(i);
                } else if (i % 3 == 0) {
                    System.out.println("fizz");
                    i++;
                    fizzbuzz.add(i);
                } else if (i % 5 == 0) {
                    System.out.println("buzz");
                    i++;
                    fizzbuzz.add(i);
                } else if (i == 0) {
                    System.out.println(0);
                } else {
                    System.out.println(i);
                    i++;
                } 
            } while (fizzbuzz.size() <= num);
              System.out.println("TRADITION!!!!!");
        } 
    }
