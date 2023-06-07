package home_work_7.task2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<String> animals = new ArrayList<>();

    public void add(int index, String animal){
        animals.add(index, animal);
    }

    public void removeAnimal(String animal){
        animals.remove(animal);
    }
    public void removeAnimalByIndex(int index){
        animals.remove(index);
    }
    public int getSize(){
        return animals.size();
    }
    public List<String> getAnimals() {
        return animals;
    }
}
