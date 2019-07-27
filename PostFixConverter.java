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
	        // Numaray� tutacak ge�ici string
	        StringBuilder temp = new StringBuilder();

	        for(int i = 0; i != infix.length(); ++i)
	        {           
	            if(Character.isDigit(infix.charAt(i)))
	            {
	                /* Rakamla kar��la�ana dek tempe ekler
	                 */
	                temp.append(infix.charAt(i));
	                
	   
	                while((i+1) != infix.length() && (Character.isDigit(infix.charAt(i+1)) 
	                                                  || infix.charAt(i+1) == '.'))
	                {
	                    temp.append(infix.charAt(++i));
	                   
	                }
                    System.out.printf("%d. eleman '%s' postfixe g�nderildi\n", i+1, temp);
	                /* token yani par�a operator ise a�a�� k�s�mda
	                 */
	                postfix.add(temp.toString());
	                System.out.printf("Postfix:%s\n",postfix);
	                temp.delete(0, temp.length());
	                
	            }
	            
	            
	            // buran�n anlam� token yani par�alanan k�s�m bir operatordur.
	            else if(Character.isDigit(infix.charAt(i))==false)
	            {
	            	
	                inputToStack(infix.charAt(i));
	             if(stack.isEmpty()){
	            	 System.out.printf("Y���n bo�.\n");
	            	 
	             }
	             else
	                System.out.printf("%d. eleman %s y���na eklendi\n",i+1,stack);
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
	                    System.out.printf("�ki parantez �st �ste geldi�i i�in kald�r�ld�.\n");
	                    
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
