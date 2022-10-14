
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author boram2
 */
public class LuckySevens {
    public static void main(String[] args) {

            Random roll = new Random();
            Scanner userInput = new Scanner(System.in);
            int usersMoney, dice1, dice2;
            boolean no_sevens = true;
            
            System.out.print("How many dollars do you have? ");
            int usersMoney = Integer.parseInt(userInput.nextLine());
            
            while (no_sevens) {
                dice1 = Math.abs(roll.nextInt()) % 6 + 1;
                dice2 = Math.abs(roll.nextInt()) % 6 + 1;

                if ((dice1 + dice2) == 7) {
                    usersMoney += 4;
                    no_sevens = false;
                } else {
                    usersMoney -= 1;
                }
                }
    
    }
}
