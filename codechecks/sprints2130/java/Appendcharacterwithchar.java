package sprints2130.java;

public class Appendcharacterwithchar {

	public static void main(String[] args) {
		System.out.println("https://pmd.github.io/latest/pmd_rules_java_performance.html#appendcharacterwithchar");
		StringBuffer sb = new StringBuffer();
		sb.append("a");     // avoid this

		StringBuffer sb2 = new StringBuffer();
		sb2.append('a');     // use this instead
	}

}
