import java.util.*;

public class ArraylistDemo {

	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add("VRUNDA DESAI");
		arr.add("MCA, DDU");
		arr.add("NADIAD");
		arr.add(387001);
		
		//System.out.println(arr);
		
		for(Object l:arr)
		{
			System.out.println(l);
		}
	}

}
