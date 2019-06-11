package io.zipcoder.pets;




public class Cat extends Pet implements Comparable<Pet> {
    public Cat(){}
    public Cat(String petName,Integer petAge){
        super(petName,petAge);
    }
    public String speak(){
        return "meow meow";
    }




    @Override
    public int compareTo(Pet o) {
       // if (o.getPetType().equalsIgnoreCase("dog"))
            return this.petName.compareTo(o.petName);

       // return 0;
    }
}

