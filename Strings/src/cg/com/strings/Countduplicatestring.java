package cg.com.strings;

public class Countduplicatestring {


	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        String s="this this is a book";
	        int count=0; 
	        String[] word=s.split(" ");
	         for(int i=0;i<word.length-1;i++)        
	          {
	             for(int j=i+1;j<word.length-1;j++) 
	             {
	                
	             if(word[i].equals(word[j]))  
	             {
	                   count+=1;
	                  
	                }
	             }
	          }
	             if(count>=1) {
	             System.out.println("Number of duplicate values:"+count);
	             
	            }  
	             else
	             {
	                System.out.println("There is no duplicate values in this string"); 
	             }
	             
	       }

	 

	    }
	    
	

