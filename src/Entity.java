import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public abstract class Entity {
	protected double x;
	protected double y;
	
	protected Sprite sprite;
	
	protected double dx;
	protected double dy;
	
	private Rectangle player;
	private Rectangle opp;
	
	public Entity (String ref,  int x, int y) {
		
	}

	public void move(long delta) {
		x += (delta*dx)/1000;
		y += (delta*dy)/1000;
	}

	public void draw(Graphics gr) {
		sprite.drawSprite(gr,(int)x,(int)y);	
	}

}
