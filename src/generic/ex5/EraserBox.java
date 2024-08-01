package generic.ex5;

// 여기서 T는 런타임에 모두 Object가 되어버린다
public class EraserBox<T> {

    public boolean instanceCheck(Object param) {
//        return param instanceof T;
        return false;
    }

    public void create() {
//        return new T();
    }
}
