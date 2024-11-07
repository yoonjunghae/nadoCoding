package chap_06;

public class _06_WhenToUse {

    public static int getPower(int number){ //"4"
       // int result = number * number;
       // return result;
        return getPower(number,2);
    }
    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
            
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드 필요한 이유 ? 코드 유지보수가 편리함

        System.out.println(getPower(2,2));


    }
}
