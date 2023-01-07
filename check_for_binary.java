//{ Driver Code Starts
import java.util.*;


class checkBinary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T>0)
		{
			String str = sc.nextLine();
			GfG g = new GfG();
			boolean b = g.isBinary(str);
			if(b== true)
				System.out.println(1);
			else
			    System.out.println(0);
		T--;
		}
	}
}


// } Driver Code Ends


class GfG
{
	boolean isBinary(String str)
	{
	  //Your code here
	  char[] ch=str.toCharArray();
	  for(int i=0;i<ch.length;i++)
	  {
	      if(ch[i]!='1'&&ch[i]!='0')
	      {
	          return false;
	      }
	  }
	  return true;
	}
}
