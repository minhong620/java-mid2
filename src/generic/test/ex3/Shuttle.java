package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

// getName()을 이용하기 위해 상한을 BioUnit으로 걸어준다
public class Shuttle<T extends BioUnit> {

    private T unit;

    public void in(T t) {
        unit = t;
    }

    public T out() {
        return unit;
    }

    public void showInfo() {
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
}
