package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        // 버스번호 1234 상암08
        // 남은시간 분단위 3분 5분
        // 남은거리는 km단위

        /*실행결과
        상암08번 버스
        약 3분 후 도착
        남은 거리 1.2km*/

        String busNo = "상암08";
        int minutes = 3;
        Double distance = 1.2;

        System.out.println(busNo+"번 버스");
        System.out.println("약 " + minutes + "분 후 도착");
        System.out.println("남은 거리 " + distance + "km");



    }
}
