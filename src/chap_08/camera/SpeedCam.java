package chap_08.camera;

import chap_08.detector.AccidentDetector;
import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;
import chap_08.reporter.VideoReporter;

public class SpeedCam extends Camera {

    private Detectable detector;
    private Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("속도측정, 번호인식");

    }

    public void detect() {
        this.detector.detect();

    }

    public void report() {
        this.reporter.report();
    }

}
