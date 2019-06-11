package io.zipcoder.pets;

public class Dog extends Pet implements Comparable<Pet>{
   // Pet[] pets = new Pet[10];
    public Dog(){}
    public Dog(String petName,Integer petAge){
        super(petName,petAge);
    }
    public Dog(String petName,String petType,Integer petAge){
        super(petName,petType,petAge);
    }
        public String speak(){
        return "woof woof";
    }

    @Override
    public int compareTo(Pet o) {

          // if (o.getPetType().equalsIgnoreCase("dog"))
                return this.petName.compareTo(o.petName);

       // return 0;
    }
}
