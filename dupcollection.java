import java.util.*;
//import java.lang.*;
public class removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="ashika natarajan";
         LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
         for(int i=0;i<str.length();i++)
             lhs.add(str.charAt(i));
         for(Character ch : lhs)
             System.out.print(ch);
	}

}
