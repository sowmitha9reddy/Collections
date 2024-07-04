package Comperator;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class longestSubarrayWithoutRepeatingCharacters {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 Scanner scan=new Scanner(System.in);
                 String s=scan.nextLine();
                 System.out.println(longestSubarray( s));
	}
	static String longestSubarray(String s) {
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		int left=0;
		int maxLength=0;
		String t="";
		String k="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			while(set.contains(c)) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(c); 
			int length=i-left+1;
			maxLength=Math.max(maxLength, length);
		}
		 for(char l:set) {
			 t+=l;
		 }
		 return t;
	}

}
