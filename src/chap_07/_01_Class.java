package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 (OOP : Objecct-Oriented Programming)
        // 유지보수 용이
        // 높은 재사용성
        // 차량용 블랙박스
        // 모델명, 해상도, 가격, 색상

        // 첫번째 개발
        String modelName = "까망이";
        String resolution = "FHD";
        int Price = 200000;
        String color = "블랙";

        // 새로운 제품 개발

        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int Price2 = 300000;
        String color2 = "화이트";

        // 또 다른 제품 개발? 변수가 너무 많아짐

        BlackBox bbox = new BlackBox();
        // BlackBox 클래스로 부터 bbox 객체
        // 생성 bbox는 BlackBox 클래스의 인스턴스
        // class 종이접기책  책을보고 만든게 객체

        BlackBox bbox2 = new BlackBox();



    }
}
