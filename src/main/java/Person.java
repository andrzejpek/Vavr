import io.vavr.Tuple;


public class Person {

    public static Tuple Person(String name, String surname) {
        return Tuple.of(name,surname);
    }



    public static Tuple addAdress(Tuple tuple ,String city, int nr_street, String post_code){
        return Tuple.of(tuple,city,nr_street,post_code);
    }

}
