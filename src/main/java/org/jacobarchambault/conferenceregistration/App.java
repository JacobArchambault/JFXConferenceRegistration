package org.jacobarchambault.conferenceregistration;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	final ToggleGroup group = new ToggleGroup();
	RadioButton rb1 = new RadioButton("General registration, $895");
	RadioButton rb2 = new RadioButton("Student Registration, $495");

	void groupButtons() {
		rb1.setToggleGroup(group);
		rb2.setToggleGroup(group);
		rb1.setSelected(true);
	}

	@Override
	public void start(Stage stage) {
		groupButtons();
		stage.setScene(new Scene(new HBox(new Label("Registration type: "), rb1, rb2)));
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}