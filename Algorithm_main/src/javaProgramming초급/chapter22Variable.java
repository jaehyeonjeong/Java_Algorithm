package javaProgramming초급;

import java.util.Arrays;

public class chapter22Variable {
    // 실수 변수, 연산
    public static void main(String[] args) {
        double lShoeSize = 6;   // 6 영국 신발 사이즈 -> 255mm
        double lHitPercent = 75; // 75% 히트할 확률
        double lLbs = 200;  // 200 파운드-> 1,863원/1파운드
        double lTrend = 0;       // 0년(올해 유행) 1년전 유행
        double lAlcohol = 0;    // 음주량 0잔->8.83cm 1잔 4.42cm
        double lWearYear = 2;   // 착용년도
        double lUps1 = lHitPercent * lLbs * (lWearYear + 9);
        double lDownHills = (lTrend + 1) * (lAlcohol + 1) * (lWearYear + 10) * (lLbs + 20);
        double lUps2 = 12 + 3 * lShoeSize / 8.0;
        double lHighHillHeight = lUps1 / lDownHills * lUps2;  // 밝혀낸 식
        System.out.printf("적당한 하이힐 높이는 %1$.2fcm입니다.", lHighHillHeight / 100);
    }
}
