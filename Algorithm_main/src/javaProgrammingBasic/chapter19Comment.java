package javaProgrammingBasic;
// 코멘트 - 프로그램에 영향이 없으며 설명을 위한 표시
public class chapter19Comment {
    public static void main(String[] args) {
        /*
        0.0 <= 실수 값 < 10.0을 (int)하면 정수만 반환한다.
        그해서 0~9사이의 임의의 정술를 반환한다.
         */
//        int makeOne = (int)(Math.random()*10);
        double makeOne = (int)(Math.random()*10); // 출력은 0.0 ~ 9.0으로 정해짐
        // 0~9 사이의 임의의 정수
        System.out.println(makeOne); // 실행할 때마다 변한다.
    }
}
