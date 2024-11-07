package chap_06;

public class _06_Quiz {
    public static void getHiddenData(){
        String name = "나코딩";
        name.substring(2);
        System.out.println(name.substring(2));
    }
    public static void main(String[] args) {
        //개인정보 비공개로 전환하는 메소드
        //하나의 메소드에서 모두 처리
        //이름 : 두번째글자 (윤 **)
        //주민번호 : 9번째 글자 910730-2******
        //전화번호 : 10번째 글자 010-7442-****

        String name = "나코딩";
        String id = "991030-1234567";
        String number = "010-1234-5678";
        System.out.println("이름 : " + getHiddenData(name, 1));
        //System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        //System.out.println("전화번호 : " + getHiddenData(phone, 9));

    }
}
