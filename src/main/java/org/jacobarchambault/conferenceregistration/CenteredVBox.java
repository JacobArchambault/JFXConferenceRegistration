package org.jacobarchambault.conferenceregistration;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.VBox;

public class CenteredVBox extends VBox {

	CenteredVBox(int spacing, Insets insets, Node... nodes){
		super(spacing, nodes);
		setPadding(insets);
		this.setAlignment(Pos.CENTER);
	}
}
