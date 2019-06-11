package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void testspeak() {
        Cat mimi=new Cat();
        Assert.assertEquals("meow meow", mimi.speak());
    }
    @Test
    public void testspeak1() {
        Cat mimi=new Cat();
        Assert.assertNotEquals("meow ", mimi.speak());
    }
    @Test
    public void testPetName() {
        Cat cat = new Cat("Mimi", 10);
        Assert.assertEquals("Mimi", cat.getPetName());
    }
    @Test
    public void testP1etName() {
        Cat cat = new Cat("Mimii", 10);
        Assert.assertNotEquals("Mimi", cat.getPetName());
    }
    @Test
    public void testPetAge() {
        Cat cat = new Cat("Mimi", 10);
        Assert.assertNotEquals("cat", cat.getPetType());
    }
    @Test
    public void testP1eAge1() {
        Cat cat = new Cat("Mimii", 10);
        Assert.assertNotEquals("Cat", cat.getPetName());
    }


    @Test
    public void compare() {
        ArrayList<Cat> petList = new ArrayList<Cat>();
        petList.add(new Cat("snoopy", 9));
        petList.add(new Cat("mimi", 9));
        Collections.sort(petList);
        ArrayList<Cat> petList1=new ArrayList<Cat>();
        petList1.add (new Cat("mimi",9));
        petList1.add(new Cat("snoopy",9));

        Assert.assertEquals(petList1.get(0).petName, petList.get(0).petName);

    }
}