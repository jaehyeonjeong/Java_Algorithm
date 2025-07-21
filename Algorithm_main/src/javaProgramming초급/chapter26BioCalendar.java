package javaProgramming초급;
// 상수
public class chapter26BioCalendar {
    // 상수, 상수값은 변경할 수 없다.
    public static final int PHYSICAL = 23;  // public static final 예약어를 붙여 상수를 선언한다. 상수는 대문자를 쓴다.
    // 위에 있는 변수는 상수(개발자 정의)
    public static void main(String[] args){
        System.out.println(PHYSICAL);
        int index = PHYSICAL;   // 상수값을 변수에 대입
        // Math.PI 3.14에서 정의되어 있는 상수
        double vals = 2 * Math.PI / index;
        System.out.println(vals + "라디안");
    }
}
