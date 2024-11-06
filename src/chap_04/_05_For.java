package chap_04;

public class _05_For {
    public static void main(String[] args) {
        //반복문 For
        //나코 매장
        System.out.println("어서오세요. 나코입니다.");
        //또다른손님 들어오면?
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        //인사법이 바뀌면?
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        //매장의 이름이 바뀌면?
        //코나
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");

        //반복문 사용 For
//        for (선언; 조건; 증감){
//        }
        System.out.println("--------------- 반복문 사용 ---------------");
        for(int i = 0; i<10; i++){
            //System.out.println("어서오세요 나코입니다" + i);
            //System.out.println("환영합니다. 나코입니다" + i);
            System.out.println("환영합니다. 코나입니다" + i);
        }

        //짝수만 출력 ( fori 적고 enter )
        for (int i = 0; i <10 ; i+=2) {
            System.out.print(i);
            
        }
        System.out.println();
        //홀수만 출력
        for (int i = 1; i <10 ; i+=2) {
            System.out.print(i);

        }
        System.out.println();
        //거꾸로 숫자 출력
        for (int i = 5; i > 0 ; i--) {
            System.out.print(i);
        }
        System.out.println();

        //1부터 10까지 수들의 합
        int sum = 0;
        for (int i = 1; i < 11 ; i++) {
            sum += i;
            System.out.println("현재까지 총 합은? " + sum + "입니다.");
        }
        System.out.println("1부터 10까지 총합은? " + sum + "입니다.");
    }
}
