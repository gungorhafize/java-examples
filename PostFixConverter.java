package infixpostfixOdev;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PostFixConverter {

	    private String infix; // The infix expression to be converted
	    private Deque<Character> stack = new ArrayDeque<Character>();
	    private List<String> postfix = new ArrayList<String>();
	    
	    public PostFixConverter(String expression)
	    {
	        infix = expression;
	        convertExpression();
	    }
	    private void convertExpression()
	    {
	        // Numarayý tutacak geçici string
	        StringBuilder temp = new StringBuilder();

	        for(int i = 0; i != infix.length(); ++i)
	        {           
	            if(Character.isDigit(infix.charAt(i)))
	            {
	                /* Rakamla karþýlaþana dek tempe ekler
	                 */
	                temp.append(infix.charAt(i));
	                
	   
	                while((i+1) != infix.length() && (Character.isDigit(infix.charAt(i+1)) 
	                                                  || infix.charAt(i+1) == '.'))
	                {
	                    temp.append(infix.charAt(++i));
	                   
	                }
                    System.out.printf("%d. eleman '%s' postfixe gönderildi\n", i+1, temp);
	                /* token yani parça operator ise aþaðý kýsýmda
	                 */
	                postfix.add(temp.toString());
	                System.out.printf("Postfix:%s\n",postfix);
	                temp.delete(0, temp.length());
	                
	            }
	            
	            
	            // buranýn anlamý token yani parçalanan kýsým bir operatordur.
	            else if(Character.isDigit(infix.charAt(i))==false)
	            {
	            	
	                inputToStack(infix.charAt(i));
	             if(stack.isEmpty()){
	            	 System.out.printf("Yýðýn boþ.\n");
	            	 
	             }
	             else
	                System.out.printf("%d. eleman %s yýðýna eklendi\n",i+1,stack);
	            }
	           
	        }
	        clearStack();
	        
	    }


	    private void inputToStack(char input)
	    {
	        if(stack.isEmpty() || input == '('){

	            stack.addLast(input);

	        }
	       
	        else 
	        {
	            if(input == ')')
	            {
	                while(!stack.getLast().equals('('))
	                {
	                    postfix.add(stack.removeLast().toString());
	                    System.out.printf("Ýki parantez üst üste geldiði için kaldýrýldý.\n");
	                    
	                }
	                stack.removeLast();
	                
	            }
	            else 
	            {
	                if(stack.getLast().equals('('))
	                    stack.addLast(input);
	                else
	                {
	                    while(!stack.isEmpty() && !stack.getLast().equals('(') && 
	                            getPrecedence(input) <= getPrecedence(stack.getLast()))
	                    {
	                        postfix.add(stack.removeLast().toString());
	                    }
	                    stack.addLast(input);
	                }
	            }
	        }
	    }


	    private int getPrecedence(char op)
	    {
	         if (op == '+' || op == '-')
	                return 1;
	         else if (op == '*' || op == '/')
	                return 2;
	         else if (op == '^')
	                return 3;
	         else return 0;
	    }


	    private void clearStack()
	    {
	        while(!stack.isEmpty())
	        {
	            postfix.add(stack.removeLast().toString());
	            
	        }
	    }


	    public void printExpression()
	    {
	        for(String str : postfix)
	        {
	            System.out.print(str + ' ');
	        }
	    }
	    public List<String> getPostfixAsList()
	    { 
	    		    	
	        return postfix;
	    }
	

	
}
