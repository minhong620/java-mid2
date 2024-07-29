package generic.test.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        // 제너릭 메서드를 호출할 때 타입을 정해줘야한다
        // 메서드를 호출하는 시점에 타입 인자를 전달한다
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        // 타입 추론: 타입 인자를 생략할 수 있다
        System.out.println("타입 추론");
        Integer result1 = GenericMethod.genericMethod(i);
        Integer integerValue1 = GenericMethod.numberMethod(10);
        Double doubleValue1 = GenericMethod.numberMethod(20.0);
    }
}
