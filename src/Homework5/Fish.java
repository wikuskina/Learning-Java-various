package Homework5;

public class Fish extends AbstractAnimal {

    @Override
    void voice() {

        System.out.println("I am fish and I don't talk.");
    }

    @Override // переопределение метода
    void walk() {  // не нужен .super reference потому что не расширяем, а полностью меняем функционал

        System.out.println("I am fish and I don't walk");


    }
}
