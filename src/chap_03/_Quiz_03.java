package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        //주민번호에서 생년월일및 성별까지만 출력
        //예시 "901231-1234567"인경우 901231-1 까지 출력
        //"030708-4567880"인경우 030708-4 까지 출력

        String s1 = "901231-1234567";
        String s2 = "030708-4567890";

        System.out.println(s1.subSequence(0,8));
        System.out.println(s2.subSequence(0,8));

        //강사님 풀이
        String id = "901231-1234567"; //주민번호13자리
        System.out.println(id.substring(0,8)); //0위치부터 8 위치 직전까지
        System.out.println(id.substring(0, id.indexOf("-") + 2));//0위치부터 하이픈 위치 + 2 직전위치까지

        id = "030708-4567890";
        System.out.println(id.substring(0, id.indexOf("-") + 2));





    }
}
