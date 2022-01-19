public class Ball {

    private final Processor processor;
    private int horizontalPosition;
    private final int verticalPosition;
    private final int diameter;
    private final int movingSpeed;

    public Ball(Processor processor, int verticalPosition, int diameter, int movingSpeed) {
        this.verticalPosition = verticalPosition;
        this.diameter = diameter;
        this.movingSpeed = movingSpeed;
        this.processor = processor;
    }

    public void display() {
        this.processor.ellipse(this.horizontalPosition, this.verticalPosition, this.diameter, this.diameter);
        this.horizontalPosition += this.movingSpeed;
    }
}
