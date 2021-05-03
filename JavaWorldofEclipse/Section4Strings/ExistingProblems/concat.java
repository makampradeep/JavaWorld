package ExistingProblems;

public class concat {

	public static void main(String[] args) {
		
		
		concating();

	}

	public static void concating()
			{
	String s1="hi";
	String s2="bye";
	
	String s3=s1+s2;
	String s4=s1.concat(s2);
	System.out.println(s3);
	System.out.println(s4);
	//+ concat does same
	
	//index of
	System.out.println(s2.indexOf("ye"));
	System.out.println(s2.indexOf("h"));
			}



	
	
	

}
