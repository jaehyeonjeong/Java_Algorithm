package javaProgrammingMid;
// 삼항(?:) 연산자
public class chapter35EvenOddTriCondition {
    public static void main(String[] args) {
        int temp = 98;
        temp = (temp % 2 == 1) ? temp * 3 + 1 : temp / 2;
        System.out.printf("계산 후 = %d\n", temp);
    }
}
