package javaProgramming초급;

public class chapter20CalcInt {
    public static void main(String[] args) {
        // 정수 변수, 연산
        int kor = 90;
        int eng = 80;
        int math = 89;
        // 국어, 영어, 수학 점수를 정수 타입 변수에 각각 저장(대입)한다.
        int tot = kor + eng + math; // 259
        int average = tot/3;    // 정수 연산은 정수 : 86.3333 -> 86 : 세 과목의 평균
        System.out.printf("국어 %d점, 영어 %d점, 수학 %d점 =>\t", kor, eng, math);
        System.out.printf("총점 %d점, 평균 %d점\n", tot, average);
    }
}
