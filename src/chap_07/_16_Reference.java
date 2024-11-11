package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.SpeedCam;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형 (Primitive Data types):  int, float, double, long, boolean...
        int []i = new int[3];
        System.out.println(i[0]); //0
        //i[0].
        double[] d = new double[3];
        System.out.println(d[0]); //0.0

        // 참조 자료형 (Non-Primitive,Reference Data types) :String , Camera, FactoryCam, SpeedCam ...
        String[] s = new String[3];
        System.out.println(s[0]); // null

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null); //true
        //c[0]. 참조자료형은 메소드를 가짐
        ///////////////////////////////////////////////////////////
        System.out.println("--------------------------------------");

        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);

        b = 30;
        System.out.println(a);
        System.out.println(b);

        System.out.println("--------------------------------------");
        Camera c1 = new Camera();
        Camera c2= new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);
        System.out.println(c2.name);

        c2= c1;
        System.out.println(c1.name);
        System.out.println(c2.name);

        c2.name = "고장난카메라";
        System.out.println(c1.name);
        System.out.println(c2.name);
        changeName(c2);
        System.out.println(c1.name);
        System.out.println(c2.name) ;

        c2 = null;
        System.out.println(c2.name); //NullPointerException
    }

    public static void changeName(Camera camera){
        camera.name = "잘못된카메라";
    }
}
