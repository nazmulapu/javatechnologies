package homework12;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class lambda extends Application {
	
	public static void main(String[] args) {
		launch(args);
		
	}

	@Override
	public void start(Stage stage) throws Exception {
		Button button = new Button("Trigger ActionEvent...");
		button.setOnAction(new DemoEventHandler());
		stage.setScene(new Scene(button));
		stage.show();
	 }
		
	}
	
	class DemoEventHandler implements EventHandler <ActionEvent> {

		@Override
		public void handle(ActionEvent e) {
			System.out.println(e.toString());
			
		}
		
	}

	

