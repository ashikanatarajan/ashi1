#include<stdio.h>
#include<conio.h>
int main()
{
	vector <char> stack;
	int n = 3;
	int r = 3;
	char fr = 'a';
	char t = 'b';
	char wi = 'c';
	char temp = ' ';
	
	int ret = 1;
	int w = 0;    //moves
	int moves = (pow (2, n) - 1);  //expected moves(2^n) - 1
	
        while(w <= moves)              
	{
		if(ret == 1)
		{
	       	   do
         	   {  
		    stack.push_back(to);
                    stack.push_back(from);
		     temp = t;
		     t = wi;
		     with = temp;
		     fr = fr;
		    
		     ret = 2;
		     n--;
		   }while(n >= 1);
	 	   
		 }

		 if( ret == 2)
		  {
		     
	  	        cout << "move ring from tower " << stack.back();
		        stack.pop_back();
		        cout << " to tower " << stack.back() << endl;
		       stack.pop_back();
		        w++;
			if(w >= moves)
			{
			  break;
			}
		        ret = 3;
		       
		   }   
		  
		  if(ret == 3)
		   {
		     cout << "move ring from tower " << stack.back();
		     stack.pop_back();
		     cout << " to tower " << stack.back() << endl;
		     stack.pop_back();
		     w++;
		     temp = with;
		     with = from;
		     from = temp;
		    
		     to = to;
		     n = rings;
		     ret = 1;
		    }
		}
}
