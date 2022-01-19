import processing.core.PApplet;

public class Processor extends PApplet {

    private static final int width = 500;
    private static final int height = 500;
    private static final int diameter = 10;
    private static final int[] verticalPositionsOfBalls = {height / 5, height * 2 / 5, height * 3 / 5, height * 4 / 5};
    private static final int[] movingSpeedsOfBalls = {1, 2, 3, 4};
    private Ball ballOne, ballTwo, ballThree, ballFour;

    public static void main(String[] args) {
        PApplet.main("Processor", args);
    }

    @Override
    public void settings() {
        size(width, height);
    }

    @Override
    public void setup() {
        this.ballOne = new Ball(this, verticalPositionsOfBalls[0], diameter, movingSpeedsOfBalls[0]);
        this.ballTwo = new Ball(this, verticalPositionsOfBalls[1], diameter, movingSpeedsOfBalls[1]);
        this.ballThree = new Ball(this, verticalPositionsOfBalls[2], diameter, movingSpeedsOfBalls[2]);
        this.ballFour = new Ball(this, verticalPositionsOfBalls[3], diameter, movingSpeedsOfBalls[3]);
    }

    @Override
    public void draw() {
        this.ballOne.display();
        this.ballTwo.display();
        this.ballThree.display();
        this.ballFour.display();
    }

}
