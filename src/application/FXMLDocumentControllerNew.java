package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class FXMLDocumentControllerNew implements Initializable {

	private Data LobyData;

	@FXML
	private ChoiceBox<String> Choice_Box;

	@FXML
	private TextField TextField_Url;

	@FXML
	private TextField TextField_Class;

	@FXML
	private TextField TextField_Label;

	@FXML
	private TextField TextField_Label_bis;

	@FXML
	private Button Button_Add_New;

	@FXML
	public void Button_Add(ActionEvent event) {

		if (this.TextField_Class != null && this.TextField_Url != null && this.Choice_Box.getSelectionModel() != null) {

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

			New_Object obj = new New_Object(this.TextField_Label.getText(), this.TextField_Label_bis.getText(),
					this.TextField_Url.getText(), this.TextField_Class.getText(), SlotSelect);
			addObject(obj);

		}

	}

	public void addObject(New_Object o) {

		if (o.getSlot() == 1) {
			this.LobyData.setURLLabel1(o.getUrl());
			this.LobyData.setClassLabel1(o.getClasse());
			this.LobyData.setTextField1(o.getLabel());
			this.LobyData.setTextField11(o.getLabelbis());
		} else if (o.getSlot() == 2) {
			this.LobyData.setURLLabel2(o.getUrl());
			this.LobyData.setClassLabel2(o.getClasse());
			this.LobyData.setTextField2(o.getLabel());
			this.LobyData.setTextField12(o.getLabelbis());
		} else if (o.getSlot() == 3) {
			this.LobyData.setURLLabel3(o.getUrl());
			this.LobyData.setClassLabel3(o.getClasse());
			this.LobyData.setTextField3(o.getLabel());
			this.LobyData.setTextField13(o.getLabelbis());
		} else if (o.getSlot() == 4) {
			this.LobyData.setURLLabel4(o.getUrl());
			this.LobyData.setClassLabel4(o.getClasse());
			this.LobyData.setTextField4(o.getLabel());
			this.LobyData.setTextField14(o.getLabelbis());
		} else if (o.getSlot() == 5) {
			this.LobyData.setURLLabel5(o.getUrl());
			this.LobyData.setClassLabel5(o.getClasse());
			this.LobyData.setTextField5(o.getLabel());
			this.LobyData.setTextField15(o.getLabelbis());
		} else if (o.getSlot() == 6) {
			this.LobyData.setURLLabel6(o.getUrl());
			this.LobyData.setClassLabel6(o.getClasse());
			this.LobyData.setTextField6(o.getLabel());
			this.LobyData.setTextField16(o.getLabelbis());
		} else if (o.getSlot() == 7) {
			this.LobyData.setURLLabel7(o.getUrl());
			this.LobyData.setClassLabel7(o.getClasse());
			this.LobyData.setTextField7(o.getLabel());
			this.LobyData.setTextField17(o.getLabelbis());
		} else if (o.getSlot() == 8) {
			this.LobyData.setURLLabel8(o.getUrl());
			this.LobyData.setClassLabel8(o.getClasse());
			this.LobyData.setTextField8(o.getLabel());
			this.LobyData.setTextField18(o.getLabelbis());
		} else if (o.getSlot() == 9) {
			this.LobyData.setURLLabel9(o.getUrl());
			this.LobyData.setClassLabel9(o.getClasse());
			this.LobyData.setTextField9(o.getLabel());
			this.LobyData.setTextField19(o.getLabelbis());
		} else if (o.getSlot() == 10) {
			this.LobyData.setURLLabel10(o.getUrl());
			this.LobyData.setClassLabel10(o.getClasse());
			this.LobyData.setTextField10(o.getLabel());
			this.LobyData.setTextField20(o.getLabelbis());
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
	public void initialize(URL url, ResourceBundle rb) {
		this.LobyData = Save.charger();
		initChoiceBox();
	}

}
