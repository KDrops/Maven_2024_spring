package review13;


import org.example.rewiew13.review.Empl;
import org.example.rewiew13.review.Manag;
import org.example.rewiew13.review.Pers;

public class PersTest {
    public static void main(String[] args) {

        final String lastName = "Doe";

        final String firstNameJohn = "John";
        final String firstNameJack = "Jack";
        final String firstNameJane = "Jane";

        final int ageJohn = 33;
        final int ageJack = 23;
        final int ageJane = 32;


        final Empl john = new Empl(firstNameJohn, lastName, ageJohn, 1000, "machinist");
        final Manag jack = new Manag(firstNameJack, lastName, ageJack, 1500, "boss", 12);
        final Pers jane = new Pers(firstNameJane, lastName, ageJane);

        testPerson(john, firstNameJohn, lastName, ageJohn);
        testPerson(jack, firstNameJack, lastName, ageJack);
        testPerson(jane, firstNameJane, lastName, ageJane);
    }

    public static void testPerson(Pers pers, String firstName, String lastName, int age){
        System.out.println(firstName.equals(pers.getFirstName()));
        System.out.println(lastName.equals(pers.getLastName()));
        System.out.println(age == pers.getAge());
        System.out.println("____________________");

    }

}
