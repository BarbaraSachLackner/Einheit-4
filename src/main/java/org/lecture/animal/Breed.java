package org.lecture.animal;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum Breed {
    POODLE("white", 8),
    GERMAN_SHEPHERD_DOG("brown/black", 10),
    AMSTAFF("white/brown", 11);

    String standardColour = "";
    int avgYears;

    Breed(String standardColour, int avgAge) {
        this.standardColour = standardColour;
        this.avgYears = avgAge;
    }

    public String getStandardColour() {
        return standardColour;
    }

    public int getAvgYears() {
        return avgYears;
    }
}
