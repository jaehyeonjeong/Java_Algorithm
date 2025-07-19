package javaProgramming초급;
// 사용자 정의 클래스
class JLocation {
    // 파일이름과 클래스 이름이 다르기 때문에 public을 붙일 수 없다.
    public double lat;  // 클래스 바로 아래에 선언한 변수들은 자동으로 초기화 한다.
    public double lng;  // ex) lat = 0.0, lng = 0.0
}
public class chapter17 {
    public static void main(String[] args) {
        // 두 개의 기본 타입
        double latitude = 37.52127220511242;    // double 타입의 변수에 각각 위,경도 값을 저장한다.
        double longitude = 127.0074462890625;
        // 사용자 정의 객체를 생성
        JLocation jloc = new JLocation();   // 사용자가 정의한 클래스를 new 예약어를 사용하여 생성한다.
        jloc.lat = latitude;    // 값을 대입
        jloc.lng = longitude;   // 값을 대입

        JLocation newLoc = jloc;    // 객체를 대입
        System.out.println(newLoc.lat); // 출력 : 객체에 저장된 위도(lat)의 값을 출력한다. 참조 타입은 "래퍼런스."으로 사용한다.
        System.out.println(newLoc.lng); // 출력
    }
}
