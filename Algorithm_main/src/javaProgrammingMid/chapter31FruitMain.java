package javaProgrammingMid;

public class chapter31FruitMain {
    // 상수의 묶음
    public static void main(String[] args) {
        chapter31Fruit pear = chapter31Fruit.APPLE;
        chapter31Fruit pear2 = chapter31Fruit.MANGO;
        System.out.println(pear);
        System.out.println(pear.name());
        System.out.println(pear.ordinal()); // 선언될 때 순서 0
        System.out.println(pear2.ordinal()); // 선언될 때 순서 2
        chapter31Fruit[] fruits = chapter31Fruit.values();
        System.out.println(fruits[0]);
    }
}
