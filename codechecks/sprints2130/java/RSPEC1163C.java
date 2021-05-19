package sprints2130.java;

public class RSPEC1163C {

	public static void main(String[] args) {
		System.out.println("https://rules.sonarsource.com/java/tag/error-handling/RSPEC-1163");
		try {
			  /* some work which end up throwing an exception */
			  throw new IllegalArgumentException();
			} finally {
			  /* clean up */
			}

	}

}
