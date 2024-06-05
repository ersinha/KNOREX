

package Question_4;

public class Question_4 
{
	public void printPrisonerToWarn(int n, int m, int s) 
	{
	    int lastPosition = (s + m - 1) % n;
	    if (lastPosition == 0) 
	    {
	        lastPosition = n;
	    }
	    System.out.println(lastPosition);
	}
	public static void main(String[] args) 
	{
		Question_4 value =new Question_4();
		value.printPrisonerToWarn(15,30, 45);
	}

}
