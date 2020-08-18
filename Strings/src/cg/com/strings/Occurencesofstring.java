package cg.com.strings;

public class Occurencesofstring {
public static void main(String args[]) {
	int count=0;
	//String[] s1=new String[1];
	String s="taste";
	for(int i=0;i<s.length();i++) {
		for(int j=i+1;j<s.length();j++) {
			//if() {
				count+=1;
			}
		}
	
		if(count>=1) {
            System.out.println("Number of occurences of each character:"+count);
	}
}
}
