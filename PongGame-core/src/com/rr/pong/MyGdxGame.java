package com.rr.pong;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;


public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	private Texture PlayerTexture, ballTexture, brickTexture;
	private PlatformPlayer player;
	private BallPlayer player1;
//	private brickTexture brick,brick2;
	public boolean Hit = true;
	private Array<brickTexture> brick;
	public float timeHelper;
	
	

	@Override
	public void create() {
		loadData();
		init();
		
		

	}

	private void init() {
		batch = new SpriteBatch();
		player = new PlatformPlayer(PlayerTexture);
		player1 = new BallPlayer(ballTexture);
		
		brick= new Array<brickTexture>();
		for(int i =1; i<15;i++)
		{
			brickTexture p  = new brickTexture(brickTexture);
			p.x=20 + i *75;
			p.y=320;
			
			brick.add(p);
		}

	

	}

	private void loadData() {
		PlayerTexture = new Texture("platform.jpg");
		ballTexture = new Texture("bally.png");
		brickTexture = new Texture("birck.png");
		

	}

	@Override
	public void render() {
		update();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();

		player.draw(batch);
		
		for(brickTexture p : brick)
		{
			p.draw(batch);
		}
		

		

		player1.draw(batch);

		batch.end();
	}

	private void update() {
		hadnleinput();
		logic();

		for(brickTexture p : brick)
		{
			if(ballOnBrick(p)){
				player1.ballSpeedY=-5;
				p.remove();
			}
			
		}
	
	}

	private boolean ballOnBrick(com.rr.pong.brickTexture p) {
		if(player1.x>=p.x&&player1.x<=p.x+p.width){
			if(player1.y>=p.y&&player1.y<=p.y+p.height){
				return true;
			}
		}
		return false;
	}

	private void logic() {

		if (player.y + player.height >= player1.y
				&& player.x + player.width >= player1.x) {
			player1.ballSpeedY = 5;
		}

	}

	private void hadnleinput() {
		if (Gdx.input.isKeyPressed(Keys.A)) {
			player.x -= 500 * Gdx.graphics.getDeltaTime();

		}
		if (Gdx.input.isKeyPressed(Keys.D)) {
			player.x += 500 * Gdx.graphics.getDeltaTime();
		}

	}
}
