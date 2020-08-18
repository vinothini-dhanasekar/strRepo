package cg.com.strings;

import java.util.Scanner;



public class Countstring {
    
    
    
 public static int Words(String s1)
    {
       int count = 0;
        
      for (int i=0;i<s1.length();i++)
            {
                if (s1.charAt(i)==' ')
                {
                    count++;
                }
            }
            count = count + 1; 
        
        return count; 
    }
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.print("Input the string: ");
    String s1 = in.nextLine();

 

    System.out.print("Number of words in the string: " + Words(s1)+"\n");
}
}


