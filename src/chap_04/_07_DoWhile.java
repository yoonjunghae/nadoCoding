package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        //반복문 DoWhile
        int distance = 25; //전체 거리
        int move = 0; //현재 이동 거리
        int height = 2; //키 2m

        while(move + height < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재이동거리는 ? " + move);
            move+= 3;
        }
        System.out.println("도착하였습니다.");
        System.out.println("---------반복문 #1---------");
    //키가 엄청 큰사람
        move = 0;
        height = 25;

        while(move + height < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재이동거리는 ? " + move);
            move+= 3;
        }
        System.out.println("도착하였습니다.");

        System.out.println("----------반복문 #2----------");

        //Do While 반복문 : 조건상관없이 일단 do 문장 수행하고 나서 반복 할지 결정 최소 1번은 실행


        do{
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재이동거리는 : " + move);
            move +=3;
        } while (move + height <distance);
        System.out.println("도착했습니다");

    }
}
