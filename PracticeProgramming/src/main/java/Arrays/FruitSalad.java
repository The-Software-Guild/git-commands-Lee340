/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.ArrayList;

/**
 *
 * @author boram2
 */
public class FruitSalad {

    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple", "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        int apples = 0;
        int oranges = 0;
        ArrayList<String> ingredients = new ArrayList<String>();

        for (String ingredient : fruit) {
            if (ingredients.size() >= 12) {
                break;
            }
            
            if (ingredient.contains("berry")) {
                ingredients.add(ingredient);
            } else if (ingredient.contains("Apple") && apples < 3) {
                ingredients.add(ingredient);
                apples++;
            } else if (ingredient.contains("Orange") && oranges < 2) {
                ingredients.add(ingredient);
                oranges++;
            } else if (ingredient.contains("Tomato")) {
                
            }
        }
        
        String[] fruitSalad = ingredients.toArray(String[]::new);
        
        for (String ingredient : fruitSalad) {
            System.out.println(ingredient);
        }

    }
}
