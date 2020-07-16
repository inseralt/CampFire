package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class FXMLDocumentControllerSetting implements Initializable {

	@FXML
	private ChoiceBox<String> Choice_Box;

	@FXML
	private TextField TextField_When;

	@FXML
	private Button Button_Add_New;

	@FXML
	private CheckBox CheckBox;

	@FXML
	private TextField TextField_Message;

	private Data LobyData;

	@FXML
	public void Button_Add(ActionEvent event) {
		if (this.Choice_Box.getSelectionModel() != null && this.CheckBox.isSelected()) {

			int o;

			if (this.Choice_Box.getSelectionModel().getSelectedItem() == "Slot 1") {
				o = 1;
			} else if (this.Choice_Box.getSelectionModel().getSelectedItem() == "Slot 2") {
				o = 2;
			} else if (this.Choice_Box.getSelectionModel().getSelectedItem() == "Slot 3") {
				o = 3;
			} else if (this.Choice_Box.getSelectionModel().getSelectedItem() == "Slot 4") {
				o = 4;
			} else if (this.Choice_Box.getSelectionModel().getSelectedItem() == "Slot 5") {
				o = 5;
			} else if (this.Choice_Box.getSelectionModel().getSelectedItem() == "Slot 6") {
				o = 6;
			} else if (this.Choice_Box.getSelectionModel().getSelectedItem() == "Slot 7") {
				o = 7;
			} else if (this.Choice_Box.getSelectionModel().getSelectedItem() == "Slot 8") {
				o = 8;
			} else if (this.Choice_Box.getSelectionModel().getSelectedItem() == "Slot 9") {
				o = 9;
			} else if (this.Choice_Box.getSelectionModel().getSelectedItem() == "Slot 10") {
				o = 10;
			} else {
				o = 0;
			}

			if (o == 1) {
				this.LobyData.setNotif1(true);
				this.LobyData.setChecker1(1);
				this.LobyData.setNotifALT1(TextField_When.getText());
				this.LobyData.setNotifMSG1(TextField_Message.getText());
			} else if (o == 2) {
				this.LobyData.setNotif2(true);
				this.LobyData.setChecker2(1);
				this.LobyData.setNotifALT2(TextField_When.getText());
				this.LobyData.setNotifMSG2(TextField_Message.getText());
			} else if (o == 3) {
				this.LobyData.setNotif3(true);
				this.LobyData.setChecker3(1);
				this.LobyData.setNotifALT3(TextField_When.getText());
				this.LobyData.setNotifMSG3(TextField_Message.getText());
			} else if (o == 4) {
				this.LobyData.setNotif4(true);
				this.LobyData.setChecker4(1);
				this.LobyData.setNotifALT4(TextField_When.getText());
				this.LobyData.setNotifMSG4(TextField_Message.getText());
			} else if (o == 5) {
				this.LobyData.setNotif5(true);
				this.LobyData.setChecker5(1);
				this.LobyData.setNotifALT5(TextField_When.getText());
				this.LobyData.setNotifMSG5(TextField_Message.getText());
			} else if (o == 6) {
				this.LobyData.setNotif6(true);
				this.LobyData.setChecker6(1);
				this.LobyData.setNotifALT6(TextField_When.getText());
				this.LobyData.setNotifMSG6(TextField_Message.getText());
			} else if (o == 7) {
				this.LobyData.setNotif7(true);
				this.LobyData.setChecker7(1);
				this.LobyData.setNotifALT7(TextField_When.getText());
				this.LobyData.setNotifMSG7(TextField_Message.getText());
			} else if (o == 8) {
				this.LobyData.setNotif8(true);
				this.LobyData.setChecker8(1);
				this.LobyData.setNotifALT8(TextField_When.getText());
				this.LobyData.setNotifMSG8(TextField_Message.getText());
			} else if (o == 9) {
				this.LobyData.setNotif9(true);
				this.LobyData.setChecker9(1);
				this.LobyData.setNotifALT9(TextField_When.getText());
				this.LobyData.setNotifMSG9(TextField_Message.getText());
			} else if (o == 10) {
				this.LobyData.setNotif10(true);
				this.LobyData.setChecker10(1);
				this.LobyData.setNotifALT10(TextField_When.getText());
				this.LobyData.setNotifMSG10(TextField_Message.getText());
			}
			Save.sauvegarder(this.LobyData);
		}

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