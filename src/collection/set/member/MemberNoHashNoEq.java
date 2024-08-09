package collection.set.member;

// equals()와 hashCode()를 재정의하지 않았다
// 재정의하지 않았으므로 Object의 메서드들을 이용할 것이다(참조값을 이용)
public class MemberNoHashNoEq {

    private String id;

    public MemberNoHashNoEq(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberNoHashNoEq{" +
                "id='" + id + '\'' +
                '}';
    }
}
