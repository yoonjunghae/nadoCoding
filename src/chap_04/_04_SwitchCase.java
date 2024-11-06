package chap_04;

import javax.swing.*;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case
        //석차에 따른 장학금 지급
        //1등 : 전액장학금 2등 : 반액장학금 3등 : 반액장학금 그 외 : 장학금 대상 아님

        int ranking = 4; //등수
        if(ranking ==1){
            System.out.println("전액장학금");
        }else if(ranking == 2 || ranking ==3) {
            System.out.println("반액장학금");
        /*}else if(ranking ==3){
            System.out.println("반액장학금");
        }*/
        }else{
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회완료 #1");


        //Switch Case 문을 이용

        ranking = 2;
        switch (ranking){
            case 1 :
                System.out.println("전액 장학금");
                break;
            case 2 :
                System.out.println("반액 장학금");
                break;
            case 3 :
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님 ");
        }
        System.out.println("조회완료 #2");


        //case 2와 3 통합
        ranking = 3;
        switch (ranking){
            case 1 :
                System.out.println("전액 장학금");
                break;
            case 2 :
            case 3 :
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님 ");
        }
        System.out.println("조회완료 #3");


        //중고상품의 등급에 따른 가격을 책정 (1급 : 최상 4급 : 최하)
        int grade = 3;
        int price = 7000;
        switch (grade){
            case 1 :
                price += 1000;
            case 2 :
                price += 1000;
            case 3 :
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격은 :" + price + "원");

        //if else 문을 이용
        //여러 조건 또는 범위에 해당

        //switch case 명확한 케이스가 있는 경우
    }
}
