package generic.ex4;

import generic.animal.Animal;

// 앞서서는 제네릭 타입으로만 만들었던 것을 제네릭 메서드로 다시 만든다
public class AnimalMethod {

    public static <T extends Animal> void checkup(T t) {
        System.out.println("동물 이름: " + t.getName());
        System.out.println("동물 크기: " + t.getSize());
        t.sound();
    }

    // 제네릭 메서드에 'static'을 붙이는 이유는 제네릭 타입 파라미터를 클래스의 인스턴스가 아닌 메서드 자체에 종속시키기 위해서이다
    // 이를 통해 클래스의 인스턴스와 무관하게 메서드가 독립적으로 동작할 수 있다
    public static <T extends Animal> T bigger(T t1, T t2) {
        return t1.getSize() > t2.getSize() ? t1 : t2;
    }
}
