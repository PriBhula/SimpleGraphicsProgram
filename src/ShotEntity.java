
public class ShotEntity extends Entity {
	
	private Game game;

	public ShotEntity(String ref, int x, int y) {
		super(ref, x, y);
		// TODO Auto-generated constructor stub
	}
	
	public void move(long delta) {
		super.move(delta);
		if(y<-100) {
			game.removeEntity(this);
		}
	}

}
