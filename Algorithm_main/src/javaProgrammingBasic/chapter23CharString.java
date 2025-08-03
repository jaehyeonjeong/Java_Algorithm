package javaProgrammingBasic;

public class chapter23CharString {
    public static void main(String[] args) {
        // char, escape
        char cFindText = '닳';
        String strLetter = "동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
        int nLetterNumber = strLetter.length();  // 문자열의 길이
        int nIndexLocation = strLetter.indexOf(cFindText); // 찾고자 하는 문자의 위치
        System.out.printf("\"%s\"=>%d자 이며, '%c'은 %d번쨰 있다.\n",
                strLetter, nLetterNumber, cFindText, nIndexLocation);
        char cCopyText = strLetter.charAt(nIndexLocation); // 위치에 따른 문자 표시
        System.out.printf("\"%s\"의 %d번째 문자는, '%c'이다.", strLetter, nIndexLocation, cCopyText);
    }
}
