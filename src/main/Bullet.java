package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Bullet {

	private	double x;
	private	double y;
	private	int r;
	private Handler handler;
	private double dx;
	private double dy;
	private	double rad;
	private	double speed;
	
	private Color color1;
	
	public Bullet(double angle, float x2, float y2) {
		this.x = x2;
		this.y = y2;
		
		r = 2;
		
		rad = Math.toRadians(angle);
		dx = Math.cos(rad);
		dy = Math.sin(rad);
		speed = 15;
		
		color1 = Color.yellow;
	}
	


	public boolean tick() {
		x += dx;
		y += dy;
		
		if(x < -r || x > Game.WIDTH + r || 
			y < -r || y > Game.HEIGHT + r) {
			return true;
		}
		
		return false;
	}
	
	public void draw(Graphics g) {
		g.setColor(color1);
		g.fillOval((int) (x - r), (int) (y- r), 2 * r, 2 * r);
	}



	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.white);
		g.fillOval((int) (x - r), (int) (y- r), 2 * r, 2 * r);
	}
	
	
}
