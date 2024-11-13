package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스
        Integer [] iArray = {1,2,3,4,5};
        Double [] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String [] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);


        System.out.println("==================");


        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);


    }
    //T : Type K : Key V : value  E : Element  <> 다이아몬드 기호
    private static <T> void printAnyArray(T[] array){
        for(T t : array){
            System.out.print(t + " ");
        }
        System.out.println();
        // 중복적으로 코드 정의할 필요 없이 T하나만 가지고 처리 할 수 있음
        // 제네릭스를 쓰면 불필요한 코드 중복을 막을 수 있음.
    }

    private static void printStringArray(String[] sArray) {
        for(String s : sArray){
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for(double d : dArray){
            System.out.print(d + " ");
        }
        System.out.println();
        
    }

    private static void printIntArray(Integer[] iArray) {//웨퍼클래스
       for(int i : iArray){
           System.out.print(i + " ");
       }
        System.out.println();
    }

}
