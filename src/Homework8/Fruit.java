package Homework8;

import java.util.*;
public class Fruit {

    public static void quickSort(ArrayList<String> fruits[], int low, int high) {
        if (fruits.length == 0 || low <= high) {
            return;
        }

        int middle = low + (high - low) /2;
        int border = fruits[middle];
    }


    public static void main(String args[]) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("banana");

        System.out.println(fruits);
        quickSort(fruits);

    }
}
