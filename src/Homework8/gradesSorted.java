package Homework8;

import java.util.*;
public class gradesSorted {

    // массиво класса Grades & instances of it
    public static void main (String [] args) {
        Grades [] grades = {new Grades ("Иванов", 4.5),
                new Grades ("Петров", 3.7),new Grades ("Сидоров", 4.2),
                new Grades ("Козлов", 5.0),
                new Grades ("Смирнов", 3.9)};

        // bubble sort algorithm

        for (int i = 0; i < grades.length; i ++) {
            for (int k = 0; k < grades.length - i - 1; k++)  {
                while (grades[k+1].mark < grades[k].mark) {    // if larger, swapping places (as per bubble sort)
                    var student = grades[k];
                    grades[k] = grades[k+1];
                    grades[k+1] = student;
                }
            }
        }
        System.out.println(Arrays.toString(grades));

    }


}
