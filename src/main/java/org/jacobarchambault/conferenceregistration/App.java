package org.jacobarchambault.conferenceregistration;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	@Override
	public void start(Stage stage) {

		stage
				.setScene(
						new Scene(
								new StackPane(
										new Label(
												"Hello, JavaFX " + SystemInfo.javafxVersion() + ", running on Java "
														+ SystemInfo.javaVersion() + ".")),
								640,
								480));
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}