package org.jacobarchambault.conferenceregistration;

import javafx.scene.control.CheckBox;

public class ExpensiveWorkshop extends CheckBox implements PricedSelection{

	public int include() {
		return this.isSelected() ? 395 : 0;
	}
}
