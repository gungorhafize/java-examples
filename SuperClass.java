package inheritance_Ex2;

public  class SuperClass {
	public class Super_Class{
		int num =20;
		
		public void display(){
			System.out.println("This is the display of Superclass");
		}
		
	}
	public static class Sub_Class extends Super_Class{
		int num=10;
		
		public void display()
		{
			System.out.println("This is the display of subclas");
		}
		
		public void my_Method(){
			
			Sub_Class sub = new Sub_Class();
			sub.display();
			super.display();
			System.out.println("Value of the variable named num in sub class:"+ sub.num);
			System.out.println("Value of the variable named num in super class:" +super.num);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sub_Class obj = new Sub_Class();
		obj.my_Method();

	}

}
