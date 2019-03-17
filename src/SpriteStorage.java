import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class SpriteStorage {
	
	private static SpriteStorage s = new SpriteStorage();
	private HashMap sprites = new HashMap();
	
	public static SpriteStorage get() {
		return s;
	} 
	
	public Sprite getSprite(String loc) {
		
		if(sprites.get(loc) != null) {
			return (Sprite) sprites.get(loc);
		}
		
		BufferedImage source = null;
		
		try {
			URL url = this.getClass().getClassLoader().getResource(loc);
			if(url==null) {
				fail("insufficient url " + loc);
			}
			source = ImageIO.read(url);
		} catch (IOException e) {
			fail("Failed to load " + loc);
		}
		
		GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
		Image image = gc.createCompatibleImage(source.getWidth(), source.getHeight());
		
		image.getGraphics().drawImage(source, 0, 0, null);
		
		Sprite sprite = new Sprite (image);
		return sprite;
	}

	private void fail(String string) {
		System.err.println(string);
		System.exit(0);
	}

}
