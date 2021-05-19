package sprints2130.java;

public class RSPEC2178 {
	
	public static boolean getTrue()
	{
		return true;
	}
	
	public static boolean getFalse() {
		return false;
	}

	public static void main(String[] args) {
		System.out.println("https://rules.sonarsource.com/java/RSPEC-2178");
		
		if(getTrue() | getFalse()) { } // Noncompliant; both sides evaluated
		
		if(getTrue() || getFalse()) { } // true short-circuit logic

	}

}
