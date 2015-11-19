import java.awt.Graphics;

import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.map.Area;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;

import com.xboxnolifes.love.framework.script.*;

@ScriptManifest(author = "xboxnolifes", category = Category.FISHING, name = "LoveFisher", version = 0.1, description = "My first fishing script")
public class LoveFisher extends Script{
	private State currentState;


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
		
		switch(currentState = State.getState(this)){
		case FISHING:
			Action.fish(this);
			break;
		case DROPPING:
			Action.dropInventory(this);
			break;
		case FINDSPOT:
			Action.findSpot(this);
		default:
			log(toString());
			break;
		}
		
		return Calculations.random(163, 1333);
	}

	@Override
	public void onPaint(Graphics gfx) {
		gfx.drawString(currentState.toString(), 0, 0);
	}

}
