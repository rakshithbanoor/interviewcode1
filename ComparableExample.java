package ProblemsUsingStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
	    private String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    @Override
	    public int compareTo(Person otherPerson) {
	        // Compare persons based on their age
//	        return Integer.compare(this.age, otherPerson.age);
	        //Compare persons based on their name
	        return this.name.compareTo(otherPerson.name);
	    }
	}

	public class ComparableExample {
	    public static void main(String[] args) {
	        List<Person> personList = new ArrayList<>();
	        personList.add(new Person("Alice", 25));   
	        personList.add(new Person("Charlie", 30));
	        personList.add(new Person("Bob", 20));

	        Collections.sort(personList);

	        for (Person person : personList) {
	            System.out.println("Name: " + person.getName()+ ", Age: " + person.getAge());
	        }
	    }
	}


