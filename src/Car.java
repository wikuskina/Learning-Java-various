public class Car {

    // Name of the car
    String name;

    // Colour of the car
    String colour;

    public Car(String name, String colour){
        this.name = name;
        this.colour = colour;
    }

    public static void main (String[] args) {
        Car audi = new Car ("Audi", "Blue");
        Car lexus = new Car ("Lexus", "White");
        Car bentley = new Car ("Bentley", "Black");

        System.out.println("This car is "+ audi.name + " and its colour is " + audi.colour);
        System.out.println("This car is "+ lexus.name + " and its colour is " + lexus.colour);
        System.out.println("This car is "+ bentley.name + " and its colour is " + bentley.colour);
    }



}
