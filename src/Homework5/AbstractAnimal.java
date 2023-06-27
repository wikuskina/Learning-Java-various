package Homework5;

public abstract class AbstractAnimal {
    abstract void voice(); // реализации у абстрактых классов нет, она будет описана в подклассах
    void walk() {
        System.out.println("I am an animal and I cal walk");
    }
}
