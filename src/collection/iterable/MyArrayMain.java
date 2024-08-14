package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {

    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});
        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("iterator 사용");

        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("value = " + value);
        }

        // 자바는 Iterable 인터페이스를 구현한 객체에 대해서 향상된 for문을 사용할 수 있게 해준다
        System.out.println("for-each 사용");
        for (Integer value : myArray) {
            System.out.println("value = " + value);
        }
    }
}
