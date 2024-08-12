package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 데이터 추가
        studentMap.put("studentA", 90);
        System.out.println(studentMap);

        // 같은 key에 저장 시 기존 값을 교체한다
        studentMap.put("studentA", 100);
        System.out.println(studentMap);

        // containsKey: O(1), containsValue: O(n)
        boolean containsKey = studentMap.containsKey("studentA");
        System.out.println("containsKey = " + containsKey);

        // 특정 학생의 값 삭제
        // entry가 통째로 삭제된다
        studentMap.remove("studentA");
        System.out.println(studentMap);
    }
}
