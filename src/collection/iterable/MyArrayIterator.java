package collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {

    private int currentIndex = -1;
    private int[] targetArr;

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    // 다음 항목이 있는지 검사한다
    @Override
    public boolean hasNext() {
        return currentIndex < targetArr.length - 1;
    }

    // 다음 항목을 반환한다
    @Override
    public Integer next() {
        currentIndex++;
        int result = targetArr[currentIndex];
        return result;
    }
}
