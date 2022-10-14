/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author boram2
 */
public class FruitSalad {
    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad;

        // Code Recipe for fruit salad should go here!
        int numBerries = 0;
        int numApples = 0;
        int numOranges = 0;

        for (String fruit1 : fruit) {
            if (fruit.contains("berry")) {
                System.out.println(fruit1);
            }
        }
        
        for (int j = 0; j < fruit.length; j++) {
            if (fruit[j] == "Apple") {
                numApples++;
            }
        }
        
        for (int k = 0; k < fruit.length; k++) {
            if (fruit[k] == "Orange") {
                numOranges++;
            }
        }
        
        System.out.println("Fruit salad: " + numBerries);
        
    }
}
