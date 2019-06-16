package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class PetSorterTests {


    private Dog dog;
    private Cat cat;
    private Child child;
    private Dog dog2;
    private Cat cat2;
    private Child child2;
    private Dog dog3;
    private Cat cat3;
    private Child child3;
    private ArrayList<Pets> petList;
    private PetSorter petSorter;


    @Before
    public void setUp(){
        dog = new Dog("Julius", "Dog");
        cat = new Cat("Nemo", "Cat");
        child = new Child("Xavier", "Child");
        dog2 = new Dog("Bartleby", "Dog");
        cat2 = new Cat("Hobbes", "Cat");
        child2 = new Child("Mary Jane", "Child");
        dog3 = new Dog("Calvin", "Dog");
        cat3 = new Cat("Bartleby", "Cat");
        child3 = new Child("Albert", "Child");

        petSorter = new PetSorter();

        petList = new ArrayList<>();
        petList.add(dog);
        petList.add(cat);
        petList.add(child);
        petList.add(dog2);
        petList.add(cat2);
        petList.add(child2);
        petList.add(dog3);
        petList.add(cat3);
        petList.add(child3);
    }

    public String buildList(){
        StringBuilder builder = new StringBuilder();
        for (Pets pet : petList){
            builder.append(pet.name + " is a " + pet.type + "\n");
        }
        return builder.toString();
    }



    @Test
    public void petSortTest() {
        Collections.sort(petList);
        String expected = "Albert";
        String actual = petList.get(0).name;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petSortTest2() {
        Collections.sort(petList);
        String expected = "Xavier";
        String actual = petList.get(petList.size() - 1).name;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petSortTest3() {
        Collections.sort(petList, petSorter);
        String expected = "Cat";
        String actual = petList.get(0).type;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petSortTest4() {
        Collections.sort(petList, petSorter);
        String expected = "Dog";
        String actual = petList.get(petList.size() - 1).type;

        Assert.assertEquals(expected, actual);
    }

    



    @Test
    public void sortTest1(){
        String expected = "Julius is a Dog\n" +
                "Nemo is a Cat\n" +
                "Xavier is a Child\n" +
                "Bartleby is a Dog\n" +
                "Hobbes is a Cat\n" +
                "Mary Jane is a Child\n" +
                "Calvin is a Dog\n" +
                "Bartleby is a Cat\n" +
                "Albert is a Child\n";

        String actual = buildList();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortTest2(){
        Collections.sort(petList);
        String expected = "Albert is a Child\n" +
                "Bartleby is a Cat\n" +
                "Bartleby is a Dog\n" +
                "Calvin is a Dog\n" +
                "Hobbes is a Cat\n" +
                "Julius is a Dog\n" +
                "Mary Jane is a Child\n" +
                "Nemo is a Cat\n" +
                "Xavier is a Child\n";

        String actual = buildList();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortTest3(){
        Collections.sort(petList, petSorter);
        String expected =  "Bartleby is a Cat\n" +
                "Hobbes is a Cat\n" +
                "Nemo is a Cat\n" +
                "Albert is a Child\n" +
                "Mary Jane is a Child\n" +
                "Xavier is a Child\n" +
                "Bartleby is a Dog\n" +
                "Calvin is a Dog\n" +
                "Julius is a Dog\n";


        String actual = buildList();
        Assert.assertEquals(expected, actual);
    }
}
