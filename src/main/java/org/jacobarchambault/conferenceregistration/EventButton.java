package org.jacobarchambault.conferenceregistration;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;

public class EventButton extends Button {

	EventButton(final String text, final EventHandler<ActionEvent> value) {
		super(text);
		setOnAction(value);
	}
}