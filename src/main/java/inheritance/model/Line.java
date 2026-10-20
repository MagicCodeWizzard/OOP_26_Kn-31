package inheritance.model;

public class Line extends Figure {

    public final double DEFAULT_LINE_WIDTH = 0.1;

    private double lineWidth;

    public Line(Point begin, Point end) {
        super(new Point[]{begin, end});

        lineWidth = DEFAULT_LINE_WIDTH;
    }

    public Line(Point begin, Point end, double lineWidth) {
        super(new Point[]{begin, end});

        this.lineWidth = lineWidth;
    }


    @Override
    public void draw() {
        super.draw();

        System.out.printf("Намальовано лінію шириною %f мм%n", lineWidth);
    }
}
