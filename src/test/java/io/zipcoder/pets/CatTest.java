package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

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
        Assert.assertNotEquals("dog", cat.getPetName());
    }


    @Test
    public void compare() {
    }
}