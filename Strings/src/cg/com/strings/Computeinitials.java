package cg.com.strings;

public class Computeinitials {
	public static void main(String[] args) {
        String Name = "Vinothini Dhanasekar";
        StringBuffer Initials = new StringBuffer();
        int size = Name.length();

        for (int i = 0; i < size; i++) {
            if (Character.isUpperCase(Name.charAt(i))) {
                Initials.append(Name.charAt(i));
            }
        }
        System.out.println("Initials: " + Initials);
    }
}
