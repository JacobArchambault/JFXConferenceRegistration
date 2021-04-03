package org.jacobarchambault.conferenceregistration;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	@Override
	public void start(Stage stage) {

		stage.setScene(new Scene(new HBox(new Label("Registration type: "))));
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}