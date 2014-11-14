package com.tarea.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Principal extends ApplicationAdapter {
	SpriteBatch batch;
	Texture gam;
	Texture men;
	Texture img;
	Texture img2;
	Texture img3;
	boolean conf = true;
	int cont = 1;
	Music musica;
	
	int x = 0;
	int y = 0;
	int z = 0;
	int frame;
	
	Image menu;
	Image game;
	Image image1;
	Image image2;
	Image image3;
	Stage stage;
	Stage stage2;
	Stage stage3;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		game = new Image();
		menu = new Image();
		image1 = new Image();
		image2 = new Image();
		image3 = new Image();
		
		
		stage = new Stage();
		stage2 = new Stage();
		stage3 = new Stage();
		Gdx.input.setInputProcessor(stage);
		
		musica = Gdx.audio.newMusic(Gdx.files.internal("01 A Night Of Dizzy Spells.mp3"));
		stage3.addActor(game);
		stage2.addActor(menu);
		stage.addActor(image1);
		stage.addActor(image2);
		stage.addActor(image3);
		men = new Texture("menu.png");
		gam = new Texture("Gameover.png");
		img = new Texture("pelota1.png");
		img2 = new Texture("pelota2.png");
		img3 = new Texture("pelota3.png");
		Texture texture_image2 = new Texture("menu.png");
		Menu menu1 = new Menu(texture_image2);
		stage2.addActor(menu1);
		
		
		Texture texture_image5 = new Texture("Gameover.png");
		Menu menu5 = new Menu(texture_image5);
		stage3.addActor(menu5);
		
	}

	private void AgregarElemento() {
		Texture texture_image1 = new Texture("pelota1.png");
		Texture texture_image3 = new Texture("pelota2.png");
		Texture texture_image4 = new Texture("pelota3.png");
		
		Enemigo ene1 = new Enemigo(texture_image1);
		Enemigo1 ene3 = new Enemigo1(texture_image3);
		Enemigo2 ene4 = new Enemigo2(texture_image4);
		
		stage.addActor(ene1);
		stage.addActor(ene3);
		stage.addActor(ene4);
		
		
		ene1.setY((int)(Math.random()*150)%150);		
		ene3.setY((int)(Math.random()*250)%250);
		ene4.setY((int)(Math.random()*350)%350);
		
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		musica.play();
		
	
		if(Gdx.input.justTouched()){
			
			if(cont == 1){
			stage2.clear();
			conf = false;
			}
			
			cont++;
			
			System.out.print(cont);	
			
		}
		
		
		stage.draw();
		stage.act();
		
		if(frame%200 == 0)
			AgregarElemento();
				frame++;
				
		if(conf = true){
			stage2.draw();
			stage2.act();
			}
	
		
		
	
	if(cont == 30){
		stage.clear();

		stage3.draw();
		stage3.act();
	
		}
	if(cont == 31){
		conf = true;
		cont = 1;
		stage3.clear();
		stage2.draw();
		stage2.act();	
	}
	
	
		
		
	}
}
