package org.jacobarchambault.conferenceregistration;

import javafx.scene.control.CheckBox;

public class CheapWorkshop extends CheckBox implements PricedSelection {

	@Override
	public int include() {
		return this.isSelected() ? 295 : 0;
	}

}
