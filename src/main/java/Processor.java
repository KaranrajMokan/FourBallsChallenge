import processing.core.PApplet;

public class Processor extends PApplet {

    public static final int width = 500;
    public static final int height = 500;
    public static final int diameter = 10;
    int ballOne, ballTwo, ballThree, ballFour;

    public static void main(String[] args) {
        PApplet.main("Processor", args);
    }

    @Override
    public void settings() {
        size(width, height);
    }

    @Override
    public void draw() {
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();
    }

    private void drawCircle1() {
        ellipse(ballOne, height / 5f, diameter, diameter);
        ballOne += 1;
    }

    private void drawCircle2() {
        ellipse(ballTwo, height * 2 / 5f, diameter, diameter);
        ballTwo += 2;
    }

    private void drawCircle3() {
        ellipse(ballThree, height * 3 / 5f, diameter, diameter);
        ballThree += 3;
    }

    private void drawCircle4() {
        ellipse(ballFour, height * 4 / 5f, diameter, diameter);
        ballFour += 4;
    }
}
