package com.tarea.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Enemigo1 extends Image{

	Enemigo1(Texture texture){
		super(texture);
		addListener(new Enemigo1Input(this));
	}
	public void act(float delta){
		super.act(delta);
		this.setX(this.getX()+5);
	}
}
