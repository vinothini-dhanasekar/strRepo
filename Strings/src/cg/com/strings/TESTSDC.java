package cg.com.strings;

public class TESTSDC {
	

	 


	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        String s="this this is a book";
	        int count=0; 
	        String[] word=s.split(" ");
	         for(int i=0;i<word.length;i++)        
	          {
	            
	                 if (word[i] != " ")
	                 {
	                     
	                     count = count + 1; 
	                     
	             
	    }
	          }
	                 System.out.println("Number of words:"+count);
	}
	    }
	


