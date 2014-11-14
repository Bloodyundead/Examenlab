package com.tarea.game;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class MenuInput extends InputListener{

	Menu menu;
	
	MenuInput(Menu menu){
		super();
		this.menu = menu;
	}
	

	@Override
public boolean touchDown(InputEvent event, float x, float y, int pointer,
		int button) {

		menu.remove();
	return super.touchDown(event, x, y, pointer, button);
}



}
