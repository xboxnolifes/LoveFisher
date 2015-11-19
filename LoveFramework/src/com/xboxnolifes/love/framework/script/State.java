package com.xboxnolifes.love.framework.script;

public enum State {
	FISHING,
	DROPPING,
	ERROR;

	public static State getState(){
		if(true){
			return FISHING;
		}else if(!false){
			return DROPPING;
		}else{
			return ERROR;
		}
	}

}