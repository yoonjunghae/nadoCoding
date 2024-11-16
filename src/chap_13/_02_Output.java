package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        //System.out.format();
        // souf System.out.printf();

        System.out.println("------ 정수 ------");
        //System.out.printf("포맷", 값1, 값2, 값3);
        System.out.printf("%d%n", 1); // 정수 출력 + 줄 바꿈
        System.out.printf("%d %d %d %n", 1, 2, 3);
        System.out.printf("%d%n", 1234);
        System.out.printf("%6d%n", 1234); //__1234(6자리의 공간 확보 뒤 1234 출력)
        System.out.printf("%06d%n", 1234); //001234(6자리의 공간 확보후 1234 출력, 빈공간은 0으로 채우기)
        System.out.printf("%6d%n", -1234);//_-1234
        System.out.printf("%+6d%n", 1234);//_+1234 (항상 기호 표시)
        System.out.printf("%,15d%n", 1000000000); //__1,000,000,000 (세자리마다 콤마로 구분)
        System.out.printf("%-6d%n", 1234); // 왼쪽정렬 1234__


        System.out.println("------ 실수 ------");
        System.out.printf("%f%n", Math.PI); // 3.141593
        System.out.printf("%.2f%n", Math.PI); // 3.14 (소수점둘째자리에서 반올림)
        System.out.printf("%6.2f%n", Math.PI);// __3.14 (6자리 공간확보 후 소수점 둘째자리)
        System.out.printf("%-6.2f%n", Math.PI);// 3.14__ (욍쪽정렬)
        System.out.printf("%06.2f%n", Math.PI);// 003.14 (빈공간 0으로 채우기)
        System.out.printf("%+6.2f%n", Math.PI); // _+3.14

        System.out.println("------ 문자열 ------");
        System.out.printf("%s%n", "java");
        System.out.printf("%6s%n", "java"); // __java (6자리 공간 확보후 우측정렬)
        System.out.printf("%-6s%n", "java"); // java__ (6자리 공간 확보후 좌측정렬)
        System.out.printf("%6.2s%n", "java"); // 6자리 (공간 확보후 ____ja 우측정렬 두글자만 출력)
        System.out.printf("%-6.2s%n", "java"); //ja____(공간 확보후 ja____ 좌측정렬 두글자만 출력)

        System.out.println("------ 응용1 ------");
        System.out.println("이름 영어 수학 평균");
        System.out.println("강백호 " + 90 + " " + 80 + " " + 85.0);
        System.out.println("서태웅 " + 100 + " " + 100 + " " + 100.0);
        System.out.println("채치수 " + 95 + " " + 100 + " " + 97.5);

        System.out.println("------ 응용2 ------");
        System.out.println("이름      영어   수학   평균"); // 공백 6, 3, 3
        System.out.printf("%-6s %4d %4d %6.1f%n","강백호",90,80,85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n","서태웅",100,100,100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n","채치수",95,100,97.5);

        System.out.println("------ 참고 ------");
        System.out.println("ABCDEFG");
        System.out.println("가나다라마바사");



    }
}
