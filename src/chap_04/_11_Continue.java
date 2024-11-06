package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue
        //노쇼손님이 있다고 가정
        int max = 20; //최대 판매수량
        int sold = 0; // 현재 치킨 판매 수량

        int noShow = 17; //17번손님 노쇼

        for (int i = 1; i <50 ; i++) {
            System.out.println(i + "번 손님, 치킨 나왔습니다.");

            //손님이 없다면? 노쇼라면?
            if(i == noShow){
                System.out.println(i+ "번 손님, 노쇼로 인해 다음 손님으로 기회가 넘어갑니다.");
                continue; // 뒤 sold 에 카운트 되지 않고, 다음 반복으로 넘어감
            }

            sold++; // 판매처리
            if(sold ==max) {
                System.out.println("금일 재료가 모두 소진되었습니다");
                break;
            }
            
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("-------------------------------");

        //while문
        sold = 0;
        int index = 0;
        //while(index <=50){
        while(true){
            index++;
            System.out.println(index + " 번 손님, 주문하신 치킨 나왔습니다. ");
            //손님이 없다면?

            if(index ==noShow){
                System.out.println(index + "번 손님, 기회가 넘어갑니다.");
                continue;
            }
            sold++;
            if(sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }

        }
        System.out.println("영업을 종료합니다.");
    }
}
