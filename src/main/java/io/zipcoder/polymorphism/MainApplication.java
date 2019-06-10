package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {
    public static void main(String[] args) {

        Integer petNumber;
        ArrayList<Pets> petList = new ArrayList<Pets>();



        petNumber = Input.inputInteger("Hello, how many pets do you have?");;

        while (petNumber == null) {
            try {
                if (petNumber <= 0) {
                    System.out.println("c'mon man, why are you even here?");
                    System.exit(0);
                } else if (petNumber > 10) {
                    System.out.println("I think I'm going to have to report you, that's too many pets!");
                    System.exit(0);
                }
            } catch (InputMismatchException e){
                System.out.println("All right asshole, I see we're gonna have to do this the hard way");
            }
        }
                    if (petNumber >= 1) {
                    System.out.println("Great, you have pets! What kind of pet do you have?");


                    for (int i = 1; i <= petNumber; i++) {
                        String kindOfPet = Input.inputString("What kind of animal is pet number " + i + "?");
                        String petName = Input.inputString("What is pet " + i + "'s name?");
                        switch (kindOfPet.toLowerCase()) {

                            case ("dog"):
                                Dog dog = new Dog(petName, kindOfPet);
                                petList.add(dog);
                                break;

                            case ("cat"):
                                Cat cat = new Cat(petName, kindOfPet);
                                petList.add(cat);
                                break;

                            case ("child"):
                                Child child = new Child(petName, kindOfPet);
                                petList.add(child);
                                break;
                            default:
                                System.out.println("Pffft...   not a real animal.");
                                i--;
                                break;
                        }
                    }
                }
            //System.out.println(petList.toArray().toString());
        for (int i = 0; i < petList.size(); i++){
            System.out.println( "Pet " + i + " is a " + petList.get(i).getName() + " and its name is " + petList.get(i).getType() + " and it goes " + petList.get(i).speak);

        }
            System.exit(0);
            }
        }




//private Comparator<Pet> newComparator = Comparator.comparing(Pet::getType).theComparing(Pet::getName);  Check this shit out for the next lab and also read that article that joanna posted in slack