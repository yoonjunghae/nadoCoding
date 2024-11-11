package chap_07;

public class BlackBox {
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상
    int serialNumber;

    static int counter = 0; // 시리얼 번호 생성해주는 역할(처음엔 0 ++연산 통해서 증가)


    static boolean canAutoReport = false; // 자동 신고 기능
    // static 붙이면 클래스 변수가 됨 공통으로 사용하는 변수

    BlackBox() {
//        System.out.println("기본생성자호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급 받았습니다. " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
//        this(); //기본생성자 호출
//         System.out.println("사용자 정의 생성자 호출");
//         this.modelName = modelName;
//         this.resolution = resolution;
//         this.color = color;
//         this.price = price;

    }

    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동신고기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리카드가 삽입되었습니다.");
        System.out.println("용량은" + capacity + "GB입니다.");
    }

    int getVideoType(int type) {
        if (type == 1) {
            return 9;
        } else if (type == 2) {
            return 1;
        }
        return 10;


    }

    // showDateTime : 날짜정보표시
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 포함됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은" + min + "분 단위로 기록됩니다. ");
    }

    void record() {
        record(true, true, 5);
    }

    static void callServiceCenter() {
        System.out.println("서비스센터 (1588-0000)으로 연결합니다.");
        //modelName = "test";
        canAutoReport = false; // static으로 선언한 클래스 변수는 클래스 메소드에서 바로 사용 가능
    }


    void appendModelName(String modelName) {
        this.modelName += modelName;


    }

    //getter &  setter
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {

            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    void setResolution(String resolution){
        this.resolution = resolution;
    }
    int getPrice(){
        return price;
    }
    void setPrice(int price){
        if(price <100000) {
            this.price = 100000;
        }else{
            this.price = price;
        }

    }
    String getColor(){
        return color;
    }
    void setColor(String color) {
        this.color = color;
    }
}
