package com.tarea.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Enemigo2 extends Image{

	Enemigo2(Texture texture){
		super(texture);
		addListener(new Enemigo2Input(this));
	}
	public void act(float delta){
		super.act(delta);
		this.setX(this.getX()+3);
	}
}
