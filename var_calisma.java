package variables;
import java.util.*;

public class var_calisma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bByte = 127;
		short bShort = 32767;
		int bInt = 2100000;
		long bLong = 9220000000L;
		float bFloat = 3.14F;
		double bDouble = 3.123123123123;
		//Numerik deðiþkenleri String tipine dönüþtürdük.
		String byteString = Byte.toString(bByte);
		String shortString = Short.toString(bShort);
		String intString = Integer.toString(bInt);
		String longString = Long.toString(bLong);
		String FloatString = Float.toString(bFloat);
		
		//Float to Int format
		double doubleDegisken = 34.46515135;
		int degisken = (int)doubleDegisken;
		
		//String to INTEGER
		
		int stringToInt =  Integer.parseInt(intString);
		
		
		
		System.out.println(Float.MAX_VALUE);//MAX VALUE
		System.out.println(Double.MIN_VALUE);//MINIMUM VAL.
		
		boolean trueOrfalse = false;
		
		char rChar = 66;//ASCII CODE B
		char bChar = 65;//ASCII CODE A
		char hChar = 'A';
		char escapeChar = '\n';//EMPTY LINE
		System.out.println(rChar);
		
		String rastString = "I am a string";
		String drastString = "I am also a string";
		String newString = rastString + ' ' + drastString;
		System.out.println(newString);
		
		

	}

}
