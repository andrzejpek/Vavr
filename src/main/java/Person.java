import io.vavr.Tuple;
import io.vavr.collection.Map;


public class Person {

    private int Id=0;
    private String name;
    private String surname;
    static Map<Integer,Tuple>map;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        Id += 1;
    }

    public int getId() {
        return Id;
    }

    public void addAdress(Person person, String city, int nr_street, String post_code){
        map.put(getId(),Tuple.of(person.name,person.surname,city,nr_street,post_code));
    }

    static void showPerson(){
        System.out.println(map.size());
        for (Integer a : map.keySet()){
            System.out.println(map.get(a));
        }
    }


}
