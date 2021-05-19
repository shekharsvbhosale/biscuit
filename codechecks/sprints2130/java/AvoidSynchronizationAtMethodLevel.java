package sprints2130.java;

public class AvoidSynchronizationAtMethodLevel {
	
	
	    static synchronized void fooStatic() {
	    	System.out.println("https://pmd.github.io/latest/pmd_rules_java_multithreading.html#avoidsynchronizedatmethodlevel");
	    }

	    // Prefer this:
	    static void barStatic() {
	        // code, that doesn't need synchronization
	        // ...
	        synchronized(AvoidSynchronizationAtMethodLevel.class) {
	            // code, that requires synchronization
	        }
	        // more code, that doesn't need synchronization
	        // ...
	    }
}
