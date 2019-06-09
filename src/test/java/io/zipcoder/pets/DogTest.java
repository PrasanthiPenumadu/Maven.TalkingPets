package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void speak() {
        Dog axle=new Dog();
        Assert.assertEquals("woof woof", axle.speak());
    }
    @Test
    public void speak1() {
        Dog axle=new Dog();
        Assert.assertNotEquals("bark", axle.speak());
    }
    @Test
    public void testName(){
        Dog dog=new Dog("Axle",9);
        Assert.assertEquals("Axle", dog.getPetName());
    }
    @Test
    public void testName1(){
        Dog dog=new Dog("Axle",9);
        Assert.assertNotEquals("Axle1", dog.getPetName());
    }
    @Test
    public void testtype(){
        Dog dog=new Dog("Axle","dog",9);
        Assert.assertEquals("dog", dog.getPetType());
    }
    @Test
    public void testtype1(){
        Dog dog=new Dog("Axle",9);
        Assert.assertNotEquals("Axle", dog.getPetType());
    }



}