// opening twitter with firefox

package homework14;
import java.awt.AWTException;import java.awt.Robot;import java.awt.event.KeyEvent;import java.io.IOException;
public class Automation {
	
		public static void main(String[] args) throws IOException {
			try {Robot robot = new Robot();Runtime runtime = Runtime.getRuntime();
			runtime.exec("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"); // location of firefox
			robot.delay(1000);robot.keyPress(KeyEvent.VK_F6);
			robot.keyPress(KeyEvent.VK_DELETE);robot.keyPress(KeyEvent.VK_T);
			robot.keyPress(KeyEvent.VK_W);robot.keyPress(KeyEvent.VK_I);
			robot.keyPress(KeyEvent.VK_T);robot.delay(70);
			robot.keyPress(KeyEvent.VK_T);robot.keyPress(KeyEvent.VK_E);
			robot.keyPress(KeyEvent.VK_R);robot.keyPress(KeyEvent.VK_DECIMAL);
			robot.keyPress(KeyEvent.VK_C);robot.keyPress(KeyEvent.VK_O);
			robot.keyPress(KeyEvent.VK_M);robot.keyPress(KeyEvent.VK_ENTER);robot.delay(200);} 
			
			catch (AWTException e) {e.printStackTrace();}}
		
}

