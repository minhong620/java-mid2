package collection.compare;

import java.util.Comparator;

public class IdComparator implements Comparator<MyUser> {
    @Override
    public int compare(MyUser o1, MyUser o2) {
        // 문자끼리 비교할 때는 compareTo를 이용하자
        return o1.getId().compareTo(o2.getId());
    }
}
