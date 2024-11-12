package chap_08;

import chap_08.camera.SpeedCam;
import chap_08.detector.AccidentDetector;
import chap_08.reporter.VideoReporter;

public class _Quiz_08 {
    public static void main(String[] args) {
        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetector(new AccidentDetector());
        speedCam.setReporter(new VideoReporter());
        speedCam.detect();
        speedCam.report();

        //실행결과 : 교통사고를 감지합니다.
        //직전 30초 영상과 함께 신고를 진행합니다.
    }
}
