package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int addQuantity) {
        // getOrDefault는 주어진 key에 해당하는 값을 반환하거나, 만약 해당하는 key가 Map에 없으면 기본값을 반환한다
        // 없어도 0이 나오기 때문에 int형을 써도 된다
        int existingQuantity = cartMap.getOrDefault(product, 0);
        cartMap.put(product, existingQuantity + addQuantity);
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }
    }

    public void minus(Product product, int minusQuantity) {
        int existingQuantity = cartMap.getOrDefault(product, 0);
        int newQuantity = existingQuantity - minusQuantity;
        if (newQuantity <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, newQuantity);
        }
    }
}
