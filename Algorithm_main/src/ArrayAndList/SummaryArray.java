package ArrayAndList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class SummaryArray {
    public static void main(String[] args) throws IOException {
        // 합 배열 공식
        // S[i] = S[i - 1] + A[i]
        // 구간 합을 빠르게 구하는 방법 : S[j] - S[i - 1] -> i에서 j까지 구간 합

        // 슈도 코드 작성
        // superNumber(숫자 개수), quizNumber(질의 개수) 저장하기
        // for(숫자 개수만큼 반복하기) {
        // 합 배열 생성하기(S[i] = S[i - 1] + A[i])
        // }
        // for(질의 개수만큼 반복하기) {
        // 질의 범위 받기(i~j)
        // 구간 합 출력하기(S[j] - S[i - 1])
        // }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        // 숫자 개수, 질의 개수 입력 받고 저장하기
        int superNumber = Integer.parseInt(stringTokenizer.nextToken());
        int quizNumber = Integer.parseInt(stringTokenizer.nextToken());

        long [] lSArray = new long[superNumber + 1]; // 구간 합 배열 선언(대신 인덱스를 1부터 superNumber + 1 까지 섷정)
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 1; i <= superNumber; i++)
        {
            // 합 배열 생성하기(S[i] = S[i - 1] + A[i])
            lSArray[i] = lSArray[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for(int q = 0; q < quizNumber; q++)
        {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            // 질의 범위 받기(i~j)
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            // 구간 합 출력하기(S[j] - S[i - 1])
            System.out.println(lSArray[j] - lSArray[i - 1]);
        }
    }
}
