package org.lecture.animal;

import lombok.Getter;

@Getter
public enum Breed {
    POODLE("white"),
    GERMAN_SHEPHERD_DOG("brown/black"),
    AMSTAFF("white/brown");

    String standardColour = "";

    Breed(String standardColour) {
        this.standardColour = standardColour;
    }

}
