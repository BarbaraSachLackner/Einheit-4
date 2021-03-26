package org.lecture.animal;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DogDriver {

    public static void main(String[] args) {
        //create e new Dog (=new Dog) and access its static inner class, the DogBuilder.
        Dog dogWithBuilder = new Dog.DogBuilder()
                .withName("Rocky")
                .withAge(2)
                .withBreed(Breed.AMSTAFF)
                .build();

        Dog dog =  new Dog.DogBuilder()
                .withName("Rocky")
                .withAge(2)
                .withBreed(Breed.AMSTAFF)
                .build();

        Animal animal = dog;

        log.debug(String.valueOf(dogWithBuilder.getBreed().getAvgYears()));
        log.debug(dogWithBuilder.getBreed().getStandardColour());

        log.info(dogWithBuilder.getName());
        log.info(dogWithBuilder.toString());

        if (dog instanceof  Animal) {
            log.info("IS instance of");
        }




    }


}
