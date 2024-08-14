package collection.compare;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortMain4 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        List<MyUser> list = new LinkedList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);
        System.out.println("기본 데이터");
        System.out.println(list);

        System.out.println("Comparable 기본 정렬");
        // null을 넣으면 기본 정렬이다(여기서는 나이순)
        list.sort(null);
        // Collections.sort()를 이용해서 정렬을 할 수도 있다
//        Collections.sort(list);
        System.out.println(list);

        System.out.println("IdComparator 정렬");
        list.sort(new IdComparator());
//        Collections.sort(list, new IdComparator());
        System.out.println(list);
    }
}
