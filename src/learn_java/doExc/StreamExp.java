package learn_java.doExc;

import java.util.Arrays;
import java.util.List;

public class StreamExp {

	public static void main(String[] args) {
		
		List<Person> listPerson = Arrays.asList(				
				new Person(11,"Babu",32),
				new Person(12,"Kamal",34),
				new Person(10,"Arun",34),
				new Person(13,"Nandha",34),
				new Person(14,"Sathish",34),
				new Person(15,"Kumar",34)
		);
		
		listPerson.stream()
		.filter(p -> p.getId() < 13)
		.filter(p -> p.getAge() == 34)		
		.forEach(p -> System.out.println(p));
		
		

	}

}
