package Exam.Ex9;

public class Point {
    private final int x;
    private final int y;
    private final int z;
    private final double distanceFromZero;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.distanceFromZero = Math.sqrt(Math.pow(Math.abs(this.getX()), 2)
                + Math.pow(Math.abs(this.getY()), 2)
                + Math.pow(Math.abs(this.getZ()), 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public double getDistanceFromZero() {
        return distanceFromZero;
    }

    @Override
    public String toString() {
        return "Point {" + x + ", " + y + ", " + z + "}";
    }
}
