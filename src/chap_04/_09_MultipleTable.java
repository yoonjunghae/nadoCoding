package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        //구구단 만들기
        // 2*1 = 2
        // 2*2 = 4
        //...

        //이중 for문

        for (int i = 2; i <10 ; i++) {
            for (int j = 1; j <10 ; j++) {
                System.out.println(i + "*" + j +"=" + (i*j));
            }
            System.out.println();
            }

        }
    }

