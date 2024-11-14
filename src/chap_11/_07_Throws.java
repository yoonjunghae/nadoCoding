package chap_11;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
    public static void main(String[] args) {
        // 예외 처리 미루기
        try {
            writeFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("메인메소드에서 해결할게요");
        }

    }
    public static void writeFile() throws IOException {
//        try {
//            FileWriter writer = new FileWriter("test.text");
//            throw new IOException("파일 쓰기에 실패했어요!!");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("writeFile 메소드 내에서 자체 해결했어요");
//        }

        FileWriter writer = new FileWriter("test.text");
        throw new IOException("파일 쓰기에 실패했어요!!");
    }
}
