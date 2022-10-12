/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lee.project1;

import java.util.Scanner;

/**
 *
 * @author boram2
 */
public class Project1 {

        public static void main(String [] args) {
        //declare float variables for height and witdh
        float height;
        float width;
        
        //decalare String variables for user's input
        String stringHeight;
        String stringWidth;
        
        //declare Float variable for area of window, perimeter of window, and cost 
        float areaOfWindow;
        float perimeterOfWindow;
        float cost;
        
        
        //declare and initialise the scaner
        Scanner myScanner = new Scanner(System.in);
        
        //gettin input
        System.out.println("Please enter window height");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width");
        stringWidth = myScanner.nextLine();    
        
        //parse string to float
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
            
        // calculate the area of the window
        areaOfWindow = height * width;

        // calculate the perimeter of the window
        perimeterOfWindow = 2 * (height + width);
        
        // calculate the total cost
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
    
        // display 
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost =  " + cost);
    
    }  
}