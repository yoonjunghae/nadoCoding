package chap_02;

public class _03_Operator3 {
    public static void main(String[] args) {
        //비교 연산자
        System.out.println(5 > 3); // 5는 3보다 크다 참이면 true  거짓이면 false
        System.out.println(5 >= 3); // 5는 3보다 크거나 같다.
        System.out.println(5 >= 5); // 5는 5보다 크거나 같다.
        System.out.println(5 >= 7); // false

        System.out.println(5 < 3); // 5는 3보다 작다 false
        System.out.println(5 <= 3); // 5는 3보다 작거나 같다 false

        System.out.println(5 == 5); // 같은지 비교하기위해서 등호 ==  true
        System.out.println(5 == 3); // false
        System.out.println(5 != 5); // false
        System.out.println(5 != 3); // true

    }
}
