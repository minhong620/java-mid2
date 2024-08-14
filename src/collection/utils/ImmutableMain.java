package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {

    public static void main(String[] args) {
        // 불변 리스트를 생성한다
        List<Integer> list = List.of(1, 2, 3);

        // 불변 리스트를 가변 리스트로 변경한다
        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);
        System.out.println("mutableList = " + mutableList);
        System.out.println("mutableList.getClass() = " + mutableList.getClass());

        // 다시 불변 리스트로 변경
        // 물론 리스트 외에도 가능하다
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        System.out.println("unmodifiableList class = " + unmodifiableList.getClass());

        // java.lang.UnsupportedOperationException 예외가 발생한다
//        unmodifiableList.add(5);
    }
}
