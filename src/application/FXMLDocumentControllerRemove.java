package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.ChoiceBox;

public class FXMLDocumentControllerRemove implements Initializable {

	@FXML
	private ChoiceBox<String> Choice_Box;

	private Data LobyData;

	@FXML
	public void Button_Remove(ActionEvent event) {

		if (this.Choice_Box.getSelectionModel() != null) {

			int SlotSelect;

			if (this.Choice_Box.getSelectionModel().getSelectedItem() == "Slot 1") {
				SlotSelect = 1;
			} else if (this.Choice_Box.getSelectionModel().getSelectedItem() == "Slot 2") {
				SlotSelect = 2;
			} else if (this.Choice_Box.getSelectionModel().getSelectedItem() == "Slot 3") {
				SlotSelect = 3;
			} else if (this.Choice_Box.getSelectionModel().getSelectedItem() == "Slot 4") {
				SlotSelect = 4;
			} else if (this.Choice_Box.getSelectionModel().getSelectedItem() == "Slot 5") {
				SlotSelect = 5;
			} else if (this.Choice_Box.getSelectionModel().getSelectedItem() == "Slot 6") {
				SlotSelect = 6;
			} else if (this.Choice_Box.getSelectionModel().getSelectedItem() == "Slot 7") {
				SlotSelect = 7;
			} else if (this.Choice_Box.getSelectionModel().getSelectedItem() == "Slot 8") {
				SlotSelect = 8;
			} else if (this.Choice_Box.getSelectionModel().getSelectedItem() == "Slot 9") {
				SlotSelect = 9;
			} else if (this.Choice_Box.getSelectionModel().getSelectedItem() == "Slot 10") {
				SlotSelect = 10;
			} else {
				SlotSelect = 0;
			}

			New_Object obj = new New_Object(SlotSelect);
			addObject(obj);

		}
	}

	public void addObject(New_Object o) {

		if (o.getSlot() == 1) {
			this.LobyData.setURLLabel1(o.getUrl());
			this.LobyData.setClassLabel1(o.getClasse());
			this.LobyData.setTextField1(o.getLabel());
			this.LobyData.setTextField11(o.getLabelbis());
			this.LobyData.setChecker1(0);
		} else if (o.getSlot() == 2) {
			this.LobyData.setURLLabel2(o.getUrl());
			this.LobyData.setClassLabel2(o.getClasse());
			this.LobyData.setTextField2(o.getLabel());
			this.LobyData.setTextField12(o.getLabelbis());
			this.LobyData.setChecker2(0);
		} else if (o.getSlot() == 3) {
			this.LobyData.setURLLabel3(o.getUrl());
			this.LobyData.setClassLabel3(o.getClasse());
			this.LobyData.setTextField3(o.getLabel());
			this.LobyData.setTextField13(o.getLabelbis());
			this.LobyData.setChecker3(0);
		} else if (o.getSlot() == 4) {
			this.LobyData.setURLLabel4(o.getUrl());
			this.LobyData.setClassLabel4(o.getClasse());
			this.LobyData.setTextField4(o.getLabel());
			this.LobyData.setTextField14(o.getLabelbis());
			this.LobyData.setChecker4(0);
		} else if (o.getSlot() == 5) {
			this.LobyData.setURLLabel5(o.getUrl());
			this.LobyData.setClassLabel5(o.getClasse());
			this.LobyData.setTextField5(o.getLabel());
			this.LobyData.setTextField15(o.getLabelbis());
			this.LobyData.setChecker5(0);
		} else if (o.getSlot() == 6) {
			this.LobyData.setURLLabel6(o.getUrl());
			this.LobyData.setClassLabel6(o.getClasse());
			this.LobyData.setTextField6(o.getLabel());
			this.LobyData.setTextField16(o.getLabelbis());
			this.LobyData.setChecker6(0);
		} else if (o.getSlot() == 7) {
			this.LobyData.setURLLabel7(o.getUrl());
			this.LobyData.setClassLabel7(o.getClasse());
			this.LobyData.setTextField7(o.getLabel());
			this.LobyData.setTextField17(o.getLabelbis());
			this.LobyData.setChecker7(0);
		} else if (o.getSlot() == 8) {
			this.LobyData.setURLLabel8(o.getUrl());
			this.LobyData.setClassLabel8(o.getClasse());
			this.LobyData.setTextField8(o.getLabel());
			this.LobyData.setTextField18(o.getLabelbis());
			this.LobyData.setChecker8(0);
		} else if (o.getSlot() == 9) {
			this.LobyData.setURLLabel9(o.getUrl());
			this.LobyData.setClassLabel9(o.getClasse());
			this.LobyData.setTextField9(o.getLabel());
			this.LobyData.setTextField19(o.getLabelbis());
			this.LobyData.setChecker9(0);
		} else if (o.getSlot() == 10) {
			this.LobyData.setURLLabel10(o.getUrl());
			this.LobyData.setClassLabel10(o.getClasse());
			this.LobyData.setTextField10(o.getLabel());
			this.LobyData.setTextField20(o.getLabelbis());
			this.LobyData.setChecker10(0);
		}

		Save.sauvegarder(this.LobyData);

	}

	public void initChoiceBox() {
		Choice_Box.getItems().add("Slot 1");
		Choice_Box.getItems().add("Slot 2");
		Choice_Box.getItems().add("Slot 3");
		Choice_Box.getItems().add("Slot 4");
		Choice_Box.getItems().add("Slot 5");

		Choice_Box.getItems().add("Slot 6");
		Choice_Box.getItems().add("Slot 7");
		Choice_Box.getItems().add("Slot 8");
		Choice_Box.getItems().add("Slot 9");
		Choice_Box.getItems().add("Slot 10");

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.LobyData = Save.charger();
		initChoiceBox();
	}

}
