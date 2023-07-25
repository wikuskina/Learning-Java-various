
package Homework7;

import java.util.*;

public class CharCounter {
    public static void countChars(String s) {
        HashMap<Character, Integer> countedCharacters = new HashMap <Character, Integer>();
        for (char c : s.toCharArray()) {
            if (countedCharacters.containsKey(c)) {
                countedCharacters.put(c, countedCharacters.get(c) + 1);
            } else {
                countedCharacters.put(c, 1);
                }
            }
        for (char c : countedCharacters.keySet()) {
            System.out.println(c + ": " + countedCharacters.get(c));
        }
        }
    public static void main (String[] args) {
        String s = "Viktorija Sokolova";
        countChars(s);
    }
    }


