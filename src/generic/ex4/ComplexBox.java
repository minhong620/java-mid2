package generic.ex4;

import generic.animal.Animal;

// 제네릭 타입과 제네릭 메서드를 동시에 사용해보자!
// static에서는 제네릭 메서드만 적용할 수 있지만, 인스턴스 메서드는 둘 다 적용할 수 있다
public class ComplexBox<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
        // 상한이 Animal이기 때문에 animal.getName()(Animal 클래스에 존재하는 메서드)을 호출할 수 있다
    }

    // 메서드의 T는 위의 T와 관련이 없다
    // 따라서 Z를 이용하는 것을 권장한다
    public <T> T printAndReturn(T t) {
        // 상한이 없기 때문에(Object) t.getName()을 호출할 수 없다
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + t.getClass().getName());
        return t;
    }
}
