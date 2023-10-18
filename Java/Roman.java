import java.util.Scanner;
import java.util.HashMap;

public class Roman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Roman Number");
		String s=sc.next();
		System.out.println(romanToInteger(s));
	}
	public static int romanToInteger(String s) {
		HashMap<Character,Integer> map=new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C',100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int preVal=0,res=0,currInt=0;
		char currVal=0;
		for(int i=s.length()-1;i>=0;i--) {
			currVal=s.charAt(i);
			currInt=map.get(currVal);
			if(currInt<preVal) {
				res-=currInt;
			}
			else {
				res+=currInt;
			}
			preVal=currInt;
		}
		return res;
		
	}
}
