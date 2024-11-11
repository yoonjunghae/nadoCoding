package chap_07.camera;

//Speedcam is a camera. (IS-A 관계)
public class SpeedCam extends Camera {// 자식클래스


    public SpeedCam() {
        //this.name = "과속단속카메라";
        super("과속단속카메라");
    }

    public void takePicture(){
       super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }

    public void checkSpeed(){
        System.out.println("속도를 측정합니다");
    }

    public void recognizeLicensePlate(){
        System.out.println("차량번호를 인식합니다");
    }

    @Override //annotation
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능: 속도 측정, 번호 인식");
    }
}
