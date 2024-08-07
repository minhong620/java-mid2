package collection.set;

import java.util.Arrays;

public class HashStart2 {

    public static void main(String[] args) {
        // 배열의 index를 값으로 쓴다 -> O(1)
        // 입력: {1, 2, 5, 8}
        // [null, 1, 2, null, null, 5, null, null, 8, null]
        // 배열에 낭비되는 공간이 많이 발생한다는게 문제이다
        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 8;
        Integer result = inputArray[searchValue]; // O(1)
        System.out.println(result);
    }
}
