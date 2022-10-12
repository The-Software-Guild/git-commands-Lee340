
package com.lee.helloworld;

/**
 *
 * @author boram2
 */
public class Operators {
    public static void main(String[] args) {
        int result;
        int operand1;
        int operand2;
        int operand3;

        result = 0; 
        operand1 = 5;
        operand2 = 7;
        operand3 = operand2;

        // Addition
        result = 42 + 53;
        result = operand1 + operand2;
        result = 1 + operand1; 
        result = 1 + operand1 + operand2 + operand3;

        result = 2;  
        result += 4;  
        result += operand1; 

        // Subtraction
        result = 9 - 5;  
        result = operand1 - operand2;
        result = 15 - operand1;  
        result = 19 - operand1 - operand2 - operand3;

        result = 2;  
        result -= 4;  
        result -= operand1; 


        // Multiplication
        result = 2 * 3;
        
        result = operand1 * operand2;  
        
        result = 2 * operand1;  
        
        result = 2 * operand1 * operand2 * operand3;

        result = 2;  
        result *= 4;
        result *= operand1;


        // Division and Modulus
        result = 6 / 3; 
        
        result = operand1 / operand2;  
        
        result = operand1 % operand2;  
        result = 20 / operand1;  
        
        result = 245 / operand1 / operand2 / operand3;

        result = 40;  
        result /= 4;  
        result /= operand1; 
    }
}
