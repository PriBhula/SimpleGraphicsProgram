import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;

public class GamePanel extends JPanel {
	
	public static final int WIDTH = 640;
	public static final int HEIGHT = 480;

	private static final long serialVersionUID = 1L;
	
	public GamePanel() {
		super();
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setFocusable(true);
		requestFocus();
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString("hello world", 300, 270);
	}

}
