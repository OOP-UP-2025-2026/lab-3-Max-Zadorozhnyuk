package org.example.task2;
public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    // Приватні сеттери з перевіркою коректності
    private void setLength(double length) {
        if (length <= 0) throw new IllegalArgumentException("Довжина повинна бути більшою за нуль");
        this.length = length;
    }

    private void setWidth(double width) {
        if (width <= 0) throw new IllegalArgumentException("Ширина повинна бути більшою за нуль");
        this.width = width;
    }

    private void setHeight(double height) {
        if (height <= 0) throw new IllegalArgumentException("Висота повинна бути більшою за нуль");
        this.height = height;
    }

    // Публічні методи для обчислення
    public double getSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    public double getLateralSurfaceArea() {
        return 2 * height * (length + width);
    }

    public double getVolume() {
        return length * width * height;
    }
}