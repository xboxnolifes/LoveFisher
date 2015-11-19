package com.xboxnolifes.love.framework.script;

import java.awt.Graphics;

import org.dreambot.api.script.AbstractScript;

public abstract class Script extends AbstractScript{

	
	@Override
	public abstract void onStart();
	
	@Override
	public abstract void onExit();
	
	@Override
	public abstract int onLoop();

	public abstract void onPaint(Graphics graphics);
	
}
