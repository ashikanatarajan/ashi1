public class arrayrep {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6,6,2};
		int c=arr.length,b=0;
		for(int i=0;i<c;i++)
		{
			int count=1;
			for(int j=i+1;j<c;j++)
			{
				if(arr[i]==arr[j])
				{
					//arr[j]='$';
					count++;
				}
			}
			if(count>=2)
			{
			System.out.println(arr[i]);
			b++;
			}
		}
          
		
		

	}
}
