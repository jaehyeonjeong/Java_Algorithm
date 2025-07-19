package javaProgramming초급;
// 타입 변환의 필요성
public class chapter18 {
    public static void main(String[] args) {
        String slat = "37.52127220511242";  // 위도의 값이 공백(" ")과 함께 대입된다.
        // String slat = "hello";   // 주석을 해제하면 Double 타입이 아니게 되어 에러메세지를 표시한다.
        // 공백 제거 후 double로 타입 변환
        double latitude = Double.parseDouble(slat.trim()); // trim()은 양쪽 공백을 제거하여 "37.xxx"로 만든다. 하지만 없어도 된다.
        // Double 랩퍼 클래스를 이용하여 37.xxx로 타입 변환한다.
        System.out.println(latitude);
    }
}
