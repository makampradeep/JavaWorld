package ExistingProblems;

public class canyoureadthis {

	public static void main(String[] args) {
		str();

	}
	public static void str()
	{
		String str= "IAmACompetitiveProgrammer";
		String[] camelCaseWords = str.split("(?=[A-Z])");
		
		for(String S:camelCaseWords)
		{
			System.out.println(S);
		}
	}
	
}
