package filterhack;

import java.util.ArrayList;
import java.util.List;

class Test{
	public static void main(String[] args) {
		Person p = new Person("glenn","dsilva");
		List<Person> people = new ArrayList<Person>();
		people.add(p);
	    printConditionally(people, new Condition() {
	        @Override
	        public boolean check(Person p) {
	            return true;
	        }
	    });

	    printConditionally(people, new Condition() {
	        @Override
	        public boolean check(Person p) {
	            return p.getLastname().startsWith("O");
	        }
	    });

	    printConditionally(people, new Condition() {
	        @Override
	        public boolean check(Person p) {
	            return p.getFirstname().startsWith("Y");
	        }
	    });
	}

	private static void printConditionally(List<Person> people, Condition condition) {
	    for (Person p: people) {
	        if (condition.check(p)) {
	            System.out.println(p);
	        }
	    }
	}
}
