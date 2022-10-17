/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MidpointAssessment;

import java.util.*;
/**
 *
 * @author boram2
 */
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        
        if (isPerfectSquare(input)) {
            System.out.println(input + " is a perfect square number");
        } else {
            System.out.println(input + " is not a perfect square number");
        }
    }
    
    static boolean isPerfectSquare(int input) {
        long root = Math.round(Math.sqrt(input));
        return root * root == input;
    }
}