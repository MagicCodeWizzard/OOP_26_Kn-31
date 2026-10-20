package inheritance.model;

public class Figure {
    protected Point[] points;
    private boolean isPlaced;


    public Figure(Point[] points) {
        this.points = points;
    }

    public Figure(int numberOfPoints) {
        this.points = new Point[numberOfPoints];
    }

    public Point[] getPoints() {
        return points;
    }

    public void draw() {
        System.out.printf("Малюємо фігуру з кількістю точок: %d%n", points.length);
        for (var point : points) {
            point.draw();
        }
    }
}
