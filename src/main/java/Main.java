import io.vavr.Tuple;
import io.vavr.collection.HashMap;
import io.vavr.collection.Map;

public class Main {



    public static void main(String[] args) {


        System.out.println(Heron.squareRoot(1.0,25.0,6));
        System.out.println(Heron.squareRoot(1.0,9.0,3));
        System.out.println(Cube.cubeRoot(1.0,64.0));
        System.out.println(Cube.cubeRoot(1.0,27.0));
        System.out.println(Euler.euler(20));

        Person person = new Person("Andrzej","Pękala");
        Person person1 = new Person("Janek","Janek");
        person.addAdress(person, "Lodz",21,"95-050");
        person1.addAdress(person1,"Kraków",19,"96-201");
        Person.showPerson();


    }



}
