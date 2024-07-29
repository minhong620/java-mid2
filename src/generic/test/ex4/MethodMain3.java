package generic.test.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        // 제네릭 타입보다 제네릭 메서드가 높은 우선순위를 가진다
        Cat returnCat = hospital.printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);
    }
}
