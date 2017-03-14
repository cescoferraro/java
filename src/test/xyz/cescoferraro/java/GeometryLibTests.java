package xyz.cescoferraro.java;

import org.junit.Test;
import junit.framework.Assert;

import static org.junit.Assert.*;

public class GeometryLibTests {

    private GeometryLib mainClass = new GeometryLib();

    @Test
    public void LozengeArea() {
        Double area = mainClass.LozengeArea(2.0, 2.0);
        Assert.assertEquals("LozangeArea", area, 2.0, 0);
    }

    @Test
    public void ParallelogramArea() {
        Double area = mainClass.ParallelogramArea(2.0, 2.0);
        Assert.assertEquals("ParallelogramArea", area, 4.0, 0);
    }
    // Perimeter
    @Test
    public void RectanglePerimeter() {
        Double area = mainClass.RectanglePerimeter(2.0, 2.0);
        Assert.assertEquals("RectanglePerimeter", area, 8.0, 0);
    }
    @Test
    public void SquarePerimeter() {
        Double perimeter = mainClass.SquarePerimeter(2.0);
        Assert.assertEquals("SquarePerimetes", perimeter, 8.0, 0);
    }
    @Test
    public void CirclePerimeter() {
        Double perimeter = mainClass.CirclePerimeter(2.0);
        Assert.assertEquals("CirclePerimeter", perimeter, 4 * Math.PI, 0);
    }
    // Lateral Área
    @Test
    public void CubeSurfaceArea() {
        Double surface = mainClass.CubeSurfaceArea(2.0);
        Assert.assertEquals("CubeSurfaceArea", surface, 24, 0);
    }

    @Test
    public void CilinderSurfaceArea() {
        Double surface = mainClass.CilinderSurfaceArea(2.0, 2.0);
        Assert.assertEquals("CilinderSurfaceArea", surface, 8 * Math.PI, 0);
    }

    // Volumes
    @Test
    public void EsphereVolume() {
        Double volume = mainClass.EsphereVolume(3.0);
        Assert.assertEquals("EsphereVolume", volume, (27) * Math.PI, 0);
    }
    @Test
    public void CubeVolume() {
        Double volume = mainClass.CubeVolume(2.0);
        Assert.assertEquals("CubeVolume", volume, 8.0, 0);
    }
    @Test
    public void ParallelepipedVolume() {
        Double volume = mainClass.ParallelepipedVolume(1.0, 1.0, 1.0);
        Assert.assertEquals("ParallelepipedVolume", volume, 1.0, 0);
    }

    @Test
    public void CilinderVolume() {
        Double volume = mainClass.CilinderVolume(2.0, 2.0);
        Assert.assertEquals("CilinderVolume", volume, 8 * Math.PI, 0);
    }

    @Test
    public void ConeVolume() {
        Double volume = mainClass.ConeVolume(2.0, 2.0);
        Assert.assertEquals("ConeVolume",volume, (8 * Math.PI) / 3, 0);
    }

}
