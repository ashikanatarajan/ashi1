import java.util.Scanner;
public class camel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String l="";
		char a=Character.toUpperCase(str.charAt(0));
l=l+a;
String str1=str.substring(1).toLowerCase();
l=l+str1;
System.out.print(l);

	}

}
