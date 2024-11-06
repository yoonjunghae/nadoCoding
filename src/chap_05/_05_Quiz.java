package chap_05;

public class _05_Quiz {
    public static void main(String[] args) {
        //배열을 활용해서 쇼핑몰에서 구매 가능한 신발사이즈 옵션
        //신발사이즈는 250부터 295까지 5단위로 증가
        //신발사이즈는 총 10가지
        //실행결과 사이즈 250 (재고있음)
        //실행결과 사이즈 255 (재고있음)
        //실행결과 사이즈 260 (재고있음)
        //실행결과 사이즈 265 (재고있음)
        //실행결과 사이즈 270 (재고있음)
        //실행결과 사이즈 275 (재고있음)
        //실행결과 사이즈 280 (재고있음)
        //실행결과 사이즈 285 (재고있음)
        //실행결과 사이즈 290 (재고있음)
        //실행결과 사이즈 295 (재고있음)

        int [] sizeArray = new int[10];

        for (int i = 0; i <sizeArray.length ; i++) {
            sizeArray[i] = 250 + (5 * i);


        }
        //foreach 
      for(int size : sizeArray){
          System.out.println("사이즈" + size + "(재고있음)");
      }
    }
}
