package org.lecture.planet;

public class PlanetDriverClass {

    public static void main(String[] args) {
        double earthWeight = 75d;
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values())
            System.out.printf("Your weight on %s is %f%n",
                    p, p.surfaceWeight(mass));
    }
}
