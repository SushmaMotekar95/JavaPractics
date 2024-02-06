import java.util.*;
public class vowel 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Character:=> ");
		char ch=s.next().charAt(0);
		char ch1=Character.toUpperCase(ch);
		switch (ch1)
		{
			    case 'A':
			    	System.out.println(ch+" is a Vowel");
					break;
				case 'E':
					System.out.println(ch+" is a Vowel");
					break;
				case 'I':
					System.out.println(ch+" is a Vowel");
				case 'O':
					System.out.println(ch+" is a Vowel");
				case 'U':
					System.out.println(ch+" is a Vowel");
				default:
					System.out.println(ch+" is a Consonant");
					break;
		}
	}

}
