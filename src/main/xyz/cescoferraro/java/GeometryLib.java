package xyz.cescoferraro.java;

public class GeometryLib {

    public static void main(String[] args) {
        System.out.println("Class GeometryLib constructed!");
    }

    // Areas
    public Double LozengeArea(Double diagonalA, Double diagonalB) {
        return (diagonalA * diagonalB) / 2.0;
    }

    public static Double ParallelogramArea(Double sideA, Double sideB) {
        return (sideA * sideB);
    }
    // Perimeter
    public Double RectanglePerimeter(Double sideA, Double sideB) {
        return 2 * (sideA + sideB);
    }
    public static Double SquarePerimeter(Double side) {
        return 4 * (side);
    }
    public static Double CirclePerimeter(Double radius) {
        return Math.PI * radius * 2;
    }
    // Lateral Área
    public Double CubeSurfaceArea(Double side) {
        return 6 * Math.pow(side, 2);
    }

    public Double CilinderSurfaceArea(Double radius, Double height) {
        return GeometryLib.CirclePerimeter(radius) * height;
    }

    // Volumes
    public Double EsphereVolume(Double radius) {
        return (4 / 3) * Math.pow(radius, 3) * Math.PI;
    }
    public Double CubeVolume(Double side) {
        return Math.pow(side, 3);
    }
    public Double ParallelepipedVolume(Double sideA, Double sideB, Double sideC) {
        return sideA * sideB * sideC;
    }

    public static Double CilinderVolume(Double radius, Double height) {
        return (height) * Math.pow(radius, 2) * Math.PI;
    }

    public Double ConeVolume(Double radius, Double height) {
        return GeometryLib.CilinderVolume(radius, height) / 3;
    }
}
