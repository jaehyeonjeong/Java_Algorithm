package ArrayAndList;
import java.util.Scanner; // 값을 입력받기 위한 클래스 사용
public class SummaryNumber {
    // 문제의 의도를 정확히 파악하고 로직과 코드를 작성할 것
    // 문제 1. N 의 범위가 100 자리의 숫자로 진행(int, long) 은 안됨.. String 은 가능
    // 각 자리수로 toCharArray를 걸어서 아스키 코드로 해석 '1'(48)

    // 슈도코드 작성하기
    /*
     * N값 입력 받기
     * 길이 N의 숫자를 입력받아 String형 변수 sNum에 저장하기
     * sNum을 다시 char[] 형 변수 cNum에 변환하여 저장하기
     * int형 변수 sum 선언하기
     * for(cNum 길이만큼 반복하기)
     * {
     *   배열의 각 자리값을 정수형으로 변환하여 sum에 더하여 누적하기
     * }
     * sum 출력하기
     * */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nIndex = sc.nextInt();   // N 값 입력받기
        String strNumber = sc.next();    // 길이 N의 숫자를 String형 변수 sNum에 저장
        char[] cNumber = strNumber.toCharArray(); // sNum을 다시 char[]형 변수 cNum에 변환하여 저장
        int nSummary = 0;
        for(int i = 0;  i < cNumber.length; i++){ // cNum 길이만큼 반복하기
            // 배열의 각 자리값을 정수형으로 변환하여 sum에 더하여 누적하기
            nSummary += cNumber[i] - 48;// or '0' (ASCII [0] -> 48)
            System.out.print((int)cNumber[i] + " ");
        }
        System.out.println();
        System.out.println(nSummary); // sum 출력하기
    }
}
