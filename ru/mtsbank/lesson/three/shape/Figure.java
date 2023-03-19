package ru.mtsbank.lesson.three.shape;

public abstract class Figure {

    float size;

    float mass;

    public Figure(float mass, float size) {
        this.mass = mass;
        this.size = size;
    }

    public abstract double findVolume(float size);

    public double getDensity() {
        return mass / findVolume(size);
    }

}
