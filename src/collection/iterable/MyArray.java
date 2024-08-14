package collection.iterable;

import java.util.Iterator;

public class MyArray implements Iterable<Integer> {

    private int[] numbers;

    public MyArray(int[] numbers) {
        this.numbers = numbers;
    }

    // 이 자료구조에 반복할 반복자(iterator)를 반환한다
    // 따라서 MyArray는 반복할 수 있다는 의미가 된다
    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);
    }
}
