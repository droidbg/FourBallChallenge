import processing.core.PApplet;

public class TestProcessing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int ballOne = 0;
    int ballTwo = 0;
    int ballThree = 0;
    int ballFour = 0;

    public static void main(String[] args) {
        PApplet.main("TestProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        ballOne = drawCircle(ballOne, 1);
        ballTwo = drawCircle(ballTwo, 2);
        ballThree = drawCircle(ballThree, 3);
        ballFour = drawCircle(ballFour, 4);
    }

    private int drawCircle(int xAxisPos, int unitPerFrame) {
        ellipse(xAxisPos, (float) (unitPerFrame * HEIGHT) / 5, DIAMETER, DIAMETER);
        return xAxisPos + unitPerFrame;
    }

}
