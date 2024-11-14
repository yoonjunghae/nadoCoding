package chap_10;

import java.util.ArrayList;
import java.util.Map;

public class _Quiz_10 {
    public static void main(String[] args) {
        //스트림 이용해서 미술관 방문 손님 적절한 입장료 안내
        //Customer 클래스생성
        //1인당 5000원
        //20세 이상만 입장료 부과 (그 이외에는 무료)
        //챈들러 50 레이첼42 모니카21 벤자민18 제임스 5
        //실행결과
        //미술관 입장료
        //---------------
        //챈들러 5000원
        //레이첼 5000원
        //모니카 5000원
        //벤자민 무료
        //제임스 무료
        //힌트 map()이용해서 원하는 데이터 가공
        //삼항연산자 (int max = a>b ? a:b ;)

        ArrayList<Customer> list = new ArrayList<>();
        list.add(new Customer("챈들러",50));
        list.add(new Customer("레이첼",42));
        list.add(new Customer("모니카",21));
        list.add(new Customer("벤자민",18));
        list.add(new Customer("제임스",5));
        System.out.println("미술관입장료");
        System.out.println("----------");
        list.stream()
                .map(x->x.age>=20? x.name + " 5000원" : x.name + " 무료")
                .forEach(System.out::println);


    }

}
class Customer{
    public String name;
    public int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
