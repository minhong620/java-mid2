package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // 입력: {1, 2, 5, 8, 14, 99}
        // 연결리스트를 넣을 수 있는 배열을 생성한다
        // 연결리스트를 생성한게 아니다
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        System.out.println("buckets = " + Arrays.toString(buckets));
        for (int i = 0; i < CAPACITY; i++) {
            // 여기서 연결리스트를 생성한거다
            buckets[i] = new LinkedList<>();
        }
        System.out.println("buckets = " + Arrays.toString(buckets));
        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9); // 중복
        System.out.println("buckets = " + Arrays.toString(buckets));

        // 검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("buckets.contains(" + searchValue + ") = " + contains);
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        // 중복으로 데이터가 들어갈 수 있기 때문에 값을 바로 넣을 수가 없다
        LinkedList<Integer> bucket = buckets[hashIndex]; // 연결리스트가 튀어나온다 O(1)
        if (!bucket.contains(value)) { // 중복을 체크한다 O(n)
            bucket.add(value);
        }

    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        return bucket.contains(searchValue); // O(n)
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
