//public class Car {
//
//    // Name of the car
//    String name;
//
//    // Colour of the car
//    String colour;
//
//    // Car goes
////    public String go(){
////        return " goes down the road";
//
//    }
//    // Car slows down
////    public String slow(){
////        return " and slows down";
//    }
//
//    public Car(String name, String colour){
//        this.name = name;
//        this.colour = colour;
//    }
//
//    public static void main (String[] args) {
//        Car audi = new Car ("Audi", "Blue");
//        Car lexus = new Car ("Lexus", "White");
//        Car bentley = new Car ("Bentley", "Black");
//
////        System.out.println("This car is "+ audi.name + " and its colour is " + audi.colour);
////        System.out.println("This car is "+ lexus.name + " and its colour is " + lexus.colour);
////        System.out.println("This car is "+ bentley.name + " and its colour is " + bentley.colour);
////        System.out.println(bentley.name + bentley.go() + bentley.slow());
////        System.out.println(lexus.name + bentley.go() + bentley.slow());
////        System.out.println(audi.name + bentley.go() + bentley.slow());
//    }
//
//
//
//}

public class Car {

    String name;
    String colour;

    int year = 0;

    // CONSTRUCTOR 2 - WITH NO ARGUMENTS

    public static void main (String[] args) {
        Car audi = new Car ();
        audi.name = "Audi";
        audi.colour = "Blue";
        audi.year = 1999;

        Car lexus = new Car ();
        lexus.name = "Lexus";
        lexus.colour = "White";

        Car bentley = new Car ();
        bentley.name = "Bentley";
        bentley.year = 2021;

        System.out.println("This car is "+ audi.name + " its colour is " + audi.colour + " and its year is " + audi.year);
        System.out.println("This car is "+ lexus.name + " its colour is " + lexus.colour);
        System.out.println("This car is "+ bentley.name + " and its year is " + bentley.year);
        }






}