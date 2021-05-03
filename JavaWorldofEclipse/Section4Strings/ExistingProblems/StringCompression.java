package ExistingProblems;
/*
Take as input S, a string. Write a function that does basic string compression. Print the value returned. E.g. for input “aaabbccds” print out a3b2c2ds.

Input Format
A single String S.

Constraints
A string of length between 1 to 1000

Output Format
The compressed String.

Sample Input

aaabbccds
Sample Output
a3b2c2dsit
Explanation
In the given sample test case 'a' is repeated 3 times consecutively, 'b' is repeated twice, 'c' is repeated twice. But, 'd' and 's' occurred only once that's why we do not write their occurrence.
 */
public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=compress("aaaaabbbbbcds");
		System.out.println(s);
	}

	
	public static String compress(String str){
	      int cnt = 0;
	      StringBuilder sb = new StringBuilder();
	      for(int i = 0;i < str.length() ;i++){
	          if(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)){
	              cnt++;
	          }else{
	              sb.append(str.charAt(i));
	              if(cnt  >= 1){
	                  sb.append(cnt+1);
	              }
	              cnt = 0;
	          }
	      }

	      return sb.toString();
	  }
}
