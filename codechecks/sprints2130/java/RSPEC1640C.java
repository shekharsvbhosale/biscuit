package sprints2130.java;

import java.util.EnumMap;

public class RSPEC1640C {

	public enum COLOR {
	    RED, GREEN, BLUE, ORANGE;
	  }

	  public void mapMood() {
		System.out.println("Maps with keys that are enum values should be replaced with EnumMap");
	    @SuppressWarnings("unused")
		EnumMap<COLOR, String> moodMap = new EnumMap<COLOR, String> (COLOR.class);
	  }

}
