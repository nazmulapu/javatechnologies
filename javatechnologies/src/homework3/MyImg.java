package homework3;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MyImg {
	public static void main(String[] args)throws IOException {
		int width = 963;
		int height = 640;
		BufferedImage image = null;
		File f = null;
		
		// read the image 
		try{
	         f = new File("D:\\java\\heart.png");			
		     image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		     image = ImageIO.read(f);
		     System.out.println("Reading complete");
		}catch(IOException e){
			System.out.println("Error: "+e);
		}
		
		// write image 
		try{
			f = new File ("D:\\java");
			ImageIO.write(image, "jpg", f);
			System.out.println("Writing complete");
		}catch (IOException e){
			System.out.println("Error "+e);
		}
		     
	}// main() ends here

}//Class ends here

