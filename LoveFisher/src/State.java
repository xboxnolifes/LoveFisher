import com.xboxnolifes.love.framework.script.Script;



public enum State {
	FISHING ("Fishing"),
	FINDSPOT ("Finding fishing spot"),
	DROPPING ("Dropping"),
	ERROR ("[ERROR]: No State found");
	
	private String message;
	
	State(String message){
		this.message = message;
	}
	
	public String toString(){
		return message;
	}

	public static State getState(Script script){
		if(needToFish(script)){
			return FISHING;
		}else if(needToDrop(script)){
			return DROPPING;
		}else if(needToFindSpot(script)){
			return FINDSPOT;
		}else{
			return ERROR;
		}
	}
	
	private static boolean needToFish(Script script){
		if(script.getInventory().isFull()){
			return false;
		}
		
		if(!(script.getLocalPlayer().getAnimation() == 621)){
			return false;
		}
		
		return true;
	}
	
	private static boolean needToDrop(Script script){
		if(script.getInventory().isFull()){
			return true;
		}else{
			return false;
		}
	}
	
	private static boolean needToFindSpot(Script script){
		if(!Location.fishingSpot.contains(script.getLocalPlayer())){
			return false;
		}
		
		if((script.getInventory().isFull())){
			return false;
		}
		
		if(script.getLocalPlayer().getAnimation() == 621){
			return false;
		}
		
		return true;
	}

}