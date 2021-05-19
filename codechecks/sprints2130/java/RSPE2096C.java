package sprints2130.java;

public class RSPE2096C {

	public static void main(String args[]) {
		 try {
			 System.out.println("main should not throw anything");
		  } catch (Throwable t) {		  
		    System.exit(1);  // Default exit code, 0, indicates success. Non-zero value means failure.
		  }
		}

}
