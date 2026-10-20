package inheritance.model;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Point center) {
        super(new Point[]{center});

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        super.draw();

        System.out.printf("Малюємо коло з центром: %s та радіусом %f%n",
                          getPoints()[0], radius);
    }
}
