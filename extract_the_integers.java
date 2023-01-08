//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String s = read.readLine();
            Solution ob = new Solution();
            ArrayList<String> ans = ob.extractIntegerWords(s);
            if(ans.size()==0)
                System.out.println("No Integers");
            else{
                for(int i=0;i<ans.size();i++)
                    System.out.print(ans.get(i)+" ");
                System.out.println();
            }
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    ArrayList<String> extractIntegerWords(String s) 
    { 
        // code here
        ArrayList<String> answer = new ArrayList<String>();

        

        for(int i=0;i<s.length();i++){

            StringBuilder sb = new StringBuilder("");

            while(Character.isDigit(s.charAt(i))){

                sb.append(s.charAt(i));

                if(i < s.length()-1){

                    i++;

                } else {

                    break;

                }

            }

            if(sb.length() > 0) { 

                answer.add(sb.toString()); 

            }

        }

        

        return answer;
    
    }
} 
