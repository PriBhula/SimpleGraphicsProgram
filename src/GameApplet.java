import javax.swing.JApplet;

import java.awt.BorderLayout;
import java.awt.Container;



public class GameApplet extends JApplet {

	private static final long serialVersionUID = 1L;
	private GamePanel gamepanel;
	
	public void init() {
		Container pane = getContentPane();
		pane.setLayout(new BorderLayout());
		gamepanel = new GamePanel();
		pane.add(gamepanel);
		this.setSize(GamePanel.WIDTH,GamePanel.HEIGHT);
	}

}