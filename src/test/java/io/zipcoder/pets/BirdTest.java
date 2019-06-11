package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class BirdTest {

    @Test
    public void speak() {
        Bird bird=new Bird();
        Assert.assertNotEquals("meow meow", bird.speak());
    }
    @Test
    public void speak1() {
        Bird bird=new Bird();
        Assert.assertEquals("tweet tweet", bird.speak());
    }
@Test
public  void testName(){
        Bird bird=new Bird("tiku",7);
        Assert.assertEquals("tiku", bird.getPetName());
}
    @Test
    public  void testName1() {
        Bird bird = new Bird("tiku", 7);
        Assert.assertNotEquals("tuku", bird.getPetName());
    }
    @Test
    public  void testType(){
        Bird bird=new Bird("tiku","bird",7);
        Assert.assertEquals("bird", bird.getPetType());
    }
    @Test
    public  void testType1() {
        Bird bird = new Bird("tiku", 7);
        Assert.assertNotEquals("Bird", bird.getPetType());
    }


    @Test
    public void compareTo() {
        ArrayList<Bird> petList = new ArrayList<Bird>();
        petList.add(new Bird("tweety", 9));
        petList.add(new Bird("Axle", 9));
        Collections.sort(petList);
        ArrayList<Bird> petList1=new ArrayList<Bird>();
        petList1.add (new Bird("Axle",9));
        petList1.add(new Bird("tweety",9));

        Assert.assertEquals(petList1.get(0).petName, petList.get(0).petName);

    }
}