package ru.mtsb.lesson.three;

import ru.mtsbank.lesson.three.shape.Sphere;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Sphere> sphereArrayList = new ArrayList<Sphere>();

        sphereArrayList.add(new Sphere(5.5F,7));
        sphereArrayList.add(new Sphere(30.5F,12));
        sphereArrayList.add(new Sphere(12,2));
        sphereArrayList.add(new Sphere(67F,1));
        sphereArrayList.add(new Sphere(25,5));
        sphereArrayList.add(new Sphere(8,21));
        sphereArrayList.add(new Sphere(43,4.5F));
        sphereArrayList.add(new Sphere(7.3F,7.3F));
        sphereArrayList.add(new Sphere(11.6F,8));

        System.out.println("before sorting: ");
        for (Sphere value : sphereArrayList) {
            System.out.print(value.getDensity() + " ");
        }

        for (int i = 0; i < sphereArrayList.size(); i++) {
            for (int j = 1; j < sphereArrayList.size(); j++)
                if (sphereArrayList.get(j).getDensity() > sphereArrayList.get(j-1).getDensity())
                    Collections.swap(sphereArrayList,j,j-1);
        }

        System.out.println("\nsorted: ");
        for (Sphere value : sphereArrayList) {
            System.out.print(value.getDensity() + " ");
        }

        System.out.println("\nthe most dense sphere: ");
        System.out.println(sphereArrayList.get(0).getDensity());
    }

}
