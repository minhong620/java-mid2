package collection.map.test.member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    private Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member) {
        memberMap.put(member.getId(), member);
    }

    public void remove(String id) {
        memberMap.remove(id);
    }

    public Member findById(String id) {
        return memberMap.get(id);
    }

    public Member findByName(String name) {
        Collection<Member> values = memberMap.values();
        for (Member member : values) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }
}
