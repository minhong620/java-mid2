package collection.link;

public class Node {

    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    // IDE 생성 toString()
//    @Override
//    public String toString() {
//        return "Node{" +
//                "item=" + item +
//                ", next=" + next +
//                '}';
//    }


    // [A -> B -> C] 꼴로 출력하는게 목표
    @Override
    public String toString() {
        // loop에서 문자를 더할 때는 StringBuilder를 쓰는게 좋다
        // 메모리 측면에서 좋다
        StringBuilder sb = new StringBuilder();
        Node x = this;
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if (x.next != null) {
                sb.append(" -> ");
            }
            x = x.next;
        }
        sb.append("]");
        // sb를 String 타입으로 바꿔줘야한다
        String string = sb.toString();
        return string;
    }
}
