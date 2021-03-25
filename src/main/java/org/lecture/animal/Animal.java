package org.lecture.animal;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)  //otherwise all fields get included
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
}
