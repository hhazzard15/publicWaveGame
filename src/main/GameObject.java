package main;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class GameObject {
	private boolean firing;
	protected float x, y; //protected means that these can only be accessed 
	protected ID id;    //by the object that inherits the game object
	protected float velX, velY, bVelX, bVelY;
	
	public GameObject(float x, float y, ID id) {
		this.x = x;
		this.y = y;
		this.id = id;
		firing = false;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	public abstract Rectangle getBounds();
	
	public void setX(float x) {
		this.x = x;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public void setID(ID id) {
		this.id = id;
	}
	
	public ID getID() {
		return id;
	}
	
	public void setVelX(float velX) {
		this.velX = velX;
	}
	
	public void setVelY(float velY) {
		this.velY = velY;
	}
	
	public float getVelX() {
		return velX;
	}
	
	public float getVelY() {
		return velY;
	}

	public float getBVelX() {
		return bVelX;
	}
	
	public float getBVelY() {
		return bVelY;
	}
	
	public void setBVelX(float bVelX) {
		this.getBVelX();
	}
	
	public void setBVelY(float bVelY) {
		this.getBVelY();
	}

	public void shoot(int direction, float x, float y) {
		// TODO Auto-generated method stub
		
	}

	public void shoot() {
		// TODO Auto-generated method stub
		
	}
	
	public void setFiring(boolean b) {
		firing = b;
	}
	
}
