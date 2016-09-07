import java.util.Scanner;

/**
 * Created by Subramanian Ganesan on 6/27/2016.
 */
public class se {
    public static void main(String[] a)
    {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int temp=num;
        int see=num;
        int sum=0;
        while(temp>0){
            see=see*(temp%10);
            sum=sum+(temp%10);
            temp=temp/10;

        }
        num=num*sum;
        if (num==see)
        {
            System.out.println(num/sum+"  the number is a seed number ");
        }
        else
            System.out.println(num/sum +" is not a seed number");
    }
}
