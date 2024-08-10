package collection.set.test;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {

    public static void main(String[] args) {
        // 중복을 제거하고 데이터의 값 순서로 출력해라
        Integer[] inputArray = {30, 20, 20, 10, 10};
        Set<Integer> set = new TreeSet<>();
        for (Integer s : inputArray) {
            set.add(s);
        }

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
