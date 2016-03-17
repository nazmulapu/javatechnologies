package homework3;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.ImageIO;

public class ImagetoAscii {
	
	private BufferedImage img;
	private double pixval;
	private PrintWriter prntwrt;
	private FileWriter filewrt;
	
	
	public ImagetoAscii(){
		try {
			prntwrt = new PrintWriter(filewrt = new Filewriter("asciiart.txt", 
					true));
		}catch (IOException ex){
		}
	}
	
	public void convertToAscii(String imgname){
		try {
			img = ImageIO.read(new File(imgname));
		} catch (IOException e) {
	}
	
		for (int i = 0; i < img.getHeight(); i++){
			for (int j = 0; j < img.getWidth(); j++){
				Color pixcol = new Color(img.getRGB(j, i));
				pixval = (((pixcol.getRed() * 0.30) + (pixcol.getBlue()* 0.59) + (pixcol
						.getGreen() *0.11)));
				print(strChar(pixval));
				
			}
			try {
				prntwrt.println("");
				prntwrt.flush();
				filewrt.flush();
			}catch (Exception ex) {
		}

}

	private void print(Object strChar) {
		// TODO Auto-generated method stub
		
	}

	private Object strChar(double pixval2) {
		// TODO Auto-generated method stub
		return null;
	}
