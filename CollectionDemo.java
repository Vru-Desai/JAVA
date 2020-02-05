import java.util.ArrayList;

public class CollectionDemo {

	static ArrayList a;
	public static void main(String[] args) {
		a=new ArrayList();
		a.add(new Person("Hetal Patel", 9090909090l));
		a.add(new Person("Utsav Patel", 9625632563l));
		a.add(new Person("Janak Shah", 90909852123l));
		a.add(new Person("Vivek Vyas", 90452169090l));
		//a.add(new Person("Vivek Vyas", 90452169090l));
		
		for(Object l:a)
		{
			System.out.println(l);
		}
		//System.out.println(a);
	}

}
