package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        //아스키 코드(ANSI) : 미국 표준 코드
        //알파벳 대문자 A는 65, 소문자a는 97부터, 숫자 0 은 48부터

        char c = '0'; // 48
        System.out.println(c);
        System.out.println((int)c);

        c = '1';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        String[][]seats3 = new String[10][15];
        char ch = 'A';

        for (int i = 0; i < seats3.length ; i++) {//세로
            for (int j = 0; j <seats3[i].length ; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }
        for (int i = 0; i < seats3.length; i++) { // 세로 기준
            for (int j = 0; j < seats3[i].length ; j++) { // 가로 기준
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();

        }



    }
}
