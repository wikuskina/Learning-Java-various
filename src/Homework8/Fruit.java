//package Homework8;
//
//import java.util.*;
//public class Fruit {
//
//    public static void quickSort(String [] fruits, int start, int end) {
//        // index for the "left-to-right scan"
//        int i = start;
//        // index for the "right-to-left scan"
//        int j = end;
//
//        // only examine arrays of 2 or more elements.
//        if (j - i >= 1) {
//            // The pivot point of the sort method is arbitrarily set to the first element int the array.
//            String pivot = fruits[i];
//            // only scan between the two indexes, until they meet.
//            while (j > i) {
//                // from the left, if the current element is lexicographically less than the (original)
//                // first element in the String array, move on. Stop advancing the counter when we reach
//                // the right or an element that is lexicographically greater than the pivot String.
//                while (fruits[i].compareTo(pivot) <= 0 && i < end && j > i){
//                    i++;
//            }
//                // from the right, if the current element is lexicographically greater than the (original)
//                // first element in the String array, move on. Stop advancing the counter when we reach
//                // the left or an element that is lexicographically less than the pivot String.
//                while (fruits[j].compareTo(pivot) >= 0 && j > start && j >= i){
//                    j--;
//                }
//                // check the two elements in the center, the last comparison before the scans cross.
//                if (j > i)
//                    swap(fruits, i, j);
//            }
//            // At this point, the two scans have crossed each other in the center of the array and stop.
//            // The left partition and right partition contain the right groups of numbers but are not
//            // sorted themselves. The following recursive code sorts the left and right partitions.
//
//            // Swap the pivot point with the last element of the left partition.
//            swap(fruits, start, j);
//            // sort left partition
//            quickSort(fruits, start, j - 1);
//            // sort right partition
//            quickSort(fruits, j + 1, end);
//
//
//        }
//    }
//    private static void swap(String[] fruits, int i, int j)
//    {
//        String temp = fruits[i];
//        fruits[i] = fruits[j];
//        fruits[j] = temp;
//    }
//
//    public static void main(String args[]) {
//        String [] fruits = new String [9];
//        fruits[0]= "orange";
//        fruits[1] = "grape";
//        fruits[2] = "apple";
//        fruits[3] = "banana";
//        System.out.println(fruits);
//        quickSort(fruits);
//
//    }
//}
