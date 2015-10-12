package com.rr.pong;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class PlatformPlayer extends Rectangle {
	private Texture texture;
    public float x;
    public float y=20;
	
	
	public PlatformPlayer(Texture texture) {
		this.texture=texture;
		this.height=texture.getHeight();
		this.width=texture.getWidth();
		
	}
	
	public Texture getTexture()
	{
		return texture;
	}
	public void draw(SpriteBatch batch)
	{
		batch.draw(texture,x,y);
		
		
	}
	


	
	
	

	

}
