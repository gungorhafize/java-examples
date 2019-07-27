package array;
import java.util.*;
import static java.util.Arrays.*;
public class array_calisma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * //two dimensional array 
		int[][] sample ={{1,2,3},{4,5,6}};
		int x;
		x=sample[0][0];
		System.out.println(x);
		
		x=sample[0][1];
		System.out.println(x);
		x=sample[0][2];
		System.out.println(x);
		x=sample[1][0];
		System.out.println(x);

		x=sample[1][1];
		System.out.println(x);

		x=sample[1][2];
		System.out.println(x);
*/
		/* two dimensional array contains three array...
		int[][] arr = {{1,2,3},{4},{5,6,7}};
		arr[0][2]=42;	
		int x=arr[2][1];
		System.out.println(x);
		*/
		
		
		/* example1
		int arr[]=new int [3];
		for(int i=0;i<3;i++)
		{
			arr[i]=i;
		}
		int res=arr[2]+ arr[2];
		System.out.println(res);
		*/
		int a[]={1,3,4};
		for(int i=2;i>1;i--)
		{
			a[0] *= a[i];
		}

		System.out.print(a[0]);
	}

}
