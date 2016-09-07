public class evenoddc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str="ashika";
		char ch[]=str.toCharArray();
		int len=str.length();
		char ch1[]=new char[len];
		for(int i=0;i<len;i++)
		{
			if(i%2==0)
			{
				ch1[i+1]=ch[i];
			}
			else
				ch1[i-1]=ch[i];
		}
for(int k=0;k<len;k++)
{
	System.out.print(ch1[k]);
}
	}

}
