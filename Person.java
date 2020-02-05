
public class Person {
	String name;
	long number;
	
	public Person(String name, long number) {
		super();
		this.name = name;
		this.number = number;
	}

	@Override
	public String toString() {
		return name +"    "+ number;
	}
	
	

}
