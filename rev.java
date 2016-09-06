import java.util.*;
public class rev {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str1="ashika ";
		String str2="natarajan is my father";
		String rev="";
		for(int i=str2.length()-1;i>=0;i--)
		{
			rev=rev+str2.charAt(i);
			//System.out.println(rev);
		}
System.out.print(rev);
	}

}
