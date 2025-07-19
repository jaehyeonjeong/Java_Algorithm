package ArrayAndList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class twopointer2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // 주몽의 명령

        // 슈도 코드
        // N(재료의 개수), M(갑옷이 되는 번호) 저장하기
        // for(N 만큼 반복) {
        // 자료 배열 저장하기
        //}
        // 자료 배열 정렬하기
        // while(i < j)
        //{
        // if((재료 합 < M) 작은 번호 재료를 한 칸 위로 변경하기
        // else if(재료 합 > M) 큰 번호 재료를 한 칸 아래로 변경하기
        // else 경우의 수 증가, 양쪽 index 각각 변경하기
        //}
        // count(경우의 수) 출력하기
        BufferedReader brReader = new BufferedReader(new InputStreamReader(System.in));
        // nInputIndex(재료의 개수), nTargetValue(갑옷이 되는 번호) 저장
        int nInputIndex = Integer.parseInt(brReader.readLine());
        int nTargetValue = Integer.parseInt(brReader.readLine());
        int [] nArrayIndex = new int[nInputIndex];
        // 자료 배열 변수 할당
        StringTokenizer stToken = new StringTokenizer(brReader.readLine());
        for(int i = 0; i < nInputIndex; i++) {
            // 자료 배열 저장
            nArrayIndex[i] = Integer.parseInt(stToken.nextToken());
        }
        Arrays.sort(nArrayIndex); // 자료 배열 정렬(오름차순)
        int nCount = 0;            // 경우의 수 초기화
        int nMin = 0;      // nArrayIndex[0] -> Min
        int nMax = nInputIndex - 1;  // nArrayIndex[1] -> Max
        while(nMin < nMax) {
            if (nArrayIndex[nMin]+nArrayIndex[nMax] < nTargetValue) nMin++; // 작은 재료 인덱스 위치 변경
            else if (nArrayIndex[nMin]+nArrayIndex[nMax] > nTargetValue) nMax--; // 큰 값 재료 인덱스 위치 변경
            else {
                nCount++; // 경우의 수 증가
                nMin++; nMax--; // 작은 재료, 큰 재료 양 옆의 인덱스 위치 변경
            }
        }
        System.out.println(nCount);
    }
}
