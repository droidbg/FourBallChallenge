import processing.core.PApplet;

import java.util.ArrayList;

public class TestProcessing extends PApplet {
    private static final int X_DIM = 640;
    private static final int Y_DIM = 480;
    private static final int DIAMETER = 10;
    private static final int noOfBalls = 4;
    private static final int DIVISIONS=noOfBalls+1;

    private static ArrayList<Integer> ballXPositionList;


    public static void main(String[] args) {
        PApplet.main("TestProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(X_DIM, Y_DIM);
    }

    @Override
    public void setup() {
        final int startingPositionX=0;
        ballXPositionList = new ArrayList<>();
        for (int index = 0; index < noOfBalls; index++) {
            ballXPositionList.add(startingPositionX);
        }
    }

    @Override
    public void draw() {
        for (int index = 0; index < noOfBalls; index++) {
            int ballXthPosition = ballXPositionList.get(index);
            ballXPositionList.set(index,drawCircle(ballXthPosition, index + 1));
        }
    }

    private int drawCircle(int xAxisPos, int unitPerFrame) {
        ellipse(xAxisPos, (float) (unitPerFrame * Y_DIM) / DIVISIONS, DIAMETER, DIAMETER);
        return xAxisPos + unitPerFrame;
    }

}
