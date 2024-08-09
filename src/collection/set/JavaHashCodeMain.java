package collection.set;

import collection.set.member.Member;

import java.util.Objects;

public class JavaHashCodeMain {

    public static void main(String[] args) {
        // Object의 기본 hashCode는 객체의 참조값을 기반으로 생성한다
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());

        // 각 클래스마다 hashCode를 이미 오버라이딩 해두었다
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("10.hashCode() = " + i.hashCode());
        System.out.println("'A'.hashCode() = " + strA.hashCode());
        // 여러 문자를 더할 때는 충돌이 덜 일어나도록 여러 연산이 이루어진다
        System.out.println("'AB'.hashCode() = " + strAB.hashCode());

        // hashCode는 마이너스 값이 들어올 수 있다
        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());

        // 둘은 같을까 다를까?, 인스턴스는 다르지만, equals는 같다
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        // equals, hashCode를 오버라이딩하지 않은 경우와 한 경우를 비교한다
        // 동일성: == 연산자를 이용해서 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인한다
        System.out.println("(member1==member2) = " + (member1 == member2));
        // 동등성: equals() 메서드를 이용해서 두 객체가 논리적으로 동등한지 확인한다
        System.out.println("(member1.equals(member2)) = " + (member1.equals(member2)));
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());


    }
}
