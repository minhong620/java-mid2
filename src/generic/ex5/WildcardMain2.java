package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        writeBox(objBox);
        writeBox(animalBox);
//        writeBox(dogBox); // 하한이 Animal
//        writeBox(catBox); // 하한이 Animal

        Object object = objBox.get();
        Animal animal = animalBox.get();
        System.out.println("object = " + object);
        System.out.println("animal = " + animal);
    }

    // 물음표가 Animal보다 높다
    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}