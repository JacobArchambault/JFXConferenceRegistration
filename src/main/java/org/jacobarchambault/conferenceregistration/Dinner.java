package org.jacobarchambault.conferenceregistration;

import javafx.scene.control.CheckBox;

public class Dinner extends CheckBox {

	int include() {
		return this.isSelected() ? 30 : 0;
	}
}
