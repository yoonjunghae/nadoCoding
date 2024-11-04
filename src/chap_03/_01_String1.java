package chap_03;

import java.util.Locale;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I Like Java and Python and C.";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length());

        //대소문자 변환
        System.out.println(s.toUpperCase()); //대문자로
        System.out.println(s.toLowerCase()); //소문자로

        //포함 관계

        System.out.println(s.contains("Java")); //포함된다면 true
        System.out.println(s.contains("C#")); //포함되지 않았다면 false

        System.out.println(s.indexOf("Java")); //위치정보 7 첫번째 위치 0부터 시작 **
        System.out.println(s.indexOf("C#")); //포함되어 있지 않으면 -1 반환

        System.out.println(s.indexOf("and")); //처음 일치하는 위치정보
        System.out.println(s.lastIndexOf("and")); // 마지막에 일치하는 위치정보
        System.out.println(s.startsWith("I Like")); // 이 문자열로 시작하면 true 반환 (아니면 false)
        System.out.println(s.endsWith("."));


    }
}
