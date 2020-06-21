package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
//import java.awt.Graphics2D;
import java.awt.Rectangle;

public class StillEnemy extends GameObject{

	private Handler handler;
	
	public StillEnemy(float x, float y, ID id, Handler handler) {
		super(x, y, id);
		
		this.handler = handler;
		
		
	}
		
	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 200, 200);
	}
	
	public void tick() {

		
	
		
		
	}
	
	public void render(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		
		g.setColor(Color.red);
		g2d.draw(getBounds());
		
		g.setColor(Color.red);
		g.fillRect((int)x, (int)y, 16, 16);
	}

}
