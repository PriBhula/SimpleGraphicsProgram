
public class AlienEntity extends Entity {

	private Game game;
	
	public AlienEntity(Game game, String ref, int x, int y) {
		super(ref, x, y);
		// TODO Auto-generated constructor stub
	}
	
	public void move(long delta) {
		if ((dx<0) && (x<10)){
			game.updateGame();
		}
		
		if ((dx>0) && (x > 750)) {
			game.updateGame();
		}
		super.move(delta);
	}

}
