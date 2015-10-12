package com.rr.pong;

import java.awt.event.ActionListener;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class BallPlayer extends Rectangle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Texture texture;
	PlatformPlayer start;
	public float timeHelper;
	public int x =0;
	public int y =0;
	public int ballSpeedX = 0;
	public int ballSpeedY = 0;

	public BallPlayer(Texture texture) {
		this.texture = texture;
		this.height = texture.getHeight();
		this.width = texture.getWidth();

	}

	public Texture getTexture() {
		return texture;

	}

	public void draw(SpriteBatch batch) {
		
		
		timeHelper += Gdx.graphics.getDeltaTime();
		if (timeHelper > 1) {
			batch.draw(texture, x, y);
			x += ballSpeedX;
			y += ballSpeedY;
		

			if (y >= 600) {
				ballSpeedY = -5;
			}else if(y<=0)
			{
				
			}
			if (x >= 1200) {
				ballSpeedX = -5;
			} else if (x <= 0) {
				ballSpeedX = 5;
			}

		}
		

	}

}
