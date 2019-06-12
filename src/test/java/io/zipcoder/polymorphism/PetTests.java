package io.zipcoder.polymorphism;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by leon on 11/6/17.
 */
public class PetTests {

    private Dog dog;
    private Cat cat;
    private Child child;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private ArrayList<Pets> petList;


    @Before
    public void setUp(){
        dog = new Dog("Henry", "Dog");
        cat = new Cat("Connor", "Cat");
        child = new Child("MJ", "Child");
        petList = new ArrayList<>();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void dogNameTest1(){
        String expected = "Henry";
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dogNameTest2(){
        Dog dog2 = new Dog("Arnold");
        String expected = "Arnold";
        String actual = dog2.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catNameTest1(){
        String expected = "Connor";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catNameTest2(){
        Cat cat2 = new Cat("Arnold");
        String expected = "Arnold";
        String actual = cat2.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void childNameTest1(){
        String expected = "MJ";
        String actual = child.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void childNameTest2(){
        Child child2 = new Child("bb boi");
        String expected = "bb boi";
        String actual = child2.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void childSetNameTest(){
        child.setName("bb boi");
        String expected = "bb boi";
        String actual = child.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dogSetNameTest(){
        dog.setName("santa's lil helper");
        String expected = "santa's lil helper";
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catSetNameTest(){
        cat.setName("snowbawl");
        String expected = "snowbawl";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catGetTypeTest(){
        String expected = "Cat";
        String actual = cat.getType();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void childGetTypeTest(){
        String expected = "Child";
        String actual = child.getType();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dogGetTypeTest(){
        String expected = "Dog";
        String actual = dog.getType();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catSpeakTest(){
        String expected = "meowth\n";
        cat.speak();
        String actual = outContent.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dogSpeakTest(){
        String expected = "woof\n";
        dog.speak();
        String actual = outContent.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void childSpeakTest(){
        String expected = "waaah\n";
        child.speak();
        String actual = outContent.toString();
        Assert.assertEquals(expected, actual);
    }
}



