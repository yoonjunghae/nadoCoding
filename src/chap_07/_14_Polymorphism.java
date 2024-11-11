package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

import java.sql.SQLOutput;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성
        //class Person :  사람
        //class Student extends Person : 학생
        //class Teacher extends Person : 선생님 (Teacher is a person)

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        Camera [] cameras  = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for(Camera cam : cameras){
            cam.showMainFeature();
        }

        System.out.println("-------------------");

        //factoryCam.detectFire();
        //speedCam.

        if(camera instanceof Camera){
            System.out.println("카메라입니다");
        }
        if(factoryCam instanceof FactoryCam){
            ((FactoryCam)factoryCam).detectFire();
        }

        if(speedCam instanceof SpeedCam){
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizeLicensePlate();
        }

        Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new SpeedCam();

    }
}
