package infix2postfix;
import java.util.*;
import java.lang.*;
import java.io.*;
public class itof {

	private static final char add ='+', subtract ='-';
	private static final char multiply='*', divide='/';
	private static final char power='^';
	
	private boolean isOperator(char c){ //c bir operatör mü 
		return c == '+' || c == '-' || c == '*' || c == '/' || 
				c == '^' || c == '(' || c == ')';
	}
	
	private boolean isSpace(char c){
		return (c == ' ');
	}
	
	private boolean lowerPrecedence(char o1, char o2){
		
		switch(o1)
		{
		case '+':
		case '-':
			return !(o2 =='+' || o2=='-');
		case '*':
		case '/':
			return  o2=='^' || o2=='(';
		case '^':
			return o2=='(';
		case ')': 
			return true;
			default:
				return false;
		}	
	}
	
	  public String convertToPostfix(String infix)
	  {
		  Stack operatorStack = new Stack();
		  char c;
		  StringTokenizer parser = new StringTokenizer(infix,"+-*/^()",true);
		  StringBuffer postfix = new StringBuffer(infix.length());
		  
		  while(parser.hasMoreTokens()){
			  String token =  parser.nextToken();
			  c= token.charAt(0);
			  if(token.length()==1 && isOperator(c))
			  {
				  while(!(operatorStack.empty())&& 
						  (!lowerPrecedence(((String)operatorStack.peek()).charAt(0), c)))
				  
					  postfix.append(" ").append((String)operatorStack.pop());
				  
				  
				  if (c==')'){
					  String operator = (String)operatorStack.pop();
					  while (operator.charAt(0)!='(') {
	                       postfix.append(" ").append(operator);
	                       operator = (String)operatorStack.pop();  
	                    }
					  
				  }
				  else
		                 operatorStack.push(token);
			  }
			  else if ( (token.length() == 1) && isSpace(c) ) {   
				  
              }
			  else { 
		             postfix.append(" ").append(token);  
		           }
			 
			  
			  while (!operatorStack.empty())
		           postfix.append(" ").append((String)operatorStack.pop());
		     
			 
		  }
		
		  return postfix.toString();
	  }
	
	  public int evaluate(String expr){
		  
		  Stack stack = new Stack();
	        int o1, o2, result = 0;
	        String token;
	        StringTokenizer tokenizer = new StringTokenizer(expr);
	        
	        while (tokenizer.hasMoreTokens()) {
	            token = tokenizer.nextToken();
	            char c = token.charAt(0); 
	            if (isOperator(c)) {
	                o2 = ((Integer) stack.pop()).intValue();
	                o1 = ((Integer) stack.pop()).intValue();
	                result = evalSingleOp(token.charAt(0), o1, o2);
	                stack.push(new Integer(result));
	            }
	            else
	                stack.push(new Integer(Integer.parseInt(token)));
	  }
	        result = ((Integer) stack.pop()).intValue();
	        return result;
	        }
	
	  private int evalSingleOp(char operation, int o1, int o2){
		  
		  int result = 0;

	        switch (operation) {
	            case add :
	                result = o1 + o2;
	                break;
	            case subtract :
	                result = o1 - o2;
	                break;
	            case multiply :
	                result = o1 * o2;
	                break;
	            case divide :
	                result = o1 / o2;
	            case power :
	                result = (int) Math.pow(o1,o2);
	        }

	        return result;
	    }
	  
	  
	
	public static void main(String[] args) {
		 String[] testString = {"2*(5+10)"};
		 itof converter = new itof();
           
		 
		 System.out.println("\nTest for convertToPostfix:\n");
		 for (int i=0; i<testString.length; i++) {
		      System.out.println("infix: " + testString[i]);
		      System.out.println("postfix: " + converter.convertToPostfix(testString[i]));
		      System.out.println("postfix evaluation: " + converter.evaluate( converter.convertToPostfix(testString[i])));
		      
		      System.out.println();
		   }

	}

}
