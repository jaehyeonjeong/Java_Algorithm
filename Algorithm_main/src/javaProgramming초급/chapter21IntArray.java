package javaProgramming초급;

public class chapter21IntArray {
    // 정수 배열
    public static void main(String[] args) {
        int[] grade = {90, 80, 89};     // 괄호안에 있는 데이터가 grade 배열에 축적
        int tot = grade[0] + grade[1] + grade[2];
        int average = tot / 3;
        System.out.printf("국어 %d점, 영어 %d점, 수학 %d점 =>\t", grade[0], grade[1], grade[2]); // 데이터 출력은 0부터
        System.out.printf("총점 %d점, 평균 %d점\n", tot, average);
    }
}
