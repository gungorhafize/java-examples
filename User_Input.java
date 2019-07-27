package userInput;
import java.util.*;
public class User_Input {

	static Scanner kullaniciGirisi = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("less is more and more is fun");
		
		System.out.print("Pls enter a number:");
		if(kullaniciGirisi.hasNext()){
			int girilenSayi = kullaniciGirisi.nextInt();
			System.out.println("You have been entered :"+ girilenSayi);
			int num =5;
		     num = num +1;
			System.out.println(num);
		}
		else{
			System.out.println("Try again one more!");
		}
	}

}
