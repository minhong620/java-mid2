package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        // '<>'을 지정하지 않는 것을 로 타입 또는 원시 타입이라고 한다
        // 원시 타입을 사용하면 내부의 타입 매개변수가 Object 로 사용된다고 이해하면 된다
        // 사용하지 않는 것을 권장한다
        GenericBox integerBox = new GenericBox();
//        GenericBox<Object> integerBox=new GenericBox<Object>(); // 권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
