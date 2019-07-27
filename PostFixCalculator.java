package infixpostfixOdev;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
public class PostFixCalculator {
	
	  private List<String> expression = new ArrayList<String>();
	  private Deque<Double> stack = new ArrayDeque<Double>();
	  public PostFixCalculator(List<String> postfix) {expression = postfix;}


	    public BigDecimal result()
	    {
	        for(int i = 0; i != expression.size(); ++i)
	        {
	            // rakamsal ifade olup olmadigina karar veriyor
	            if(Character.isDigit(expression.get(i).charAt(0)))
	            {
	                stack.addLast(Double.parseDouble(expression.get(i)));
	                System.out.printf("\n%d. eleman %.2f yýðýna atýldý",i+1,Double.parseDouble(expression.get(i)));
	            }
	            else 
	            {
	                double tempResult = 0;
	                double temp;

	                switch(expression.get(i))
	                {
	                    case "+": temp = stack.removeLast();
	                              tempResult = stack.peek() + temp;
	                              System.out.printf("\n%d. eleman %s yýðýndan alýndý.",i+1, expression.get(i));
                                  System.out.printf("\nElemanlar yýðýndan alýndý.\nSonuç %.2f + %.2f = %.2f",temp,stack.peek(), tempResult);
	                              stack.pop();
                                  break;

	                    case "-": temp = stack.removeLast();
	                              tempResult =stack.peek()  - temp;
	                              System.out.printf("\n%d. eleman %s yýðýndan alýndý.\n",i+1, expression.get(i));
                                  System.out.printf("Elemanlar yýðýndan alýndý.\nSonuç %.2f - %.2f = %.2f",temp,stack.peek(), tempResult);
	                              stack.pop();
	                              break;

	                    case "*": temp = stack.removeLast();
	                              tempResult = stack.peek()  * temp;
	                              System.out.printf("\n%d. eleman %s yýðýndan alýndý.\n",i+1, expression.get(i));
                                  System.out.printf("Elemanlar yýðýndan alýndý.\nSonuç %.2f * %.2f = %.2f",temp,stack.peek(), tempResult);
	                              stack.pop();
	                              break;

	                    case "/": temp = stack.removeLast();
	                              tempResult =stack.peek()  / temp;
	                              System.out.printf("\n%d. eleman %s yýðýndan alýndý.\n ",i+1, expression.get(i));
                                  System.out.printf("Elemanlar yýðýndan alýndý.\nSonuç %.3f / %.3f = %.3f",temp,stack.peek(), tempResult);
	                              stack.pop();
	                              break;
	                }
	                stack.addLast(tempResult);
	              
	            }
	        }
	        return new BigDecimal(stack.removeLast()).setScale(3, BigDecimal.ROUND_HALF_UP);
	    }

}


