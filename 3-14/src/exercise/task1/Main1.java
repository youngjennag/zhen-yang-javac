package exercise.task1;

public class Main1 {
    public static void main(String[] args) {
        Animal[] a = new Animal[2];

        a[0] = new Dog();
        a[1] = new Cat();

        for (Animal an: a) {
            an.makeSound();
        }
    }
}
