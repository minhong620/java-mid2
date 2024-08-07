package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {

    private int[] elementData = new int[10];
    private int size = 0;

    // O(n)
    public boolean add(int value) {
        if (contains(value)) {
            return false;
        }

        elementData[size] = value;
        size++;
        return true;
    }

    // 성능이 O(n)이다
    public boolean contains(int value) {
        for (int data : elementData) {
            if (data == value) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                // Arrays.copyOf()를 사용해서 배열에 데이터가 입력된 만큼만 출력한다
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) +
                ", size=" + size +
                '}';
    }
}
