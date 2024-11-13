package chap_09;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;

public class _Quiz_09 {
    public static void main(String[] args) {
        //Arraylist 학생별 프로그래밍 언어 취득자격증 관리
        //학생이름 및 자격증 취득 정보를 위한 Student 클래스 생성
        //학생1인당 보유자격증 1개로 제한
        //모든 클래스는 하나의 파일에 정리
        //조건 유재석- 파이썬, 박명수- 자바, 김종국-자바, 조세호- c, 서장훈 -파이썬
        //실행결과 : 자바자격증을 보유한 학생 --------  박명수 김종국

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("유재석", "파이썬"));
        list.add(new Student("박명수", "자바"));
        list.add(new Student("김종국", "자바"));
        list.add(new Student("조세호", "C"));
        list.add(new Student("서장훈", "파이썬"));

        System.out.println("자바 자격증을 보유한 학생 ");
        System.out.println("------------------------");
        for(Student student : list) {
            if(student.certification.equals("자바")){
                System.out.println(student.name);
            }

        }

    }
}
class Student{
    public String name;
    public String certification;

    public Student(String name, String certification) {
        this.name = name;
        this.certification = certification;
    }
}
