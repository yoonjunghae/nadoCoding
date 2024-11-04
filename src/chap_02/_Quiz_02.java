package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        //어린이 키에 따른 놀이기구 탑승여부
        //키가 120cm 이상만 탑승가능
        //삼항연산자 이용

        //실행결과 : 키가 115cm 이므로 탑승 불가합니다. 값이 115인경우
        //실행결과 : 키가 121cm 이므로 탑승 가능합니다. 값이 121인경우
        // 결과 = (조건) ? (참의 경우 결과 값) : (거짓일 경우 결과 값)

        //내풀이
        /*int height = 120;
        int x = 115;
        int y = 121;
        String possible = (height < x) ? "키가 " + x + "cm이므로 탑승 가능합니다" :  "키가 " + x + "cm이므로 탑승 불가합니다";
        System.out.println(possible);
        String possible1 = (height < y) ? "키가 " + y + "cm이므로 탑승 가능합니다" :  "키가 " + y + "cm이므로 탑승 불가합니다";
        System.out.println(possible1);*/

        //강사님풀이
        int height = 115;
        //String result = (조건) ? 참 : 거짓;
        String result = (height >=120) ? "탑승 가능합니다" : "탑승 불가능 합니다.";
        System.out.println("키가 "+ height + "cm이므로" +  result);

    }
}
