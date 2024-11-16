package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {
        // 상품 A,B 각각 5개씩
        // 상품 두사람이 독립적 준비
        // 모두 준비된 이후에 세트상품 포장
        // 포장이 필요한 세트 상품은 총 5개
        // 모든 클래스는 하나의 파일에 정의

        Runnable runnableA = ()->{
            for (int i = 1; i <=5; i++) {
                System.out.println("A 상품 준비 " + i + "/5");
            };
            System.out.println("--A 상품준비완료--");
        };

        Runnable runnableB = ()->{
            for (int i = 1; i <=5; i++) {
                System.out.println("B 상품 준비 " + i + "/5");
            };
            System.out.println("--B 상품준비완료--");
        };

        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);

        threadA.start();
        threadB.start();

        while (threadA.isAlive() || threadB.isAlive()){

        }

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Runnable runnableSET = ()->{
            System.out.println("==세트상품 포장시작==");
            for (int i = 1; i <=5; i++) {
                System.out.println("세트 상품 포장 " + i + "/5");
            };
            System.out.println("==세트상품 준비완료==");
        };
        Thread threadSET = new Thread(runnableSET);
        threadSET.start();


    }
}
