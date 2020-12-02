import main.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonsTest {
Person person1;
Person person2;
Person person3;
Person person4;


    @Before

    public void setUp() {
        List<Person> people = new ArrayList<>();
        person1 = new Person("Taylor", LocalDate.now(), Person.Sex.FEMALE, "tSwift@gmail.com");
         person2 = new Person("Jim", LocalDate.now(), Person.Sex.MALE, "j-son@gmail.com");
         person3 = new Person("Slash", LocalDate.now(), Person.Sex.MALE, "Slash@gnr.com");
         person4 = new Person("Axl", LocalDate.now(), Person.Sex.MALE, "AxlRose@gnr.com");

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
    }

    @Test
    public void testConstructor() {
        setUp();

        Assert.assertNotNull(person1);
    }

    @Test
    public void testGetName() {

        String expected = "Taylor";
        String actual = person1.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetBirthday() {

        LocalDate expected = LocalDate.now();
        LocalDate actual = person1.getBirthday();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetGender(){
        Person.Sex expected = Person.Sex.FEMALE;
        Person.Sex actual = person1.getGender();
        Assert.assertEquals(expected, actual);
    }

@Test
    public void testGetEmailAddress(){
        String expected = "tSwift@gmail.com";
        String actual = person1.getEmailAddress();
        Assert.assertEquals(expected, actual);
}

@Test
    public void testToString(){

        String expected = "main.java.Person{" +
                "name='" + person1.getName() + '\'' +
                ", birthday='" + person1.getBirthday() + '\'' +
                ", gender=" + person1.getGender() +
                ", emailAddress='" + person1.getEmailAddress() + '\'' +
                '}';
        String actual = person1.toString();
        Assert.assertEquals(expected, actual);
    }
}






















