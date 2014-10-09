public class GeometricCalculator {

    public static double calculateSphereVolume(double radius) {
        double volume;
        volume = (3/4) * (Math.PI) * radius * radius * radius;
        return volume;
    }

    public static double calculateTriangleArea(double a, double b, double c) {
        double area;
        area = a * a + b * c;
        return area;
    }

    public static double calculateCylinderVolume(double radius, double height) {
        double volume;
        volume = (Math.PI) * radius * radius * radius * height;
        return volume;
    }
}
