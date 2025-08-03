package javaProgrammingMid;
// case
public class chapter36BioSwitch {
    // 조건에 따라 신체, 감정, 지성값을 출력
    public static String textInfo(int index, double value) {
        String result = "";
        switch(index) {
            case 23 : result = "신체 지수:"; break;
            case 28 : result = "감정 지수:"; break;
            case 33 : result = "지성 지수:"; break;
        }
        return result + (value * 100);
    }

    public static void main(String[] args) {
        int index = 23; // 신체 지수
        double value = 0.86;
        String str = textInfo(index, value);    // 매서드 호출
        System.out.println(str);
    }
}
