package javaProgramming중급;

public class chapter30BioCalendar {
    // non static 매서드 맴버

    // 상수
    public static final int PHYSICAL = 23;

    // 맴버 매서드(non static) 선언
    public double getBioRhythm(long days, int index, int max) {
        return max * Math.sin((days % index) * 2 * Math.PI / index);
    }

    public static void main(String[] args) {
        int days = 1200;
        chapter30BioCalendar bio = new chapter30BioCalendar(); // 객체를 생성
        // 맴버 매서드 호출
        double phyval = bio.getBioRhythm(days, PHYSICAL, 100);
        System.out.printf("나의 신체 지수 %1$.2f입니다.\n", phyval);
    }
}
