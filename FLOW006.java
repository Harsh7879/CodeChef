import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		List<Integer> li = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0;i<n;i++)
		{
		    
		    int ns = sc.nextInt();
		    String s = Integer.toString(ns);
		    int sum = 0;
		    for(int j =0; j<s.length();j++)
		    {
		        char b = s.charAt(j);
		        int a=Integer.parseInt(String.valueOf(b));
		        sum = sum+a;
		        
		    }
		    li.add(sum);
		    
		}
		for(int i = 0;i<n;i++)
		{
		    System.out.println(li.get(i));
		}
		    
		}
	}