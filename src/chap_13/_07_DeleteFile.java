package chap_13;

import java.io.File;
import java.io.OutputStream;

public class _07_DeleteFile {
    public static void main(String[] args) {
        //파일 삭제
        File file = new File("goodjob.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("파일삭제성공" + file.getName());
            } else {
                System.out.println("파일삭제실패" + file.getName());
            }
        }
        //deleteFolder(A)
        //      deleteFolder(B)
        //          deleteFolder(C)
        //      C.delete() 삭제
        //    B.delete() 삭제
        // A.delete() 삭제
        // 재귀호출


        File folder = new File("A");
        if(folder.exists()){
            if(folder.delete()){
                System.out.println("폴더삭제성공" + folder.getAbsolutePath());
            }else {
                System.out.println("폴더삭제실패" + folder.getAbsolutePath());
            }
        }
       if(deleteFolder(folder)){
           System.out.println(" *폴더 삭제 성공 :" + folder.getAbsolutePath());
       }else{
           System.out.println(" *폴더 삭제 실패 :" + folder.getAbsolutePath() );
       };
    }

    public static boolean deleteFolder(File folder){
        if(folder.isDirectory()){
            for(File file : folder.listFiles()){
                deleteFolder(file);
            }
        }
        System.out.println("삭제대상 : " + folder.getAbsolutePath());
        return folder.delete();
    }
}
