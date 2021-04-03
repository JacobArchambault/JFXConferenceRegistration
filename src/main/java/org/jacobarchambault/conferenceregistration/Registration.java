package org.jacobarchambault.conferenceregistration;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Registration {

	RadioButton general;
	RadioButton student;

	Registration(final RadioButton option1, final RadioButton option2) {
		general = option1;
		student = option2;
		final var group = new ToggleGroup();
		general.setToggleGroup(group);
		student.setToggleGroup(group);
		general.setSelected(true);
	}

	int cost() {
		return general.isSelected() ? 895 : 495;
	}
}
