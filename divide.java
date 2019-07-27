
package triangle;
import java.io.NotActiveException;
import java.util.*;

import java.imageio.IIOException;



public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=0;
		Scanner input = new Scanner(System.in);
		
		try{
		System.out.print("Enter the numerator:");
		n1= input.nextInt();
		System.out.print("Enter the divisor:");
		n2 = input.nextInt();
				
		System.out.println(n1 +  "/" + n2 + "is" + n1 / n2);				
		
		}
		catch(ArithmeticException ex){
			System.out.println("You can't divide " + ex.getMessage());}					
		
		catch(InputMismatchException mis){
			System.out.println("You can't divide " + n1 + mis.getMessage());
		}
		
	}
}


