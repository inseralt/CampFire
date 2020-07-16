package application;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

import tray.animations.AnimationType;
import tray.notification.NotificationType;
import tray.notification.TrayNotification;

public class FXMLDocumentController implements Initializable {

	private double x, y;
	private Data LobyData;
	private Service<Void> backgroundThread;

	@FXML
	HBox TopBar;
	@FXML
	Label time, label1, label2, label3, label4, label5, label6, label7, label8, label9, label10;
	@FXML
	TextField TextField1, TextField2, TextField3, TextField4, TextField5, TextField6, TextField7, TextField8,
			TextField9, TextField10;
	@FXML
	TextField TextField11, TextField12, TextField13, TextField14, TextField15, TextField16, TextField17, TextField18,
			TextField19, TextField20;
	@FXML
	private Pane myPane;

	@FXML
	private FontAwesomeIcon Checker1, Checker2, Checker3, Checker4, Checker5, Checker6, Checker7, Checker8, Checker9,
			Checker10;

	@FXML
	void draged(MouseEvent event) throws InterruptedException {
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setX(event.getScreenX() - x);
		stage.setY(event.getScreenY() - y);
	}

	@FXML
	void pressed(MouseEvent event) {
		x = event.getSceneX();
		y = event.getSceneY();
	}

	@FXML
	public void minmax(MouseEvent event) {
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		if (stage.getHeight() == 20 && stage.getWidth() == 96) {
			TopBar.setAlignment(Pos.CENTER_RIGHT);
			stage.setHeight(300);
			stage.setWidth(500);
			stage.setX(stage.getX() - 404);
		} else {
			TopBar.setAlignment(Pos.CENTER_LEFT);
			stage.setHeight(20);
			stage.setWidth(96);
			stage.setX(stage.getX() + 404);
		}
	}

	@FXML
	public void Button_loby(MouseEvent event) {
		myPane.getChildren().clear();
		refreshObject();
		initTextField();
		RefreshChecker();

	}

	@FXML
	public void close(MouseEvent event) {
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.close();
	}

	private void initTimeline() {

		Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
			time.setText(LocalDateTime.now().format(formatter));
		}), new KeyFrame(Duration.seconds(1)));
		clock.setCycleCount(Animation.INDEFINITE);
		clock.play();

		backgroundThread = new Service<Void>() {
			@Override
			protected Task<Void> createTask() {
				return new Task<Void>() {

					@Override
					protected Void call() throws Exception {

						while (true) {
							Data data = Save.charger();

							String reslabel1 = " ";
							String reslabel2 = " ";
							String reslabel3 = " ";
							String reslabel4 = " ";
							String reslabel5 = " ";
							String reslabel6 = " ";
							String reslabel7 = " ";
							String reslabel8 = " ";
							String reslabel9 = " ";
							String reslabel10 = " ";

							String r1 = "no";
							String r2 = "no";
							String r3 = "no";
							String r4 = "no";
							String r5 = "no";
							String r6 = "no";
							String r7 = "no";
							String r8 = "no";
							String r9 = "no";
							String r10 = "no";

							try {
								WebScrap search1 = new WebScrap(data.getURLLabel1(), data.getClassLabel1());
								reslabel1 = search1.Scrap();
							} catch (Exception ie) {
							}
							try {
								WebScrap search2 = new WebScrap(data.getURLLabel2(), data.getClassLabel2());
								reslabel2 = search2.Scrap();
							} catch (Exception ie) {
							}
							try {
								WebScrap search3 = new WebScrap(data.getURLLabel3(), data.getClassLabel3());
								reslabel3 = search3.Scrap();
							} catch (Exception ie) {
							}
							try {
								WebScrap search4 = new WebScrap(data.getURLLabel4(), data.getClassLabel4());
								reslabel4 = search4.Scrap();
							} catch (Exception ie) {
							}
							try {
								WebScrap search5 = new WebScrap(data.getURLLabel5(), data.getClassLabel5());
								reslabel5 = search5.Scrap();
							} catch (Exception ie) {
							}
							try {
								WebScrap search6 = new WebScrap(data.getURLLabel6(), data.getClassLabel6());
								reslabel6 = search6.Scrap();
							} catch (Exception ie) {
							}
							try {
								WebScrap search7 = new WebScrap(data.getURLLabel7(), data.getClassLabel7());
								reslabel7 = search7.Scrap();
							} catch (Exception ie) {
							}
							try {
								WebScrap search8 = new WebScrap(data.getURLLabel8(), data.getClassLabel8());
								reslabel8 = search8.Scrap();
							} catch (Exception ie) {
							}
							try {
								WebScrap search9 = new WebScrap(data.getURLLabel9(), data.getClassLabel9());
								reslabel9 = search9.Scrap();
							} catch (Exception ie) {
							}
							try {
								WebScrap search10 = new WebScrap(data.getURLLabel10(), data.getClassLabel10());
								reslabel10 = search10.Scrap();
							} catch (Exception ie) {
							}

							try {
								if (data.getNotifALT1().contains("< ") && data.isNotif1()) {
									String[] Split = data.getNotifALT1().split(" ");
									// System.out.println(Float.valueOf(Split[1].replace(",", "")) + " < " + Float
									// .valueOf(reslabel1.replace(",", "")));
									if (Float.valueOf(Split[1].replace(",", "")) > Float
											.valueOf(reslabel1.replace(",", ""))) {
										r1 = "yes";
									}
								} else if (data.getNotifALT1().contains("> ") && data.isNotif1()) {
									String[] Split = data.getNotifALT1().split(" ");

									// System.out.println(Float.valueOf(Split[1].replace(",", "")) +">" + Float
									// .valueOf(reslabel1.replace(",", "")));
									if (Float.valueOf(Split[1].replace(",", "")) < Float
											.valueOf(reslabel1.replace(",", ""))) {
										r1 = "yes";
									}
								} else if (data.getNotifALT1().contains("!= ") && data.isNotif1()) {
									String[] Split = data.getNotifALT1().split(" ");
									if (!Split[1].equals(reslabel1)) {
										r1 = "yes";
									}
								} else if (data.getNotifALT1().contains("= ") && data.isNotif1()) {
									String[] Split = data.getNotifALT1().split(" ");
									if (Split[1].equals(reslabel1)) {
										r1 = "yes";
									}
								}
							} catch (Exception ie) {
							}

							try {
								if (data.getNotifALT2().contains("< ") && data.isNotif2()) {
									String[] Split = data.getNotifALT2().split(" ");
									if (Float.valueOf(Split[1].replace(",", "")) > Float
											.valueOf(reslabel2.replace(",", ""))) {
										r2 = "yes";
									}
								} else if (data.getNotifALT2().contains("> ") && data.isNotif2()) {
									String[] Split = data.getNotifALT2().split(" ");

									if (Float.valueOf(Split[1].replace(",", "")) < Float
											.valueOf(reslabel2.replace(",", ""))) {
										r2 = "yes";
									}
								} else if (data.getNotifALT2().contains("!= ") && data.isNotif2()) {
									String[] Split = data.getNotifALT2().split(" ");
									if (!Split[1].equals(reslabel2)) {
										r2 = "yes";
									}
								} else if (data.getNotifALT2().contains("= ") && data.isNotif2()) {
									String[] Split = data.getNotifALT2().split(" ");
									if (Split[1].equals(reslabel2)) {
										r2 = "yes";
									}
								}
							} catch (Exception ie) {
							}

							try {
								if (data.getNotifALT3().contains("< ") && data.isNotif3()) {
									String[] Split = data.getNotifALT3().split(" ");
									if (Float.valueOf(Split[1].replace(",", "")) > Float
											.valueOf(reslabel3.replace(",", ""))) {
										r3 = "yes";
									}
								} else if (data.getNotifALT3().contains("> ") && data.isNotif3()) {
									String[] Split = data.getNotifALT3().split(" ");

									if (Float.valueOf(Split[1].replace(",", "")) < Float
											.valueOf(reslabel3.replace(",", ""))) {
										r3 = "yes";
									}
								} else if (data.getNotifALT3().contains("!= ") && data.isNotif3()) {
									String[] Split = data.getNotifALT3().split(" ");
									if (!Split[1].equals(reslabel3)) {
										r3 = "yes";
									}
								} else if (data.getNotifALT3().contains("!= ") && data.isNotif3()) {
									String[] Split = data.getNotifALT3().split(" ");
									if (Split[1].equals(reslabel3)) {
										r3 = "yes";
									}
								}
							} catch (Exception ie) {
							}

							try {
								if (data.getNotifALT4().contains("< ") && data.isNotif4()) {
									String[] Split = data.getNotifALT5().split(" ");
									if (Float.valueOf(Split[1].replace(",", "")) > Float
											.valueOf(reslabel4.replace(",", ""))) {
										r4 = "yes";
									}
								} else if (data.getNotifALT5().contains("> ") && data.isNotif4()) {
									String[] Split = data.getNotifALT5().split(" ");

									if (Float.valueOf(Split[1].replace(",", "")) < Float
											.valueOf(reslabel4.replace(",", ""))) {
										r4 = "yes";
									}
								} else if (data.getNotifALT5().contains("!= ") && data.isNotif4()) {
									String[] Split = data.getNotifALT5().split(" ");
									if (!Split[1].equals(reslabel4)) {
										r4 = "yes";
									}
								} else if (data.getNotifALT4().contains("!= ") && data.isNotif4()) {
									String[] Split = data.getNotifALT4().split(" ");
									if (Split[1].equals(reslabel4)) {
										r4 = "yes";
									}
								}
							} catch (Exception ie) {
							}

							try {
								if (data.getNotifALT5().contains("< ") && data.isNotif5()) {
									String[] Split = data.getNotifALT5().split(" ");
									if (Float.valueOf(Split[1].replace(",", "")) > Float
											.valueOf(reslabel5.replace(",", ""))) {
										r5 = "yes";
									}
								} else if (data.getNotifALT5().contains("> ") && data.isNotif5()) {
									String[] Split = data.getNotifALT5().split(" ");

									if (Float.valueOf(Split[1].replace(",", "")) < Float
											.valueOf(reslabel5.replace(",", ""))) {
										r5 = "yes";
									}
								} else if (data.getNotifALT5().contains("!= ") && data.isNotif5()) {
									String[] Split = data.getNotifALT5().split(" ");
									if (!Split[1].equals(reslabel5)) {
										r5 = "yes";
									}
								} else if (data.getNotifALT5().contains("!= ") && data.isNotif5()) {
									String[] Split = data.getNotifALT5().split(" ");
									if (Split[1].equals(reslabel5)) {
										r5 = "yes";
									}
								}
							} catch (Exception ie) {
							}

							try {
								if (data.getNotifALT6().contains("< ") && data.isNotif6()) {
									String[] Split = data.getNotifALT6().split(" ");
									if (Float.valueOf(Split[1].replace(",", "")) > Float
											.valueOf(reslabel6.replace(",", ""))) {
										r6 = "yes";
									}
								} else if (data.getNotifALT6().contains("> ") && data.isNotif6()) {
									String[] Split = data.getNotifALT6().split(" ");

									if (Float.valueOf(Split[1].replace(",", "")) < Float
											.valueOf(reslabel6.replace(",", ""))) {
										r6 = "yes";
									}
								} else if (data.getNotifALT6().contains("!= ") && data.isNotif6()) {
									String[] Split = data.getNotifALT6().split(" ");
									if (!Split[1].equals(reslabel6)) {
										r6 = "yes";
									}
								} else if (data.getNotifALT6().contains("!= ") && data.isNotif6()) {
									String[] Split = data.getNotifALT6().split(" ");
									if (Split[1].equals(reslabel6)) {
										r6 = "yes";
									}
								}
							} catch (Exception ie) {
							}

							try {
								if (data.getNotifALT7().contains("< ") && data.isNotif7()) {
									String[] Split = data.getNotifALT7().split(" ");
									if (Float.valueOf(Split[1].replace(",", "")) > Float
											.valueOf(reslabel7.replace(",", ""))) {
										r7 = "yes";
									}
								} else if (data.getNotifALT7().contains("> ") && data.isNotif7()) {
									String[] Split = data.getNotifALT7().split(" ");

									if (Float.valueOf(Split[1].replace(",", "")) < Float
											.valueOf(reslabel7.replace(",", ""))) {
										r7 = "yes";
									}
								} else if (data.getNotifALT7().contains("!= ") && data.isNotif7()) {
									String[] Split = data.getNotifALT7().split(" ");
									if (!Split[1].equals(reslabel7)) {
										r7 = "yes";
									}
								} else if (data.getNotifALT7().contains("!= ") && data.isNotif7()) {
									String[] Split = data.getNotifALT7().split(" ");
									if (Split[1].equals(reslabel7)) {
										r7 = "yes";
									}
								}
							} catch (Exception ie) {
							}

							try {
								if (data.getNotifALT8().contains("< ") && data.isNotif8()) {
									String[] Split = data.getNotifALT8().split(" ");
									if (Float.valueOf(Split[1].replace(",", "")) > Float
											.valueOf(reslabel8.replace(",", ""))) {
										r8 = "yes";
									}
								} else if (data.getNotifALT8().contains("> ") && data.isNotif8()) {
									String[] Split = data.getNotifALT8().split(" ");

									if (Float.valueOf(Split[1].replace(",", "")) < Float
											.valueOf(reslabel8.replace(",", ""))) {
										r8 = "yes";
									}
								} else if (data.getNotifALT8().contains("!= ") && data.isNotif8()) {
									String[] Split = data.getNotifALT8().split(" ");
									if (!Split[1].equals(reslabel8)) {
										r8 = "yes";
									}
								} else if (data.getNotifALT8().contains("!= ") && data.isNotif8()) {
									String[] Split = data.getNotifALT8().split(" ");
									if (Split[1].equals(reslabel8)) {
										r8 = "yes";
									}
								}
							} catch (Exception ie) {
							}

							try {
								if (data.getNotifALT9().contains("< ") && data.isNotif9()) {
									String[] Split = data.getNotifALT9().split(" ");
									if (Float.valueOf(Split[1].replace(",", "")) > Float
											.valueOf(reslabel9.replace(",", ""))) {
										r9 = "yes";
									}
								} else if (data.getNotifALT9().contains("> ") && data.isNotif9()) {
									String[] Split = data.getNotifALT9().split(" ");

									if (Float.valueOf(Split[1].replace(",", "")) < Float
											.valueOf(reslabel9.replace(",", ""))) {
										r9 = "yes";
									}
								} else if (data.getNotifALT9().contains("!= ") && data.isNotif9()) {
									String[] Split = data.getNotifALT9().split(" ");
									if (!Split[1].equals(reslabel9)) {
										r9 = "yes";
									}
								} else if (data.getNotifALT9().contains("!= ") && data.isNotif9()) {
									String[] Split = data.getNotifALT9().split(" ");
									if (Split[1].equals(reslabel9)) {
										r9 = "yes";
									}
								}
							} catch (Exception ie) {
							}

							try {
								if (data.getNotifALT10().contains("< ") && data.isNotif10()) {
									String[] Split = data.getNotifALT10().split(" ");
									if (Float.valueOf(Split[1].replace(",", "")) > Float
											.valueOf(reslabel10.replace(",", ""))) {
										r10 = "yes";
									}
								} else if (data.getNotifALT10().contains("> ") && data.isNotif10()) {
									String[] Split = data.getNotifALT10().split(" ");

									if (Float.valueOf(Split[1].replace(",", "")) < Float
											.valueOf(reslabel10.replace(",", ""))) {
										r10 = "yes";
									}
								} else if (data.getNotifALT10().contains("!= ") && data.isNotif10()) {
									String[] Split = data.getNotifALT10().split(" ");
									if (!Split[1].equals(reslabel10)) {
										r10 = "yes";
									}
								} else if (data.getNotifALT10().contains("!= ") && data.isNotif10()) {
									String[] Split = data.getNotifALT10().split(" ");
									if (Split[1].equals(reslabel10)) {
										r10 = "yes";
									}
								}
							} catch (Exception ie) {
							}

							updateMessage(reslabel1 + "§" + r1 + ";" + reslabel2 + "§" + r2 + ";" + reslabel3 + "§" + r3
									+ ";" + reslabel4 + "§" + r4 + ";" + reslabel5 + "§" + r5 + ";" + reslabel6 + "§"
									+ r6 + ";" + reslabel7 + "§" + r7 + ";" + reslabel8 + "§" + r8 + ";" + reslabel9
									+ "§" + r9 + ";" + reslabel10 + "§" + r10);

						}
					}
				};
			}
		};
		backgroundThread.start();

		Timeline init = new Timeline(new KeyFrame(Duration.ZERO, e -> {
			refreshObject();
			String[] res = backgroundThread.messageProperty().get().split(";");

			try {
				String[] r1 = res[0].split("§");
				label1.setText(r1[0]);

				if (r1[1].equals("yes")) {
					Notification(this.LobyData.getTextField1(), this.LobyData.getTextField11(),
							this.LobyData.getNotifMSG1());
					this.LobyData.setChecker1(2);
					this.LobyData.setNotif1(false);
					Save.sauvegarder(this.LobyData);
					RefreshChecker();
				}

			} catch (Exception ie) {
			}
			try {
				String[] r2 = res[1].split("§");
				label2.setText(r2[0]);
				if (r2[1].equals("yes")) {
					Notification(this.LobyData.getTextField2(), this.LobyData.getTextField12(),
							this.LobyData.getNotifMSG2());
					this.LobyData.setChecker2(2);
					this.LobyData.setNotif2(false);
					Save.sauvegarder(this.LobyData);
					RefreshChecker();
				}
			} catch (Exception ie) {
			}
			try {
				String[] r3 = res[2].split("§");
				label3.setText(r3[0]);
				if (r3[1].equals("yes")) {
					Notification(this.LobyData.getTextField3(), this.LobyData.getTextField13(),
							this.LobyData.getNotifMSG3());
					this.LobyData.setChecker3(2);
					this.LobyData.setNotif3(false);
					Save.sauvegarder(this.LobyData);
					RefreshChecker();
				}
			} catch (Exception ie) {
			}
			try {
				String[] r4 = res[3].split("§");
				label4.setText(r4[0]);
				if (r4[1].equals("yes")) {
					Notification(this.LobyData.getTextField4(), this.LobyData.getTextField14(),
							this.LobyData.getNotifMSG4());
					this.LobyData.setChecker4(2);
					this.LobyData.setNotif4(false);
					Save.sauvegarder(this.LobyData);
					RefreshChecker();
				}
			} catch (Exception ie) {
			}
			try {
				String[] r5 = res[4].split("§");
				label5.setText(r5[0]);
				if (r5[1].equals("yes")) {
					Notification(this.LobyData.getTextField5(), this.LobyData.getTextField15(),
							this.LobyData.getNotifMSG5());
					this.LobyData.setChecker5(2);
					this.LobyData.setNotif5(false);
					Save.sauvegarder(this.LobyData);
					RefreshChecker();
				}
			} catch (Exception ie) {
			}
			try {
				String[] r6 = res[5].split("§");
				label6.setText(r6[0]);
				if (r6[1].equals("yes")) {
					Notification(this.LobyData.getTextField6(), this.LobyData.getTextField16(),
							this.LobyData.getNotifMSG6());
					this.LobyData.setChecker6(2);
					this.LobyData.setNotif6(false);
					Save.sauvegarder(this.LobyData);
					RefreshChecker();
				}
			} catch (Exception ie) {
			}
			try {
				String[] r7 = res[6].split("§");
				label7.setText(r7[0]);
				if (r7[1].equals("yes")) {
					Notification(this.LobyData.getTextField7(), this.LobyData.getTextField17(),
							this.LobyData.getNotifMSG7());
					this.LobyData.setChecker7(2);
					this.LobyData.setNotif7(false);
					Save.sauvegarder(this.LobyData);
					RefreshChecker();
				}
			} catch (Exception ie) {
			}
			try {
				String[] r8 = res[7].split("§");
				label8.setText(r8[0]);
				if (r8[1].equals("yes")) {
					Notification(this.LobyData.getTextField8(), this.LobyData.getTextField18(),
							this.LobyData.getNotifMSG8());
					this.LobyData.setChecker8(2);
					this.LobyData.setNotif8(false);
					Save.sauvegarder(this.LobyData);
					RefreshChecker();
				}
			} catch (Exception ie) {
			}
			try {
				String[] r9 = res[8].split("§");
				label9.setText(r9[0]);
				if (r9[1].equals("yes")) {
					Notification(this.LobyData.getTextField9(), this.LobyData.getTextField19(),
							this.LobyData.getNotifMSG9());
					this.LobyData.setChecker9(2);
					this.LobyData.setNotif9(false);
					Save.sauvegarder(this.LobyData);
					RefreshChecker();
				}
			} catch (Exception ie) {
			}
			try {
				String[] r10 = res[9].split("§");
				label10.setText(r10[0]);
				if (r10[1].equals("yes")) {
					Notification(this.LobyData.getTextField10(), this.LobyData.getTextField20(),
							this.LobyData.getNotifMSG10());
					this.LobyData.setChecker10(2);
					this.LobyData.setNotif10(false);
					Save.sauvegarder(this.LobyData);
					RefreshChecker();
				}
			} catch (Exception ie) {
			}

		}), new KeyFrame(Duration.seconds(2)));
		init.setCycleCount(Animation.INDEFINITE);
		init.play();

	}

	private void initTextField() {
		try {
			TextField1.setText(this.LobyData.getTextField1());
		} catch (Exception ie) {
		}
		try {
			TextField2.setText(this.LobyData.getTextField2());
		} catch (Exception ie) {
		}
		try {
			TextField3.setText(this.LobyData.getTextField3());
		} catch (Exception ie) {
		}
		try {
			TextField4.setText(this.LobyData.getTextField4());
		} catch (Exception ie) {
		}
		try {
			TextField5.setText(this.LobyData.getTextField5());
		} catch (Exception ie) {
		}
		try {
			TextField6.setText(this.LobyData.getTextField6());
		} catch (Exception ie) {
		}
		try {
			TextField7.setText(this.LobyData.getTextField7());
		} catch (Exception ie) {
		}
		try {
			TextField8.setText(this.LobyData.getTextField8());
		} catch (Exception ie) {
		}
		try {
			TextField9.setText(this.LobyData.getTextField9());
		} catch (Exception ie) {
		}
		try {
			TextField10.setText(this.LobyData.getTextField10());
		} catch (Exception ie) {
		}
		try {
			TextField11.setText(this.LobyData.getTextField11());
		} catch (Exception ie) {
		}
		try {
			TextField12.setText(this.LobyData.getTextField12());
		} catch (Exception ie) {
		}
		try {
			TextField13.setText(this.LobyData.getTextField13());
		} catch (Exception ie) {
		}
		try {
			TextField14.setText(this.LobyData.getTextField14());
		} catch (Exception ie) {
		}
		try {
			TextField15.setText(this.LobyData.getTextField15());
		} catch (Exception ie) {
		}
		try {
			TextField16.setText(this.LobyData.getTextField16());
		} catch (Exception ie) {
		}
		try {
			TextField17.setText(this.LobyData.getTextField17());
		} catch (Exception ie) {
		}
		try {
			TextField18.setText(this.LobyData.getTextField18());
		} catch (Exception ie) {
		}
		try {
			TextField19.setText(this.LobyData.getTextField19());
		} catch (Exception ie) {
		}
		try {
			TextField20.setText(this.LobyData.getTextField20());
		} catch (Exception ie) {
		}

	}

	@FXML
	public void Button_new_Clicked(ActionEvent event) throws IOException {
		myPane.getChildren().clear();
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("New.fxml"));
		BorderPane view = (BorderPane) fxmlLoader.load();
		myPane.getChildren().add(view);
	}

	@FXML
	public void Button_remove_Clicked(MouseEvent event) throws IOException {
		myPane.getChildren().clear();
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Remove.fxml"));
		BorderPane view = (BorderPane) fxmlLoader.load();
		myPane.getChildren().add(view);
	}

	@FXML
	public void Button_setting_Clicked(MouseEvent event) throws IOException {
		myPane.getChildren().clear();
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Setting.fxml"));
		BorderPane view = (BorderPane) fxmlLoader.load();
		myPane.getChildren().add(view);

		/*
		 * myPane.getChildren().clear(); refreshObject(); initTextField();
		 */
	}

	@FXML
	public void TextFieldChanged(ActionEvent ae) {
		this.LobyData.setTextField1(TextField1.getText());
		this.LobyData.setTextField2(TextField2.getText());
		this.LobyData.setTextField3(TextField3.getText());
		this.LobyData.setTextField4(TextField4.getText());
		this.LobyData.setTextField5(TextField5.getText());
		this.LobyData.setTextField6(TextField6.getText());
		this.LobyData.setTextField7(TextField7.getText());
		this.LobyData.setTextField8(TextField8.getText());
		this.LobyData.setTextField9(TextField9.getText());
		this.LobyData.setTextField10(TextField10.getText());
		this.LobyData.setTextField11(TextField11.getText());
		this.LobyData.setTextField12(TextField12.getText());
		this.LobyData.setTextField13(TextField13.getText());
		this.LobyData.setTextField14(TextField14.getText());
		this.LobyData.setTextField15(TextField15.getText());
		this.LobyData.setTextField16(TextField16.getText());
		this.LobyData.setTextField17(TextField17.getText());
		this.LobyData.setTextField18(TextField18.getText());
		this.LobyData.setTextField19(TextField19.getText());
		this.LobyData.setTextField20(TextField20.getText());
		Save.sauvegarder(this.LobyData);
	}

	public void TextFieldUnFocused() {

		TextField1.setFocusTraversable(false);
		TextField2.setFocusTraversable(false);
		TextField3.setFocusTraversable(false);
		TextField4.setFocusTraversable(false);
		TextField5.setFocusTraversable(false);
		TextField6.setFocusTraversable(false);
		TextField7.setFocusTraversable(false);
		TextField8.setFocusTraversable(false);
		TextField9.setFocusTraversable(false);
		TextField10.setFocusTraversable(false);
		TextField11.setFocusTraversable(false);
		TextField12.setFocusTraversable(false);
		TextField13.setFocusTraversable(false);
		TextField14.setFocusTraversable(false);
		TextField15.setFocusTraversable(false);
		TextField16.setFocusTraversable(false);
		TextField17.setFocusTraversable(false);
		TextField18.setFocusTraversable(false);
		TextField19.setFocusTraversable(false);
		TextField20.setFocusTraversable(false);

	}

	public void Notification(String Titre, String Titre_bis, String msg) {
		String title = Titre + " " + Titre_bis;
		String message = msg;
		NotificationType notificationType = NotificationType.FIRE;

		TrayNotification trayNotification = new TrayNotification();
		trayNotification.setTitle(title);
		trayNotification.setMessage(message);
		trayNotification.setNotificationType(notificationType);
		trayNotification.setAnimationType(AnimationType.POPUP);
		trayNotification.showAndDismiss(Duration.seconds(10));
	}

	public void RefreshChecker() {
		if (this.LobyData.getChecker1() == 1) {
			Checker1.setFill(Color.valueOf("#0acf91"));
		}
		if (this.LobyData.getChecker1() == 2) {
			Checker1.setFill(Color.RED);
		}
		if (this.LobyData.getChecker1() == 0) {
			Checker1.setFill(Color.valueOf("#0e1217"));
		}
		if (this.LobyData.getChecker2() == 1) {
			Checker2.setFill(Color.valueOf("#0acf91"));
		}
		if (this.LobyData.getChecker2() == 2) {
			Checker2.setFill(Color.RED);
		}
		if (this.LobyData.getChecker1() == 0) {
			Checker2.setFill(Color.valueOf("#0e1217"));
		}
		if (this.LobyData.getChecker3() == 1) {
			Checker3.setFill(Color.valueOf("#0acf91"));
		}
		if (this.LobyData.getChecker3() == 2) {
			Checker3.setFill(Color.RED);
		}
		if (this.LobyData.getChecker1() == 0) {
			Checker3.setFill(Color.valueOf("#0e1217"));
		}
		if (this.LobyData.getChecker4() == 1) {
			Checker4.setFill(Color.valueOf("#0acf91"));
		}
		if (this.LobyData.getChecker4() == 2) {
			Checker4.setFill(Color.RED);
		}
		if (this.LobyData.getChecker1() == 0) {
			Checker4.setFill(Color.valueOf("#0e1217"));
		}
		if (this.LobyData.getChecker5() == 1) {
			Checker5.setFill(Color.valueOf("#0acf91"));
		}
		if (this.LobyData.getChecker5() == 2) {
			Checker5.setFill(Color.RED);
		}
		if (this.LobyData.getChecker1() == 0) {
			Checker5.setFill(Color.valueOf("#0e1217"));
		}
		if (this.LobyData.getChecker6() == 1) {
			Checker6.setFill(Color.valueOf("#0acf91"));
		}
		if (this.LobyData.getChecker6() == 2) {
			Checker6.setFill(Color.RED);
		}
		if (this.LobyData.getChecker1() == 0) {
			Checker6.setFill(Color.valueOf("#0e1217"));
		}
		if (this.LobyData.getChecker7() == 1) {
			Checker7.setFill(Color.valueOf("#0acf91"));
		}
		if (this.LobyData.getChecker7() == 2) {
			Checker7.setFill(Color.RED);
		}
		if (this.LobyData.getChecker1() == 0) {
			Checker7.setFill(Color.valueOf("#0e1217"));
		}
		if (this.LobyData.getChecker8() == 1) {
			Checker8.setFill(Color.valueOf("#0acf91"));
		}
		if (this.LobyData.getChecker8() == 2) {
			Checker8.setFill(Color.RED);
		}
		if (this.LobyData.getChecker1() == 0) {
			Checker8.setFill(Color.valueOf("#0e1217"));
		}
		if (this.LobyData.getChecker9() == 1) {
			Checker9.setFill(Color.valueOf("#0acf91"));
		}
		if (this.LobyData.getChecker9() == 2) {
			Checker9.setFill(Color.RED);
		}
		if (this.LobyData.getChecker1() == 0) {
			Checker9.setFill(Color.valueOf("#0e1217"));
		}
		if (this.LobyData.getChecker10() == 1) {
			Checker10.setFill(Color.valueOf("#0acf91"));
		}
		if (this.LobyData.getChecker10() == 2) {
			Checker10.setFill(Color.RED);
		}
		if (this.LobyData.getChecker1() == 0) {
			Checker10.setFill(Color.valueOf("#0e1217"));
		}
	}

	public void refreshObject() {
		this.LobyData = Save.charger();
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {

		this.LobyData = Save.charger();
		//this.LobyData = new Data();
		//Save.sauvegarder(this.LobyData);
		TextFieldUnFocused();
		initTimeline();
		initTextField();
		RefreshChecker();
	}
}
