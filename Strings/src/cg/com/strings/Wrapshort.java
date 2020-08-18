package cg.com.strings;

public class Wrapshort {
	public static void main(String[] agrs) {
		short s =123;
		Short obj=Short.valueOf(s);
		//Short obj1=Short.valueOf(44);
		short result =obj.shortValue();
		System.out.println( s+ " "  );
		//System.out.println( result + " " );
		}
}
