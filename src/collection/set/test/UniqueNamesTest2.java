package collection.set.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueNamesTest2 {

    public static void main(String[] args) {
        // 중복을 제거하고 입력 순서는 유지해라
        Integer[] inputArray = {30, 20, 20, 10, 10};
        Set<Integer> set = new LinkedHashSet<>();
        for (Integer s : inputArray) {
            set.add(s);
        }

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
