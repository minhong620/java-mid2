package collection.set.member;

import java.util.Objects;

public class Member {

    private String id;

    public Member(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    // 해시 자료구조에 데이터를 저장하는 경우 꼭 equals()와 hashCode()를 재정의해야한다
    // 재정의하지 않으면 둘 다 참조값을 기반으로 하는 메서드들이다.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        // id가 같으면 true를 반환하도록 재정의했다
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() {
        // id가 같으면 hashCode가 같게 재정의했다
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                '}';
    }
}
