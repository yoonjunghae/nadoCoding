package chap_11;

public class _Quiz_11 {
    public static void main(String[] args) {
        //인기가 많은 상품이 선착순으로 판매되는 온라인 쇼핑몰에서 발생할수 있는 문제 처리 프로그램
        //상품 구매 가능 시간 , 상품 매진
        //각 문제에 대한 사용자 정의 예외 클래스 작성
        //에러코드에 따른 의도적 예외 발생
        //모든 클래스는 하나의 파일

        //0 에러없음 (상품 구매를 완료하였습니다)
        //1 판매시간아님 상품구매가능시간이 아닙니다. ( 상품구매는 20시부터 가능합니다)
        //2 매진 해당상품은 매진되었습니다. (다음기회에 이용해주세요)
        int errorCode = 1;
        try {
            if (errorCode == 0) {
                System.out.println("상품구매를 완료하였습니다.");
            } else if (errorCode == 1) {
                throw new NotOnSaleException("상품 구매 가능 시간이 아닙니다.");
            } else if (errorCode == 2) {
                throw new SoldOutException("해당상품은 매진되었습니다.");
            }
        }catch(NotOnSaleException e){
                System.out.println(e.getMessage());
                System.out.println("상품구매는 20시부터 가능합니다.");
            }
        catch(SoldOutException e){
                System.out.println(e.getMessage());
                System.out.println("다음기회에 이용해주세요");
            }

        }
    }

class NotOnSaleException extends Exception {
    public NotOnSaleException(String message) {
        super(message);
    }
}

class SoldOutException extends Exception {
    public SoldOutException(String message) {
        super(message);
    }
}
