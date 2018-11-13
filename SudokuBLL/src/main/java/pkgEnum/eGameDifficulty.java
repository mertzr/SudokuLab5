package pkgEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public enum eGameDifficulty {
	
	EASY(100), MEDIUM(500), HARD(1000);
	
	private final int iDifficulty;
	
	private Map<Integer, eGameDifficulty> difficulty = new HashMap<Integer, eGameDifficulty>();
	
	private eGameDifficulty(Integer level) {
		this.iDifficulty = level;
	}
	
		public int getDifficulty() {
		return this.iDifficulty;
	}
	
	public static eGameDifficulty get(int difficulty) {
		for (eGameDifficulty c: eGameDifficulty.values()) {	
			difficulty.put(c.getDifficulty(), c);
		}
	}	
	
	@Override
	static eGameDifficulty valueOf(String name) throws NullPointerException, IllegalArgumentException{
		if(name == null) {
			throw new NullPointerException();
		}
		else if (name == "EASY") {
			return EASY;
		}
		else if (name == "MEDIUM") {
			return MEDIUM;
		}
		else if (name == "HARD") {
			return HARD;
		}
		else {
			throw new IllegalArgumentException();
		}
			
	}
	
	@Override
	public static eGameDifficulty[] values() {
		ArrayList<eGameDifficulty> possibleValues = new ArrayList<eGameDifficulty>();
		for (eGameDifficulty c : eGameDifficulty.values()) {
			possibleValues.add(c);
		}
		return possibleValues;
	}
}
