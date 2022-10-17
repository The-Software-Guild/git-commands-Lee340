/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Whiles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author boram2
 */
public class LazyTeenager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = sumOfFactorials(input);
        
        System.out.println(result);
    }
    
    public static int sumOfFactorials(int input) {
        int result = 1;
        
        for (int i = 1; i <= input; i++) {
            result += factorial(i);
        }
        
        return result;
    }
    
    static int factorial(int input) {
        int result = 1;
        
        for (int i = 1; i < input; i++) {
            result *= i;
        }
        
        return result;
    }
}
