package collection.array;

import java.util.Arrays;

public class MyArrayListV4<E> {

    private static final int DEFAULT_CAPACITY = 5;

    // 배열은 E로 못 바꾼다
    private Object[] elementData;
    private int size = 0;

    public MyArrayListV4() {
        // 정확히는 여기 때문에 배열을 E로 못 바꾼다
        // 생성자에 E를 못 쓰기 때문이다(이레이저)
        elementData = new Object[DEFAULT_CAPACITY];
    }

    // 크기를 직접 정해줄 수도 있다
    public MyArrayListV4(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(E e) {
        // 동적 배열로 만들기 위해서 코드를 추가한다
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    // 코드 추가
    public void add(int index, E e) {
        if (size == elementData.length) {
            grow();
        }
        // 데이터 이동
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    // 코드 추가, 요소의 마지막부터 index까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;

//        Object[] newArr = new Object[newCapacity];
//        for (int i = 0; i < elementData.length; i++) {
//            newArr[i] = elementData[i];
//        }
        // 이 한 줄이 위의 코드와 같다
        // 배열을 새로 만들고, 기존 배열을 새로운 배열에 복사한다
        // 기존 배열은 더는 참조하는 곳이 없으므로 GC의 대상이 된다
        Object[] newArr = Arrays.copyOf(elementData, newCapacity);
        elementData = newArr;
    }

    // 경고를 무시
    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elementData[index]; // E로 캐스팅한다
    }

    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    // 코드 추가
    public E remove(int index) {
        E oldValue = get(index);
        // 데이터 이동
        shiftLeftFrom(index);

        size--;
        elementData[size] = null; // 마지막에는 null 채워주기
        return oldValue;
    }

    // 코드 추가, 요소의 index부터
    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
//        [1, 2, 3, null, null] // size = 3
//        [1, 2, 3] // size = 3 이렇게 출력하기 위해 toString()을 따로 정의했다
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                " size = " + size + ", capacity = " + elementData.length;
    }
}
