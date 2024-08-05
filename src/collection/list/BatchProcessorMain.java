package collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {
//        MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>();

        // 앞에 추가하는 로직은 배열 리스트와 연결 리스트의 성능 차이가 굉장히 크다
        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000); // 자바에는 언더바를 허용해준다
    }
}
