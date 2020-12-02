package main;

import java.util.ArrayList;
import java.util.List;

public class PersonHolder {
    List<Person> people;

    public PersonHolder(){
        this.people = new ArrayList<>();
    }

    public PersonHolder(Person p){
        this.people = new ArrayList<>();
        people.add(p);
    }

    public List<Person> getPeople(){
        return people;
    }

    public void add(Person p){
        people.add(p);
    }

    public List<Person> get(){
        return people;
    }



}
