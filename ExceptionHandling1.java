import java.io.*;
public class ExceptionHandling1 {
	

	public static void main(String args[])
	{
	try
	{
		int a[] = new int[5];
		a[5] = 10;
	} catch(ArrayIndexOutOfBoundsException e) {System.out.println("Array Index " + e); } 
	
	}
}
