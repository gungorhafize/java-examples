package intopostfix;
import java.util.*;
import java.lang.*;
public class intopostfix extends Stack{
	
	public intopostfix(int x)
	{
		super();
	}
	
	public String inToPost(String infixString)
	{
		String postfixString =" ";
		Stack s1 = new Stack();
		for(int index = 0; index < infixString.length(); ++index){
			char chValue = infixString.charAt(index);
			if(chValue == '('){
				push('(');
			} else if(chValue == ')'){
				Character oper = (Character) s1.peek();
				while (!(oper.equals('(')) && !(isEmpty())){
					postfixString += oper.charValue();
					pop();
					oper = (Character) peek();
				}
				pop();
			} else if (chValue == '+' || chValue == '-'){
				//Stack is empty
				if(isEmpty()){
					push(chValue);
					//current stack is not empty
				} else {
					Character oper = (Character) s1.peek();
					while (!(isEmpty()|| oper.equals(new Character('(')) || oper.equals(new Character(')'))));
					pop();
					postfixString += oper.charValue();
				}
				s1.push(chValue);
			}
			else if ( chValue == '*'|| chValue =='/'){
				if(isEmpty()){
					s1.push(chValue);
				} else{
					Character oper = (Character) peek();
					while (!oper.equals(new Character('+')) && ! oper.equals(new Character('-')) && ! isEmpty()){
						pop();
						postfixString += oper.charValue();
					}
					s1.push(chValue);
				}
			} else {
				postfixString += chValue;
			}
				
		}
		while(!isEmpty()){
			Character oper = (Character) peek();
			if(!oper.equals(new Character ('('))){
				pop();
				postfixString += oper.charValue();
			}
		}
		return postfixString;
	}
	

	public static void main(String[] args) {
		intopostfix myStack = new intopostfix(10);
		System.out.println("Type in an expression like (1+2)* (3+4) / (12-5)\n");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println("The expression you've typed in infix form: \n " +str);
        System.out.println("The Equivalent Postfix Expression is :\n"+myStack.inToPost(str));
    }


	}


