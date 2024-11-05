package chap_04;

public class _01_If {
    public static void main(String[] args) {
        //조건문 If
        int hour = 15;
        /*if (조건)
        ... 수행할 명령...*/

        //if문 내에서 하나의 문장을 실행할 때는 { } 생략 가능
        //if문 내에서 2개 이상의 문장을 실행할 때는 { } 생략 불가
        if(hour < 14) {
            System.out.println("아이스아메리카노 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피주문완료 #1");


        //오후 2시 이전이면서 모닝커피를 마시지 않은 경우에만 커피주문
        hour = 10;
        boolean morningCoffee = false;
        //if (hour < 14 && morningCoffee == false) {
        if (hour < 14 && !morningCoffee) {
            System.out.println("아이스 아메리카노 + 1 ");
        }
        System.out.println("커피주문완료 #2");


        //오후 2시 오후이거나 모닝커피를 마신 경우에는 디카페인 주문
        hour = 15;
        morningCoffee = true;
        //if(hour >=14 || morningCoffee == true) {
        if(hour >=14 || morningCoffee) {
            System.out.println("아이스 아메리카노(디카페인) +1");
        }
        System.out.println("커피주문완료 #3");




    }
}
