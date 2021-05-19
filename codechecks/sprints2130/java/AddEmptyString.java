package sprints2130.java;

public class AddEmptyString {

	public static void main(String[] args) {
		System.out.println("https://pmd.github.io/latest/pmd_rules_java_performance.html#addemptystring");
		String s = "" + 123;                // inefficient
		String t = Integer.toString(456);   // preferred approach

	}

}
