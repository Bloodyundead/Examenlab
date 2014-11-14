package com.tarea.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class Enemigo1Input extends InputListener{

	Enemigo1 enemigo;
	int score;
	Music musica;
	
	Enemigo1Input(Enemigo1 enemigo){
		super();
		this.enemigo = enemigo;
	}
	

	@Override
public boolean touchDown(InputEvent event, float x, float y, int pointer,
		int button) {

		musica = Gdx.audio.newMusic(Gdx.files.internal("Poderespecial.wav"));
		enemigo.remove();
		musica.play();
		++score;
		System.out.print(score);
	return super.touchDown(event, x, y, pointer, button);
}
}