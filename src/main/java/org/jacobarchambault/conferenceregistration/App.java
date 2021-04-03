package org.jacobarchambault.conferenceregistration;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	public static void main(final String[] args) {
		Application.launch();
	}

	RadioButton rb1 = new RadioButton("General registration, $895");
	RadioButton rb2 = new RadioButton("Student Registration, $495");

	Registration registration = new Registration(rb1, rb2);

	@Override
	public void start(final Stage stage) {
		stage.setScene(new Scene(new VBox(new Label("Registration type: "), rb1, rb2, new Button("Calculate total"))));
		stage.show();
	}

}