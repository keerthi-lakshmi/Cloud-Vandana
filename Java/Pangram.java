import java.util.HashSet;
import java.util.*;
public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		s=s.toLowerCase();
		boolean res=isPangram(s);
		if(res==true) {
			System.out.println("String is a pangram");
		}
		else {
			System.out.println("String is not a pangram");
		}

	}
	public static boolean isPangram(String s) {
		Set<Character> letters=new HashSet<>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if (Character.isLetter(c)) {
			letters.add(c);}
		}
		if(letters.size()!=26) {
			return false;
		}
		return true;
	}
}
