package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name; //name이라는 문자열 변수 선언
        name = "나도코딩"; // String name = "나도코딩"; 변수 선언과 동시에 초기화

        int hour = 14;

        System.out.println( name + "님, 배송이 시작됩니다. " + hour + "시에 방문예정입니다.");
        System.out.println( name + "님, 배송이 완료되었습니다.");

        double score = 90.5; //실수형
        char grade = 'A'; //한 문자인 char는 작은따옴표
        name = "강백호";
        System.out.println(name + " 님의 평균 점수는 " + score + "점 입니다. ");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번시험에 합격했을까요? " + pass);

        double d = 3.14123456789; //float보다 정밀하게 표현가능
        float f = 3.14123456789f;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);

        // int, long, float, double, char, String, boolean 자료형
    }
}
