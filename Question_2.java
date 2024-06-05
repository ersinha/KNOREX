package question_2;

public class Question_2 
{
	
	 public void printTheSequence(int a, int b, int n) 
	 {
		 int term = a;
	     int increment = b;
	     
	     for (int i = 0; i < n; i++) 
	     {
	    	  term += increment;
	          System.out.print(term);
	          if (i < n - 1) 
	          {
	            System.out.print(" ");
	          }
	            increment *= 2; 
	     }
	     System.out.println(); 
	 }
	        

	public static void main(String[] args) 
	{
		Question_2 value = new Question_2();
		int a1 = 0, b1 = 2, n1 = 10;
		value.printTheSequence(a1, b1, n1);
		int a2 = 5, b2 = 3, n2 = 5;
		value.printTheSequence(a2, b2, n2);
	      

	}

}
