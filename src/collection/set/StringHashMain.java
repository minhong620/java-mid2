package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int) charA);
        System.out.println("charB = " + (int) charB);

        // hashCode
        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("AB"));
        System.out.println("hashCode('AB') = " + hashCode("AB"));

        // hashIndex
        System.out.println("hasIndex(A) = " + hasIndex(hashCode("A")));
        System.out.println("hasIndex(A) = " + hasIndex(hashCode("B")));
        System.out.println("hasIndex(A) = " + hasIndex(hashCode("AB")));
    }

    static int hashCode(String str) {
        // 문자열을 문자 배열로 변환한다
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += (int) c;
        }
        return sum;
    }

    static int hasIndex(int value) {
        return value % CAPACITY;
    }
}
