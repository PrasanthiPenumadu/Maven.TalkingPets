package io.zipcoder.polymorphism;
import io.zipcoder.pets.Bird;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;

import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String [] args) {
        Pet[] pet=new Pet[10];
        String speak="";
        Scanner ui = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int petCount= ui.nextInt();
        for(int i=1;i<=petCount;i++) {
            System.out.println("Please enter the pet " + i + " type");
           String s=ui.next();
           if(s.equalsIgnoreCase("dog")) {
               Dog dog=new Dog();
               pet[i]=dog;
           }if(s.equalsIgnoreCase("cat")) {
               Cat cat=new Cat();
                pet[i]=cat;
            }if(s.equalsIgnoreCase("bird")){
                Bird bird=new Bird();
            }
            System.out.println("Please enter the pet " + i + " name");
            pet[i].setPetName(ui.next());
        }
        for(int i=1;i<=petCount;i++)
        System.out.println( "Pet " +i+" name is "+pet[i].getPetName()+" and they speak "+pet[i].speak());
    }
}
