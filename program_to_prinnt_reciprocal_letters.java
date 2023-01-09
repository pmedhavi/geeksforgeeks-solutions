//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            Solution ob = new Solution();
            String reciprocal = ob.reciprocalString(S);
            System.out.println(reciprocal);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static String reciprocalString(String S){
        // code here
        char ch [] = S.toCharArray();

        for (int i = 0; i < S.length(); i++) {

            if (Character.isUpperCase(ch[i])){

                ch[i] =(char)(90-ch[i]+65);

            }

            else if (Character.isLowerCase(ch[i])){

                ch[i] =(char)(122-ch[i]+97);

            }

    }

        return new String (ch);
    }
}
