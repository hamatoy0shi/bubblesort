package ru.mtsbank.lesson.three.shape;

public class Sphere extends Figure {

    public Sphere(float mass, float size) {
        super(mass, size);
    }

    @Override
    public double findVolume(float size) {
        return Math.pow(size, 3) * Math.PI * 4 / 3;
    }

}
