import org.dreambot.api.methods.Calculations;

import com.xboxnolifes.love.framework.script.*;


public class LoveFisher extends Script{


	@Override
	public void onStart() {
		log("[INFO]: LoveFisher has started.");
		log("[INFO]: If you notice any bug, please report them on the forums");
		log("[INFO]: http://dreambot.org/forums/");
	}

	@Override
	public void onExit() {
		log("[INFO]: LoveFisher is stopping");
		log("[INFO]: Hope you use my scripts again XD - xboxnolifes");
	}
	
	@Override
	public int onLoop() {
		
		switch(State.getState()){
		case FISHING:
			Action.fish();
			break;
		case DROPPING:
			Action.dropInventory();
			break;
		default:
			break;
		}
		
		return Calculations.random(163, 1333);
	}

}
