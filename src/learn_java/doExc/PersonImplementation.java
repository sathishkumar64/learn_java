package learn_java.doExc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PersonImplementation {

	public static void main(String[] args) {
		
		List<Person> listPerson = Arrays.asList(				
				new Person(11,"Babu",32),
				new Person(12,"Kamal",34),
				new Person(10,"Arun",34),
				new Person(13,"Nandha",34)
				);

		// Java 7 
		/*
		 * Collections.sort(listPerson,new Comparator<Person>() {
		 * 
		 * @Override public int compare(Person o1, Person o2) { return
		 * o1.getName().compareTo(o2.getName()); } });
		 */
		
		//Java 8 
		Collections.sort(listPerson, (o1,o2) -> o1.getName().compareTo(o2.getName()));		
		
		
		listPerson.forEach(p -> System.out.println(p));
		
		
		System.out.println("_______________________________");
		//getBelow13(listPerson , p -> p.getId() < 13 , p -> System.out.println(p));
		getBelow13(listPerson , p -> p.getId() < 13 , System.out::println);  // You can refer MethosReference.java
	}
	
	static void getBelow13(List<Person> listPerson , Predicate<Person> predicate,Consumer<Person> consumer) {
	listPerson.forEach(p -> {			
			if(predicate.test(p)) {
				consumer.accept(p);
			}			
		}) ;		
	}

}
