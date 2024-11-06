package chap_04;

public class _06_While {
    public static void main(String[] args) {
        //반복문 While
        int distance = 25; //전체거리 25m
        int move = 0; //현재이동거리

        while(move < distance){ //현재이동거리가 전체거리보다 작다는 조건이 참인 동안 반복 수행
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재이동거리는? " + move);
            move += 3; //3m이동
       }
        System.out.println("도착했습니다.");
    }
    // 주어진 조건이 없으면 무한루프

}
