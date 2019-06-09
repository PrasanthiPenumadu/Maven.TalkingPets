package io.zipcoder.pets;

import java.util.Comparator;

public class Cat extends Pet implements Comparator<Pet> {
    public Cat(){}
    public Cat(String petName,Integer petAge){
        super(petName,petAge);
    }
    public String speak(){
        return "meow meow";
    }

    @Override
    public int compare(Pet o1, Pet o2) {
        return o1.getPetType().compareTo(o2.getPetType());
    }
}

