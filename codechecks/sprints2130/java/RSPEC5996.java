package sprints2130.java;

import java.util.regex.Pattern;

public class RSPEC5996 {

	public static void main(String[] args) {
		// This can never match because $ and ^ have been switched around
		Pattern.compile("$[a-z]+^"); // Noncompliant
	}

}
