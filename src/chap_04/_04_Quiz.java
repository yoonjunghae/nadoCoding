package chap_04;

public class _04_Quiz {
    public static void main(String[] args) {
        //주차요금 정산프로그램
        //시간당 4000원 일일최대요금30000 경차또는장애인차량 최종요금에서 50%
        //----------------------------------------------------
        //실행결과
        //일반차량5시간 주차시
        //주차요금은 20000원입니다.
        //경차5시간 주차시
        //주차요금은 10000원 입니다.
        //장애인차량 10시간 주차시
        //주차요금은 15000원입니다.

        int hour = 10; // 주차시간
        boolean isSmallCar = false; //경차여부
        boolean withDisabledPerson = true; //장애인차량
        int fee = hour * 4000; // 시간당 요금
        //30000원 초과시 일일 최대요금

        if(fee > 30000){
            fee = 30000;
        }
        //경차 또는 장애인 차량 50% 할인
        if(isSmallCar || withDisabledPerson){
            fee /=2; //50% 할인적용
        }
        //실행결과 출력
        System.out.println("주차요금은 " + fee + "원 입니다.");

    }
}
