package Homework8;

import java.util.*;

public class Grades {
    public Grades(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Grades{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }

    public String name;
    public double mark;

}
