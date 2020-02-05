import java.io.*;

public class ExceptionDemo {

	public static void main(String[] args) {
		      try {
		         int a[] = new int[10];
		         
		         for(int i=0; i<10;i++)
		         {
		        	 a[i]=i+1;
		         }
		         System.out.println("Access element three :" + a[12]);
		      } 
		      catch (ArrayIndexOutOfBoundsException e) {
		         
		    	  System.out.println("Exception :" + e);
		      }
		      
		      //System.out.println("Index out of Bound");
		   }
		
	}

