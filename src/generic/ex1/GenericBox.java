package generic.ex1;

public class GenericBox<T> {
    // 제네릭을 사용하면 코드 재사용과 타입 안정성을 모두 챙길 수 있다
    // T를 타입 매개변수라고 한다
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
