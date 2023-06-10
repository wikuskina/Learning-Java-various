public class Programmer {

    String name;
    int age;
    static int count = 0;

    public String writeCode(){
        return " Writes code";
    }

    public static void main (String[] args){
        Programmer anna = new Programmer ();
        anna.name = "Anna";
        anna.age = 25;
        count++;

        Programmer natalia = new Programmer ();
        natalia.name = "Natalia";
        natalia.age = 40;
        count++;


        System.out.println("Programmers name is: " + natalia.name + " and their age is: " + natalia.age);
        System.out.println("Programmers name is: " + anna.name + " and their age is: " + anna.age);
        System.out.println("There are " + count + " programmers in the company");
        System.out.println("Currently "+anna.name + anna.writeCode());
        System.out.println("And " +natalia.name + natalia.writeCode());
    }

}
