package application;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class StartScene extends Scene{
	public StartScene(Pane root, double width, double height) {
        super(root, width, height);
    }
	
	public StartScene() {
		this(new AnchorPane(), 400, 700);
    }
}
