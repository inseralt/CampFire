package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class Main extends Application {
	private double maxX;

	@Override
	public void start(Stage primaryStage) throws Exception {

		Rectangle2D screenBounds = Screen.getPrimary().getBounds();
		this.maxX = screenBounds.getMaxX();

		Parent parent = FXMLLoader.load(getClass().getResource("View.fxml"));

		primaryStage.getIcons().add(new Image("file:Fire.png"));

		Scene scene = new Scene(parent);
		primaryStage.initStyle(StageStyle.UTILITY);
		primaryStage.setX(this.maxX - 500);
		primaryStage.setY(0);
		primaryStage.setScene(scene);
		primaryStage.initStyle(StageStyle.TRANSPARENT);
		primaryStage.show();

	}

	public static void main(String[] args) throws IOException {
		launch(args);
		/*
		 * String res; WebScrap r = new WebScrap(
		 * "https://www.topachat.com/pages/detail2_cat_est_micro_puis_rubrique_est_wme_ddr4_puis_ref_est_in10091200.html"
		 * ,".fp44.priceFinal"); res = r.Scrap(); System.out.println(res);
		 */
	}
}
