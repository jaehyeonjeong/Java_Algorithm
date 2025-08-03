package javaProgrammingMid.s038;
// 상수 묶음 클래스 - enum
public enum PEI {
    PHYSICAL(23), EMOTIONAL(28), INTELLECTUAL(33);
    private final int peiValue;

    PEI(int pei) {  // enum 값을 초기화 할 수 있는 생성자
        this.peiValue = pei;
    }

    public int getPei() { // enum이 정수로 변환할 수 없는 대신 해당 값을 반환하는 매서드를 선언한다.
        return peiValue;
    }
}

enum FRUIT {
    APPLE, BANANA, MANGO
}