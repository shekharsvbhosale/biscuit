package sprints2130.java;

public class RSPEC1163 {

	@SuppressWarnings("finally")
	public static void main(String[] args) {
		try {
			  /* some work which end up throwing an exception */
			  throw new IllegalArgumentException();
			} finally {
			  /* clean up */
			  throw new RuntimeException();       // Noncompliant; masks the IllegalArgumentException
			}
}}