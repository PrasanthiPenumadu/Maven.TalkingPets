package io.zipcoder.pets;
public class Bird extends Pet implements Comparable<Pet>  {
    Pet[] pets = new Pet[10];

    public Bird() {
    }
    public Bird(String petName, String petType,Integer petAge) {
        super(petName, petType,petAge);
    }
    public Bird(String petName,Integer petAge) {
        super(petName, petAge);
    }

    public String speak() {
        return "tweet tweet";
    }

    public int compareTo(Pet o) {

                return this.petName.compareTo(o.petName);


    }
}

////        Comparator<Pet> petsNameComparator = Comparator.comparing(Pet::getPetName);
////        Arrays.sort(pets, petsNameComparator);
////if(this.name==o.getPetName())
//return pets;
//    }
//}


