import io.vavr.Tuple;

public class Main {



    public static void main(String[] args) {


        System.out.println(Heron.squareRoot(1.0,25.0,6));
        System.out.println(Heron.squareRoot(1.0,9.0,3));
        System.out.println(Cube.cubeRoot(1.0,64.0));
        System.out.println(Cube.cubeRoot(1.0,27.0));
        System.out.println(Euler.euler(20));

        Tuple person =  Person.Person("Andrzej","Andrzej");
        Tuple person1 = Person.Person("Janek","Janek");
        person1=Person.addAdress(person1,"Kraków",19,"96-201");
        System.out.println(person);
        person = Person.addAdress(person,"łodz",23,"95-211");
        System.out.println(person);
        System.out.println(person1);
    }



}
