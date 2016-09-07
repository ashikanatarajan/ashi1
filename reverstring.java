import java.util.Scanner;


public class rev {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str1="ashika ";
		//String str2="natarajan is my father";
		Scanner sc=new Scanner(System.in);
		String str2=sc.nextLine();
		String rev="";
		for(int i=str2.length()-1;i>=0;i--)
		{
			rev=rev+str2.charAt(i);
			//System.out.println(rev);
		}
		/*char ch[]=rev.toCharArray();
		for(int j=0;j<str2.length();j++)
		{
			if((ch[j]=='a')||(ch[j]=='A')||(ch[j]=='e')||(ch[j]=='E')||(ch[j]=='i')||(ch[j]=='I')||(ch[j]=='o')||(ch[j]=='O')||(ch[j]=='u')||(ch[j]=='U'))
			{
				ch[j]='$';
			}
		}
		String str=" ";
		for(int k=0;k<str2.length();k++)
		{
			if(ch[k]!='$')
			{
			str=str+ch[k];
			//System.out.print(ch[k]);
			}
		}
		
System.out.print(str.trim());*/
		System.out.print(rev);
	}

}
