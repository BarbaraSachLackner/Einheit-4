package org.lecture.animal;

public class DogDriver {

    public static void main(String[] args) {
        //create e new Dog (=new Dog) and access its static inner class, the DogBuilder.
        Dog dogWithBuilder = new Dog.DogBuilder()
                .withName("Rocky")
                .withAge(2)
                .withBreed(Breed.AMSTAFF)
                .build();

        Dog anotherDog = new Dog.DogBuilder()
                .withName("Rocky")
                .withAge(3)
                .withBreed(Breed.AMSTAFF)
                .withBarfed(true)
                .build();

        System.out.println(dogWithBuilder.equals(anotherDog));
        System.out.println(dogWithBuilder);
        System.out.println(anotherDog);
    }



}
