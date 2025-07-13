package ArrayAndList;

import java.util.Scanner;

public class AverageSolve {
    /*
    * 변수 nIndex에 과목의 수 입력받기
    * 길이가 nIndex인 1차원 배열 nArray[] 선언하기
    * for(nArray[] 길이만큼 반복하기) {
    * nArray[i]에 각 점수 저장하기
    * }
    * for(nArray[] 길이 만큼 반복하기) {
    * 최고점은 변수 max에, 총점은 변수 sum에 저장하기
    * }
    * sum * 100 / max / N 출력하기
    * */

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int nIndex = sc.nextInt();  // 변수 nIndex에 과목의 수 입력 받기
//        int nArray[] = new int[nIndex]; // 길이가 nIndex인 1차원 배열 nArray[] 선언하기
//        for(int i = 0; i < nArray.length; i++) { // for(nArray[] 길이 만큼 반복하기)
//            nArray[i] = sc.nextInt(); // nArray[i] 에 각 점수 저장하기
//        }
//        long sum = 0;
//        long max = 0;
//        for(int i = 0; i < nArray.length; i++) { // for(nArray[] 길이 만큼 반복하기)
//            if(nArray[i] > max) {
//                max = nArray[i]; // 최고점은 변수 max에,
//            }
//            sum += nArray[i]; // 총점은 변수 sum에 저장하기
//        }
//        System.out.println(sum*100.0/max/nIndex); // 문제풀이로 요약한 수식 출력
        Scanner sc = new Scanner(System.in);
        int nIndex = sc.nextInt();  // nIndex 값 받아오기
        int sum = 0, max = 0; // 총 합(sum), 최대값(max) 변수 선언 및 초기화
        for(int i = 0; i < nIndex; i++) { // nIndex 만큼 반복
            int temp = sc.nextInt(); // temp 변수 선언 후 입력값으로 할당
            if(max < temp) {    // 최대값 인식시 max 변수 갱신
                max = temp;
            }
            sum += temp; // 총합 저장
        }
        System.out.println(sum*100.0/max/nIndex); // 문제풀이 식 출력
    }
}
