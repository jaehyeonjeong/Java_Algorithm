package ArrayAndList;

import java.util.Scanner;

public class twoPointer {
    public static void main(String[] args) {
        // 투 포인터 : 시작 인덱스와 종료 인덱스를 지정하여 연속된 수 표현
        // 슈도 코드
        // N 변수 저장
        // 사용 변수 초기화 (count = 1, start_index = 1, end_index = 1, sum = 1)
        // -> count(자기 자신 하나로 이루어진 경우의 수 미리 저장)
        // while(end_index != N) {
        // 아래는 이동 원칙
        // if(sum == N) count 증가, end_index 증가, sum값 변경
        // else if(sum > N) sum 값 변경, start_index 증가
        // else if(sum < N) end_index 증가, sum값 변경
        // }
        // count 출력하기
        Scanner sc = new Scanner(System.in); // 콘솔 정보 입력을 위한 Scanner 클래스 사용
        int nInputNumber = sc.nextInt(); // nInputNumber 변수 입력 및 저장
        int nSatisfyCount = 1; // 자기 자신 하나로 이루어진 경우의 수 미리 저장
        // 두개의 포인터 : 두개의 포인터 모두 1부터 시작
        int nEndIndex = 1;      
        int nStartIndex = 1;
        int nSummaryCalculate = 1; // nStartIndex, nEndIndex 모두 1부터 시작하므로 1로 지정

        while(nEndIndex != nInputNumber) { // 입력 한 값이 nEndIndex와 같은 경우 반복문 종료
            if(nSummaryCalculate == nInputNumber) { // 연속적 합산 수(이하 총 합산)와 입력 값이 같은 경우
                nSatisfyCount++; // 조건을 만족한 Count 값 증가
                nEndIndex++; // EndIndex 증가
                nSummaryCalculate = nSummaryCalculate + nEndIndex; // 총합산 = 기존 합산 결과 + 증가한 nEndIndex(2번째 포인터)
            }
            else if(nSummaryCalculate > nInputNumber) { // 총합산 수가 입력한 수 보다 값이 큰 경우
                nSummaryCalculate = nSummaryCalculate - nStartIndex; // 총합산 = 기존 합산 결과 - 기존 nStartIndex(1번째 포인터)
                nStartIndex++; // 순서 중요 StartIndex 증가
            }
            else { // 총 합산 수가 입력한 수 보다 값이 작은 경우
                nEndIndex++; // EndIndex 증가
                nSummaryCalculate = nSummaryCalculate + nEndIndex; // 총합산 = 총합산 + 증가한 EndIndex
            }
        }

        System.out.println(nSatisfyCount); // 조건만족 카운트 개수 출력
    }
}
