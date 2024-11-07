package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        // Main method
        // 자바 프로그램 시작될 때 가장 처음으로 진입하는 곳

        for (String s : args) {
            System.out.println(s);
        }

        //1. 도서 조회
        //2. 도서 대출
        //3. 도서 반납
        if(args.length == 1){
            switch (args[0]) {
                case "1" :
                    System.out.println("도서 조회 메뉴");
                    break;
                case "2" :
                    System.out.println("도서 대출 메뉴");
                    break;
                case "3" :
                    System.out.println("도서 반납 메뉴");
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
            }
        }else{
            System.out.println("1-3 메뉴중 하나를 입력하세요 ");
        }
    }
}
