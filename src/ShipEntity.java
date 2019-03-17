
public class ShipEntity extends Entity {

	public ShipEntity(Game game, String ref, int x, int y) {
		super(ref, x, y);
	}
	
	public void move(long delta) {
		if ((dx<0) && (x<10)){
			return;
		}
		
		if ((dx>0) && (x > 750)) {
			return;
		}
		super.move(delta);
	}

}
