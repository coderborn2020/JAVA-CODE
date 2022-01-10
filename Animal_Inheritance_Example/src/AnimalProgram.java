import java.util.ArrayList;
import java.util.List;

public class AnimalProgram {

    public static void main(String[] args){
        //Animal firstAnimal = new Animal("Panthera", "warm-blooded", 8);
        Mammal firstMammal = new Mammal("Ursidae", "warm-blooded",
                7, "live", 4);
        Mammal secondMammal = new Mammal("Delphinus", "warm-blooded",
                6, "live", 0);

        Animal someAnimal = firstMammal;        //child reference may be assigned to parent reference
        //Mammal someMammal = someMammal;       //parent reference cannot be assigned to child reference

        List<Animal> animalList = new ArrayList<Animal>();
        animalList.add(firstMammal);
        animalList.add(secondMammal);

        System.out.println(firstMammal);


    }
}
