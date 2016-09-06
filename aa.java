public class aa {
public static void main(String ar[])
{
	int a=12345;
	String b=String.valueOf(a);
	int c=b.length(),k=0;
	//System.out.println(c);
	char a1[]=b.toCharArray();
	char res[]=new char [c];
	for(int i=c-1;i>=0;i--)
	{
		res[k]=a1[i];
		System.out.print(res[k]);
	k++;
	
	
}
}
}
