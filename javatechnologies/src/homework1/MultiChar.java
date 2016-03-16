package homework1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

import javax.swing.JFrame;

public class MultiChar {
	public static void main(String[] args) {
		
		final BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_BYTE_BINARY);
		Graphics graphics = image.getGraphics();
		graphics.setColor(Color.white);
		graphics.fillRect(0, 0, 100, 100);
		graphics.setColor(Color.black);
		graphics.drawString("hello", 0, 50);
		
		JFrame window = new JFrame() {
			@Override
			public void paint(Graphics g){
				super.paint(g);
				g.drawImage(image, 0, 0, null);
			}
			
		};
		
		window.setSize(100, 100);
		window.setVisible(true);
		
		for (int x = 0; x < image.getWidth(); x++) {
			int rgb = image.getRGB(0, 0);
			
		}
		
		
	}

}
