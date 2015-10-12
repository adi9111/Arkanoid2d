package com.rr.pong;

import java.util.Random;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class brickTexture extends Rectangle {
	
	private Texture texture; 
	

      public  int x;
	  public int y;

	
	
	
	public brickTexture(Texture texture)
	{
		this.texture=texture; 
		this.height=texture.getHeight();
		this.width=texture.getWidth();
		
		
		
	}
	public void draw(SpriteBatch batch)
	{
		batch.draw(texture, x, y );
	}
	public void remove() {
		x=-190;
		y=-250;
		
	}
	
	

}
