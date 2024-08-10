package collection.set.test;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {

    public static void main(String[] args) {
        // 중복을 제거하고 값을 출력해라
        Integer[] inputArray = {30, 20, 20, 10, 10};
        Set<Integer> set = new HashSet<>();
        for (Integer s : inputArray) {
            set.add(s);
        }

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
