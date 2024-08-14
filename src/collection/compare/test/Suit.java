package collection.compare.test;

// enum은 Enum을 상속받는데 Enum은 이미 Comparable을 구현하고 있다
// compareTo()가 구현되어 있다
public enum Suit {
    SPADE("♠"),
    HEART("♥"),
    DIAMOND("♦"),
    CLOVER("♣");


    private String icon;

    Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
