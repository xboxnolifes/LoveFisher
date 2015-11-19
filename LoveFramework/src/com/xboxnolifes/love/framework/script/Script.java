package com.xboxnolifes.love.framework.script;

import org.dreambot.api.script.AbstractScript;

public abstract class Script extends AbstractScript{

	
	@Override
	public abstract void onStart();
	
	@Override
	public abstract void onExit();
	
	@Override
	public abstract int onLoop();

}
