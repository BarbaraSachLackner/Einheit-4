package org.lecture.animal;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@Getter
@ToString
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)  //otherwise all fields get included
public class Animal {
    @EqualsAndHashCode.Include
    private final String name;
    private final int age;
    private final double height;
    private final double weight;


    public Animal(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String walk() {
        return "The animal moves";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Double.compare(animal.height, height) == 0 && Double.compare(animal.weight, weight) == 0 && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height, weight);
    }
}
