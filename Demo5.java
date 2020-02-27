//Demo5.java
//Write a java program which accept string from user and display it in reverse order.

import java.util.*;
import java.lang.*;


class Line4
{
	public String ReverseX(String strr)
	{
		
		char temp;
		String reverse = "";
        
        
        for(int i = strr.length() - 1; i >= 0; i--)
        {
            reverse = reverse + strr.charAt(i);
        }
        
        System.out.println("Reversed string is:");
        System.out.println(reverse);
		
		return (reverse);
		
		
		/*char Array[]=strr.toCharArray();  
		int iStart=0;
		int iEnd=(Array.length)-1;
	
		
		for(iStart=0;iStart<iEnd;iStart++,iEnd--)
		{
			
				temp=Array[iStart];
				Array[iStart]=Array[iEnd];
				Array[iEnd]=temp;
			
			
		}
		System.out.println(Array.toString());
		return (Array.toString());*/
		
	}
}

class Demo5
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str=sobj.nextLine();
		
		Line4 lobj=new Line4();
		
		String rev = "";
		
		rev=lobj.ReverseX(str);
		
		
			System.out.println("String is"+rev);
		
	}
}
