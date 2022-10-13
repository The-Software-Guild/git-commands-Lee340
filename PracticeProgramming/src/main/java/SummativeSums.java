/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boram2
 */
public class SummativeSums {
        public static void main(String[] args) {
            int[] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
            int[] array2 = { 999, -60, -77, 14, 160, 301 };
            int[] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };

            int sum1 = summation(array1);
            int sum2 = summation(array2);
            int sum3 = summation(array3);
            
            System.out.println("#1 Array 1: " + sum1);
            System.out.println("#2 Array 2: " + sum2);
            System.out.println("#3 Array 3: " + sum3);
            
        }
        
        static int summation(int[] numbers) {
            int result = 0;
            
            for (int i = 0; i < numbers.length; i++) {
                result += numbers[i];
            }
            
            return result;
        }
}
