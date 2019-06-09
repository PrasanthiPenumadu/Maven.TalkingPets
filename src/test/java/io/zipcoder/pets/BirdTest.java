package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

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
        Assert.assertNotEquals("dog", bird.getPetType());
    }


    @Test
    public void compareTo() {
    }
}