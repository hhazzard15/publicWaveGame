package main;

import java.util.Random;

public class Spawner {

	private Handler handler;
	private HUD hud;
	private Random r = new Random();
	
	private int scoreKeep = 0;
	private int scoreKeepF = 0;
	private int startedYet = 0;
	public Spawner(Handler handler, HUD hud) {
		this.handler = handler;
		this.hud = hud;
	}
	
	public void tick() {
		scoreKeep++;
		setScoreKeepF(getScoreKeepF() + 1);
		
		System.out.println(scoreKeep);

		if(scoreKeep >= 500) {
			scoreKeep = 0;
			hud.setLevel(hud.getLevel() + 1);
			
			//handler.clearEnemies();
			//handler.addObject(new FastSmartEnemy(30, 300, ID.FastSmartEnemy, handler));
			//handler.addObject(new FastSmartEnemy(600, 30, ID.FastSmartEnemy, handler));
			
			
			if(hud.getLevel() == 2) {
				handler.clearEnemies();
				handler.addObject(new BasicEnemy(r.nextInt((Game.WIDTH-200)), r.nextInt((Game.HEIGHT-200)), ID.BasicEnemy, handler));
				handler.addObject(new BasicEnemy(r.nextInt((Game.WIDTH-200)), r.nextInt((Game.HEIGHT-200)), ID.BasicEnemy, handler));
				handler.addObject(new BasicEnemy(r.nextInt((Game.WIDTH-200)), r.nextInt((Game.HEIGHT-200)), ID.BasicEnemy, handler));
				System.out.println("level 2");
			}else if(hud.getLevel() == 3) {
				handler.clearEnemies();
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH-200), r.nextInt(Game.HEIGHT-200), ID.BasicEnemy, handler));
				handler.addObject(new BasicEnemy(r.nextInt((Game.WIDTH-200)), r.nextInt((Game.HEIGHT-200)), ID.BasicEnemy, handler));
				handler.addObject(new BasicEnemy(r.nextInt((Game.WIDTH-200)), r.nextInt((Game.HEIGHT-200)), ID.BasicEnemy, handler));
				handler.addObject(new BasicEnemy(r.nextInt((Game.WIDTH-200)), r.nextInt((Game.HEIGHT-200)), ID.BasicEnemy, handler));
				handler.addObject(new BasicEnemy(r.nextInt((Game.WIDTH-200)), r.nextInt((Game.HEIGHT-200)), ID.BasicEnemy, handler));
			}else if(hud.getLevel() == 4) {
				handler.clearEnemies();
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH-200), r.nextInt(Game.HEIGHT-200), ID.FastEnemy, handler));
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH-200), r.nextInt(Game.HEIGHT-200), ID.FastEnemy, handler));
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH-200), r.nextInt(Game.HEIGHT-200), ID.FastEnemy, handler));
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH-200), r.nextInt(Game.HEIGHT-200), ID.FastEnemy, handler));
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH-200), r.nextInt(Game.HEIGHT-200), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 5) {
				handler.clearEnemies();
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH-200), r.nextInt(Game.HEIGHT-200), ID.SmartEnemy, handler));
				
			}else if(hud.getLevel() == 6) {
				handler.clearEnemies();
				handler.addObject(new SmartEnemy( 50, 50, ID.SmartEnemy, handler));
				handler.addObject(new SmartEnemy( 400, 50, ID.SmartEnemy, handler));
				handler.addObject(new SmartEnemy( 250, 400, ID.SmartEnemy, handler));
			}else if(hud.getLevel() == 7) {
				handler.clearEnemies();
				handler.addObject(new FastSmartEnemy(30, 300, ID.FastSmartEnemy, handler));
				handler.addObject(new FastSmartEnemy(600, 30, ID.FastSmartEnemy, handler));
			}else if(hud.getLevel() == 8) {
				handler.clearEnemies();
				
			}else if(hud.getLevel() == 9) {
				handler.clearEnemies();
				
			}else if(hud.getLevel() == 10) {
				handler.clearEnemies();
				handler.addObject(new EnemyBoss((Game.WIDTH / 2) - 48, -120, ID.EnemyBoss, handler));
			}
		}
		
		//ADDING 3 FAST ENEMIES EVERY 500 TICKS
		/*if(scoreKeepF >= 500) {
			scoreKeepF = 0;
			hud.setLevel(hud.getLevel() + 1);
			
			handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH-20), r.nextInt(Game.HEIGHT-20), ID.FastEnemy, handler));
			handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH-20), r.nextInt(Game.HEIGHT-20), ID.FastEnemy, handler));
			handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH-20), r.nextInt(Game.HEIGHT-20), ID.FastEnemy, handler));
		}*/
	}

	public int getScoreKeepF() {
		return scoreKeepF;
	}

	public void setScoreKeepF(int scoreKeepF) {
		this.scoreKeepF = scoreKeepF;
	}

	public int getStartedYet() {
		return startedYet;
	}

	public void setStartedYet(int startedYet) {
		this.startedYet = startedYet;
	}
	
}
