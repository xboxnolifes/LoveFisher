

public enum State {
	FISHING ("Fishing"),
	SWITCHSPOT ("Switching fishing spot"),
	DROPPING ("Dropping"),
	ERROR ("[ERROR]: No State found");
	
	private String message;
	
	State(String message){
		this.message = message;
	}
	
	public String toString(){
		return message;
	}

	public static State getState(){
		if(needToFish()){
			return FISHING;
		}else if(needToDrop()){
			return DROPPING;
		}else{
			return ERROR;
		}
	}
	
	private static boolean needToFish(){
		return true;
	}
	
	private static boolean needToDrop(){
		return true;
	}

}