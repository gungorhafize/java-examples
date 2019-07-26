import java.util.Scanner;
public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    System.out.println("----Enter the values----");
	    System.out.print("Enter Length1 [m] =");
	    double L1 = input.nextInt();
	    System.out.print("Enter Length2 [m] =");
	    double L2 = input.nextInt();
	    System.out.print("Enter Moments of intertia Ly1 [m^4] =");
	    double Ly1 = input.nextDouble();
	    System.out.print("Enter Moments of intertia Ly2 [m^4] =");
	    double Ly2 = input.nextInt();
	    System.out.print("Load q1 [kN/m] =");
	    double q1 = input.nextInt();
	    System.out.print("Load q2 [kN/m] =");
		double q2 = input.nextInt();
	    System.out.print("Step [-] =");
	    int step = input.nextInt();
	    int x = 0;
		double j = Ly1 / Ly2;
		double Mb = (q1 * Math.pow(L1, 3) + q2 * Math.pow(L2, 3) * j) / 8 * (L1 + L2 * j);
		double r = (L1 + L2) / step;
		int sayac = 0;
		for (x = 0; L1 + L2 >= x; x += r) {
			
			System.out.println(x);
			if (x <= L1) {
				double w1 = (x / L1) - Math.pow(x / L2, 2);
				System.out.print("x= " + sayac);
				System.out.print(Mb * (x / L2) - ((q1 * Math.pow(L1, 2) * w1) / 2));
				sayac += 1;
				
			} 
			
			else {
				double w2 = ((x - L1) / L2) - Math.pow((x - L1) / L2, 2);
				
				System.out.print("x= " + sayac);
				System.out.print(Mb * (1 - ((x - L1) / L2)) - ((q2 * Math.pow(L2, 2) * w2) / 2));
				sayac += 1;
	

}

}}
	}


