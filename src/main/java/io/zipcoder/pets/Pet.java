package io.zipcoder.pets;

import java.util.Arrays;

public abstract class Pet {


    String petName;
    String petType;
    Integer petAge;

   public Pet(String petName,String petType,Integer petAge){
       this.petType=petType;
       this.petName=petName;
       this.petAge=petAge;
   }
    public Pet(String petName,Integer petAge){
        this.petName=petName;
        this.petAge=petAge;
    }
   public Pet(){}

   public String speak(){return "";}

    public Integer getPetAge() {
        return petAge;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetName(){
       return petName;
   }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetAge(Integer petAge) {
        this.petAge = petAge;
    }


}
