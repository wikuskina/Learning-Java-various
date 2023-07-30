package Homeowork9;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

public class Animals {
    public String name;
    public int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

        public static void main (String[] args) {
        List<Animals> animals = new ArrayList<>();
        animals.add(new Animals("cow", 1));
        animals.add(new Animals("pig", 2));
        animals.add(new Animals("cat", 3));
        animals.add(new Animals("dog", 4));
        animals.add(new Animals("duck", 5));
        animals.add(new Animals("tiger", 6));
        animals.add(new Animals("zebra", 7));
        animals.add(new Animals("elephant", 8));
        animals.add(new Animals("hippo", 9));
        animals.add(new Animals("horse", 10));
        animals.add(new Animals("lion", 15));

//            for (Animals animal : animals) {
//                if (animal.getAge() > 5) {
//                    System.out.println(
//                            "Животное: " +
//                                    animal.getName() +
//                                    "; возраст: " +
//                                    animal.getAge()
//                    );
//                }
//            }
//            // all animals older than fiver years old
//            animals.stream()
//                    .filter(animal -> animal.getAge() > 5)
//                    .forEach(animal -> System.out.println(
//                            "Животное: " +
//                                    animal.getName() +
//                                    "; возраст: " +
//                                    animal.getAge())
//                    );
//
//            Animals lion = animals.stream().filter(animal -> animal.getName().equals("lion"))
//                    .findAny().orElseThrow(() -> new IllegalArgumentException("No lion sorry!"));
//           System.out.println("There is a lion, and his age is: " + lion.getAge());


//           animals.stream().sorted().forEach( System.out::println);

//            List<Animals> oldAnimals = animals.stream().sorted(Comparator.comparingInt(Animals::getAge))
//                  .toList();
//
//           for (Animals i : oldAnimals){
//               System.out.println(i.getName() + " is " + i.getAge() + " years old." + "\n");
//           }

//            List<Animals> oldAnimals =
//                    animals.stream().filter(item -> item.getAge()==4).collect(Collectors.toList());
//
//            for (Animals i : oldAnimals){
//               System.out.println(i.getName() + " is " + i.getAge() + " years old." + "\n");
//           }


//            long agedFour = animals
//                    .stream()
//                    .filter(c -> c.getAge() > 4)
//                    .count();
//
//            System.out.println(agedFour + " animals older than 4 years, together with Lion.");
//


            Map<String, Animals> animalsMap = animals.stream()
                    .collect(Collectors.toMap(Animals::getName,
                            Function.identity()));

            Map<String, Animals> map = animalsMap;
            for (Map.Entry<String, Animals> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

//            System.out.println(animalsMap);




    }


}