package org.jacobarchambault.conferenceregistration;

import java.text.NumberFormat;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	public static void main(final String[] args) {
		Application.launch();
	}

	// Registration buttons
	RadioButton rb1 = new RadioButton("General registration, $895");
	RadioButton rb2 = new RadioButton("Student Registration, $495");
	Dinner dinnerCheckBox = new Dinner();
	CheapWorkshop introToECommerce = new CheapWorkshop();
	CheapWorkshop theFutureOfTheWeb = new CheapWorkshop();
	ExpensiveWorkshop advancedJavaProgramming = new ExpensiveWorkshop();
	ExpensiveWorkshop networkSecurity = new ExpensiveWorkshop();

	Label outputLabel = new Label("$0.00");

	Registration registration = new Registration(rb1, rb2);

	@Override
	public void start(final Stage stage) {
		stage
				.setScene(
						new Scene(
								new VBox(
										10,
										new VBox(10, new Label("Registration type: "), rb1, rb2),
										new HBox(10, dinnerCheckBox, new Label("Include opening night dinner, $30")),
										new Label("Select any of the following preconference workshops to attend: "),
										new HBox(10, introToECommerce, new Label("Introduction to E-Commerce, $295")),
										new HBox(10, theFutureOfTheWeb, new Label("The Future of the Web, $295")),
										new HBox(
												10,
												advancedJavaProgramming,
												new Label("Advanced Java Programming, $395")),
										new HBox(10, networkSecurity, new Label("Network Security, $395")),
										new Label("Total: "),
										outputLabel,
										new EventButton(
												"Calculate total",
												e -> outputLabel
														.setText(
																NumberFormat
																		.getCurrencyInstance()
																		.format(
																				registration.include()
																						+ dinnerCheckBox.include()
																						+ introToECommerce.include()
																						+ theFutureOfTheWeb.include()
																						+ advancedJavaProgramming
																								.include()
																						+ networkSecurity
																								.include()))))));
		stage.show();
	}

}