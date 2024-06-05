package Question_1;

public class Question_1 
{
	public int reverseNumber(int x)
	{
		String a = "525" ;
		String rev="";
		for (int i=a.length()-1;i>=0; i--) 
		{
			rev=rev+a.charAt(i);
			
		}
		System.out.println(rev);
		return x;
	}

	public static void main(String[] args) 
	{
		Question_1 value= new Question_1();
		value.reverseNumber(10);

	}

}
