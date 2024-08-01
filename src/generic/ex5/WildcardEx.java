package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {

    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    // Box<Dog>, Box<Cat>, Box<Object>가 모두 들어올 수 있다
    // 제네릭 메서드가 아니라 일반적인 메서드이다
    // 와일드카드는 일반적인 메서드이기 때문에 제네릭 메서드보다 실행과정이 훨씬 간단하다
    // ?만 사용해서 제한 없이 모든 타입을 다 받을 수 있는 와일드카드를 비제한 와일드카드라고 한다
    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        // Animal로 상한을 걸었기 때문에 getName()을 호출할 수 있다
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        // Animal로 상한을 걸었기 때문에 getName()을 호출할 수 있다
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        // Animal로 상한을 걸었기 때문에 getName()을 호출할 수 있다
        System.out.println("이름 = " + t.getName());
        return t;
    }

    // 와일드카드는 반환타입이 Animal로 고정이 된다(전달한 타입을 명확하게 반환할 수 없다)
    // 따라서 제네릭 메서드도 필요하다
    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        // Animal로 상한을 걸었기 때문에 getName()을 호출할 수 있다
        System.out.println("이름 = " + animal.getName());
        return animal;
    }

}
