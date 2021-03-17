package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    List<Dog> myDogs = new ArrayList<>();

    public void addDog(Dog dog) {
        myDogs.add(dog);
    }

    public List<Dog> getDogs() {
        return myDogs;
    }

    public void feedAll() {
        for (Dog actualDog : myDogs) {
            actualDog.feed();
        }
    }

    public Dog findByName(String name) {
        for (Dog actualDog : myDogs) {
            if (actualDog.getName().equals(name)) {
                return actualDog;
            }
        }
        throw new IllegalArgumentException();
    }

    public void playWith(String name, int hours) {
        for (Dog actualDog : myDogs) {
            if (actualDog.getName().equals(name)) {
                actualDog.play(hours);
            }
        }
    }

    public List<String> getHappyDogNames(int minHappiness) {
        List<String> listToReturn = new ArrayList<>();
        for (Dog actualDog : myDogs) {
            if (actualDog.getHappiness() > minHappiness) {
                listToReturn.add(actualDog.getName());
            }
        }
        return listToReturn;
    }

}
