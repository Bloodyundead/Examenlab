package com.tarea.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class Enemigo2Input extends InputListener{

	Enemigo2 enemigo;
	int score;
	Music musica;
	
	Enemigo2Input(Enemigo2 enemigo){
		super();
		this.enemigo = enemigo;
	}
	

	@Override
public boolean touchDown(InputEvent event, float x, float y, int pointer,
		int button) {

		musica = Gdx.audio.newMusic(Gdx.files.internal("Poderespecial.wav"));
		++score;
		if(score == 2){
		enemigo.remove();
	}
		musica.play();
	
	return super.touchDown(event, x, y, pointer, button);
}
}
