package inheritance;

import inheritance.model.*;

public class Main {
    static void main() {
        Figure someFigure = new Figure(new Point[]{
                new Point(0, 0),
                new Point(2, 3),
                new Point(4, 6.8)
        });
        someFigure.draw();

        System.out.println("+++++++++++++++++++");

        Polygon poly = new Polygon(new Point[]{
                new Point(2, 3),
                new Point(4, 6.8),
                new Point(-4, 6),
                new Point(10, 9)
        });
        poly.draw();

        System.out.println("+++++++++++++++++++");

        Circle circle = new Circle(5.5, new Point(0 ,0));
        circle.draw();

        System.out.println("+++++++++++++++++++");

        Line line = new Line(new Point(0, 0), new Point(4, 5));
        line.draw();
    }
}
