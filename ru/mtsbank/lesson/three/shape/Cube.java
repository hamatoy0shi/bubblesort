package ru.mtsbank.lesson.three.shape;

public class Cube extends Figure {

    public Cube(float mass, float size) {
        super(mass, size);
    }

    @Override
    public double findVolume(float size) {
        return Math.pow(size, 3);
    }

}
