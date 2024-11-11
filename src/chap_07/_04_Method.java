package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.autoReport();//지원 안되는 상태
        BlackBox.canAutoReport = true;
        b1.autoReport();//지원됨

        b1.insertMemoryCard(256);

        // 일반 영상 : 1 (type)
        // 이벤트 영상(충돌감지) : 2

        int fileCount = b1.getVideoType(1);
        System.out.println("일반 영상 파일 수 " + fileCount + "개");
        fileCount = b1.getVideoType(2);
        System.out.println("이벤트 영상 파일 수 " + fileCount + "개");



    }
}
