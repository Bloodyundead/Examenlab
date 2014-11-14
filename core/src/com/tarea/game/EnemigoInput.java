package com.tarea.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class EnemigoInput extends InputListener{

	Enemigo enemigo;
	int score;
	Music musica;
	
	EnemigoInput(Enemigo enemigo){
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