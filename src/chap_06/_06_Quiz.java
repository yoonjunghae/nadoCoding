package chap_06;

import javax.swing.text.html.HTMLDocument;

public class _06_Quiz {
    public static String getHiddenData(String data, int index)    {
        String hiddenData = data.substring(0,index); // 나코딩  -> 나**
        for (int i = 0; i < data.length() -index; i++) {
            hiddenData += "*";
            
        }
        return hiddenData;
    }
    public static void main(String[] args) {
        //개인정보 비공개로 전환하는 메소드
        //하나의 메소드에서 모두 처리

        String name = "나코딩";
        String id = "991030-1234567";
        String number = "010-1234-5678";
        //System.out.println("이름 : " + name.substring(0,1) + "**");
        System.out.println("이름 : " + getHiddenData(name,1));
        //System.out.println("주민등록번호 : " + id.substring(0,8) +"*****");
        System.out.println("주민등록번호 : " + getHiddenData(id,8));
        //System.out.println("전화번호 : " + number.substring(0,9) + "****");
        System.out.println("전화번호 : " + getHiddenData(number,9));

    }
}
