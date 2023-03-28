package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Launcher extends Application {
	@Override
	public void start(Stage primaryStage) {
		StartScene scene1 = new StartScene();
		primaryStage.setScene(scene1);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
