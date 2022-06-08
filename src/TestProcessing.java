import processing.core.PApplet;

public class TestProcessing extends PApplet {
    public static final int WIDTH=640;
    public static final int HEIGHT=480;
    public static final int DIAMETER=10;
    int ballOne=0;
    int ballTwo=0;
    int ballThree=0;
    int ballFour=0;

    public static void main(String[] args)
    {
        PApplet.main("TestProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
       drawCircle(ballOne,HEIGHT/5);
       drawCircle(ballTwo,(2*HEIGHT)/5);
       drawCircle(ballThree,(3*HEIGHT)/5);
       drawCircle(ballFour,(4*HEIGHT)/5);
       ballOne++;
       ballTwo=ballTwo+2;
       ballThree=ballThree+3;
       ballFour=ballFour+4;
    }

    private void drawCircle(int xAxisPos,int yAxisPos) {
        ellipse(xAxisPos,yAxisPos,DIAMETER,DIAMETER);
    }

}
