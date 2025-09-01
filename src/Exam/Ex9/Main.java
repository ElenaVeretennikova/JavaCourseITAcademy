package Exam.Ex9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(1, -1, -1);
        Point point2 = new Point(9, 2, 6);
        Point point3 = new Point(7, -10, 2);
        Point point4 = new Point(5, 5, 15);
        Point point5 = new Point(-20, -5, 4);
        List<Point> points = List.of(point1, point2, point3, point4, point5);

        System.out.println("Точка с максимальным значением X: " + getPointWithMaxX(points));
        System.out.println("Расстояния от начала координат " + Arrays.toString(getAllDistanceFromZero(points)));
        System.out.println("Отсортированные объекты по расстоянию от начала координат: "
                + filterAndReverseSortByDistanceFromZero(points, 5.0d));
    }

    public static Point getPointWithMaxX(List<Point> points) {
        return points.stream()
                .max(Comparator.comparingInt(Point::getX))
                .orElseGet(() -> new Point(0, 0, 0));
    }

    public static double[] getAllDistanceFromZero(List<Point> points) {
        return points.stream()
                .mapToDouble(Point::getDistanceFromZero)
                .toArray();
    }

    public static List<Point> filterAndReverseSortByDistanceFromZero(List<Point> points, double minDistance) {
        return points.stream()
                .filter(point -> point.getDistanceFromZero() > minDistance)
                .sorted(Comparator.comparingDouble(Point::getDistanceFromZero).reversed())
                .toList();
    }
}
