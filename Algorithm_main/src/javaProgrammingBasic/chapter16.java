package javaProgrammingBasic;
import java.util.Calendar;      // Calendar 클래스는 java.util에 있다.
import java.util.Date;          // Date 클래스는 java.util에 있다,
// 위에 있는 import 들이 참조타입이라고 한다.
public class chapter16 {
    public static void main(String[] args) {
        // 기본 타입의 배열은 참조타입
        int[] m = {1,2,3};  // 배열 : 기본 타입의 묶음인 배열도 찹조 타입이다. 배열은 같은 타입의 나열이다.
        int[] n = new int[] {1,2,3}; // 배열 : 배열도 String과 같이 new로 생성할 수 있고 new 없이도 생성할 수 있다.
        // 참조 타입 - 객체 타입
        String card = "H8";     // 문자열 : 여러 문자(char)를 이용하여 만든 참조 타입이다. (문자열은 기본타입인 만큼 많이 사용한다)
        Date d = new Date();    // 오늘 : 1970.1.1 부터 현재까지 경과 시간을 long 타입으로 표현하는 찹조 타입이다.
        Calendar cal = Calendar.getInstance();  // 오늘 : 연월일을 정수로 입력할 수 있는 참조 타입이다.
        // 자동으로 toString()이 붙음
        System.out.println(card);   // card.toString()
        System.out.println(d);      // d.toString();
        System.out.println(cal);    // cal.toString()
        System.out.println(cal.getTime());  // cal.getTime().toString()
    }
}
