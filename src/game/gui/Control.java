package game.gui;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.PriorityQueue;

import game.engine.Battle;
import game.engine.exceptions.InsufficientResourcesException;
import game.engine.exceptions.InvalidLaneException;
import game.engine.lanes.Lane;
import game.engine.titans.AbnormalTitan;
import game.engine.titans.ArmoredTitan;
import game.engine.titans.ColossalTitan;
import game.engine.titans.PureTitan;
import game.engine.titans.Titan;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Control extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Font.loadFont(getClass().getResourceAsStream("ROGFONTS-REGULAR.OTF"),20);
		Parent root = FXMLLoader.load(getClass().getResource("First.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("Attack on Titans Game");
		primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.jpg")));
		primaryStage.setResizable(false);
		AudioManager.playBackgroundMusic("Attackontitans.mp3");
		primaryStage.show();
		

	}

	private void showErrorWindow(String message) {
		AudioManager.playSoundEffect("error.wav");
		Alert alert = new Alert(Alert.AlertType.ERROR);
		alert.setTitle("Error");
		alert.setHeaderText(null);
		alert.setContentText(message);
		alert.showAndWait();
	}
	public ProgressBar createHealthProgressBar(int initialHealth, int currentHealth) {
        ProgressBar healthBar = new ProgressBar();
        double progress = currentHealth / initialHealth;
        healthBar.setProgress(progress);
        return healthBar;
    }


	public static void main(String[] args) {
		launch(args);
	}

	@FXML
	private Button PC1;

	@FXML
	private Button PC2;

	@FXML
	private Button PC3;

	@FXML
	private Button SC1;

	@FXML
	private Button SC2;

	@FXML
	private Button SC3;

	@FXML
	private Button VS1;

	@FXML
	private Button VS2;

	@FXML
	private Button VS3;
	@FXML
	private Button WT1;

	@FXML
	private Button WT2;

	@FXML
	private Button WT3;

	private static Battle battle;
	@FXML
	private Button startButton;
	@FXML
	private Button playButton;
	@FXML
	private Button nextButton;
	@FXML
	private Button easyButton;
	@FXML
	private Button hardButton;

	@FXML
	private Button peircing;

	@FXML
	private Button sniper;

	@FXML
	private Button volley;
	@FXML
	private Button wallTrap;

	@FXML
	private Button passTurnButton5;

	@FXML
	private Label phaseLabe5;

	@FXML
	private Label pl1;

	@FXML
	private Label pl2;

	@FXML
	private Label pl3;

	@FXML
	private Label resourcesLabel5;

	@FXML
	private Label scoreLabel5;

	@FXML
	private Label sl1;

	@FXML
	private Label sl2;

	@FXML
	private Label sl3;

	@FXML
	private Label turnLabel5;

	@FXML
	private Label vl1;

	@FXML
	private Label vl2;

	@FXML
	private Label vl3;

	@FXML
	private Label wallDanger1;

	@FXML
	private Label wallDanger2;

	@FXML
	private Label wallDanger3;

	@FXML
	private Label wallHealth1;

	@FXML
	private Label wallHealth2;

	@FXML
	private Label wallHealth3;

	@FXML
	private Label wl1;

	@FXML
	private Label wl2;

	@FXML
	private Label wl3;
	@FXML
	private Pane lane13;

	@FXML
	private Pane lane23;

	@FXML
	private Pane lane33;
	@FXML
	private ImageView laneImage1;

	@FXML
	private ImageView laneImage2;

	@FXML
	private ImageView laneImage3;

	@FXML
	private Label finalScore;

	@FXML
	private Button playAgain;
	@FXML
	private Button PC15;

	@FXML
	private Button SC15;

	@FXML
	private Button VS15;

	@FXML
	private Button WT15;

	@FXML
	private Button PC4;

	@FXML
	private Button SC4;

	@FXML
	private Button VS4;

	@FXML
	private Button WT4;

	@FXML
	private Button PC5;

	@FXML
	private Button SC5;

	@FXML
	private Button VS5;

	@FXML
	private Button WT5;

	@FXML
	private Button passTurnButton3;

	@FXML
	private Label pl15;

	@FXML
	private Label sl15;

	@FXML
	private Label vl15;

	@FXML
	private Label wl15;

	@FXML
	private Label pl35;

	@FXML
	private Label sl35;

	@FXML
	private Label vl35;

	@FXML
	private Label wl35;

	@FXML
	private Label pl25;

	@FXML
	private Label sl25;

	@FXML
	private Label vl25;

	@FXML
	private Label wl25;

	@FXML
	private Label pl4;

	@FXML
	private Label sl4;

	@FXML
	private Label vl4;

	@FXML
	private Label wl4;

	@FXML
	private Label pl5;

	@FXML
	private Label sl5;

	@FXML
	private Label vl5;

	@FXML
	private Label wl5;

	@FXML
	private Label scoreLabel;

	@FXML
	private Label turnLabel;

	@FXML
	private Label phaseLabel;
	@FXML
	private Label phaseLabel5;

	@FXML
	private Label resourcesLabel;

	@FXML
	private VBox hd15;

	@FXML
	private Label wallHealth15;

	@FXML
	private Label wallDanger15;

	@FXML
	private VBox hd35;

	@FXML
	private Label wallHealth35;

	@FXML
	private Label wallDanger35;

	@FXML
	private VBox hd25;

	@FXML
	private Label wallHealth25;

	@FXML
	private Label wallDanger25;

	@FXML
	private VBox hd4;

	@FXML
	private Label wallHealth4;

	@FXML
	private Label wallDanger4;

	@FXML
	private VBox hd5;

	@FXML
	private Label wallHealth5;
	@FXML
	private Pane lane15;

	@FXML
	private Pane lane25;

	@FXML
	private Pane lane35;

	@FXML
	private Pane lane4;

	@FXML
	private Pane lane5;
	@FXML
	private Label wallDanger5;

	@FXML
	private ImageView laneImage15;

	@FXML
	private ImageView laneImage25;

	@FXML
	private ImageView laneImage35;

	@FXML
	private ImageView laneImage4;

	@FXML
	private ImageView laneImage5;

	@FXML
	private Button PC35;

	@FXML
	private Button SC35;

	@FXML
	private Button VS35;

	@FXML
	private Button WT35;

	@FXML
	private Button PC25;

	@FXML
	private Button SC25;

	@FXML
	private Button VS25;

	@FXML
	private Button WT25;


	@FXML
	void handleLane15(ActionEvent event) {
		AudioManager.playSoundEffect("shot.wav");
		if (event.getSource() == PC15) {
			try {
				battle.purchaseWeapon(1, battle.getOriginalLanes().get(0));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
				e.printStackTrace();

			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
				e.printStackTrace();

			}
			int n = Integer.parseInt(pl15.getText());
			pl15.setText((n + 1) + "");
		} else if (event.getSource() == SC15) {
			try {
				battle.purchaseWeapon(2, battle.getOriginalLanes().get(0));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
				e.printStackTrace();

			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(sl15.getText());
			sl15.setText((n + 1) + "");
		} else if (event.getSource() == VS15) {
			try {
				battle.purchaseWeapon(3, battle.getOriginalLanes().get(0));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
				e.printStackTrace();

			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(vl15.getText());
			vl15.setText((n + 1) + "");
		} else if (event.getSource() == WT15) {
			try {
				battle.purchaseWeapon(4, battle.getOriginalLanes().get(0));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
				e.printStackTrace();

			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(wl15.getText());
			wl15.setText((n + 1) + "");
		}
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		render5(stage);
	}

	@FXML
	void handleLane25(ActionEvent event) {
		AudioManager.playSoundEffect("shot.wav");
		if (event.getSource() == PC25) {
			try {
				battle.purchaseWeapon(1, battle.getOriginalLanes().get(1));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
				e.printStackTrace();

			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(pl25.getText());
			pl25.setText((n + 1) + "");
		} else if (event.getSource() == SC25) {
			try {
				battle.purchaseWeapon(2, battle.getOriginalLanes().get(1));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
				e.printStackTrace();

			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(sl25.getText());
			sl25.setText((n + 1) + "");
		} else if (event.getSource() == VS25) {
			try {
				battle.purchaseWeapon(3, battle.getOriginalLanes().get(1));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
				e.printStackTrace();

			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(vl25.getText());
			vl25.setText((n + 1) + "");
		} else if (event.getSource() == WT25) {
			try {
				battle.purchaseWeapon(4, battle.getOriginalLanes().get(1));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
				e.printStackTrace();

			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(wl25.getText());
			wl25.setText((n + 1) + "");
		}
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		render5(stage);
	}

	@FXML
	void handleLane35(ActionEvent event) {
		 AudioManager.playSoundEffect("shot.wav");
		if (event.getSource() == PC35) {
			try {
				battle.purchaseWeapon(1, battle.getOriginalLanes().get(2));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
				e.printStackTrace();

			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(pl35.getText());
			pl35.setText((n + 1) + "");
		} else if (event.getSource() == SC35) {
			try {
				battle.purchaseWeapon(2, battle.getOriginalLanes().get(2));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(sl35.getText());
			sl35.setText((n + 1) + "");
		} else if (event.getSource() == VS35) {
			try {
				battle.purchaseWeapon(3, battle.getOriginalLanes().get(2));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(vl35.getText());
			vl35.setText((n + 1) + "");
		} else if (event.getSource() == WT35) {
			try {
				battle.purchaseWeapon(4, battle.getOriginalLanes().get(2));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");

			}
			int n = Integer.parseInt(wl35.getText());
			wl35.setText((n + 1) + "");
		}
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		render5(stage);
	}

	@FXML
	void handleLane4(ActionEvent event) {
		 AudioManager.playSoundEffect("shot.wav");
		if (event.getSource() == PC4) {
			try {
				battle.purchaseWeapon(1, battle.getOriginalLanes().get(2));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
				e.printStackTrace();

			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(pl4.getText());
			pl4.setText((n + 1) + "");
		} else if (event.getSource() == SC4) {
			try {
				battle.purchaseWeapon(2, battle.getOriginalLanes().get(2));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(sl4.getText());
			sl4.setText((n + 1) + "");
		} else if (event.getSource() == VS4) {
			try {
				battle.purchaseWeapon(3, battle.getOriginalLanes().get(2));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(vl4.getText());
			vl4.setText((n + 1) + "");
		} else if (event.getSource() == WT4) {
			try {
				battle.purchaseWeapon(4, battle.getOriginalLanes().get(2));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");

			}
			int n = Integer.parseInt(wl4.getText());
			wl4.setText((n + 1) + "");
		}
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		render5(stage);
	}

	@FXML
	void handleLane5(ActionEvent event) {
		 AudioManager.playSoundEffect("shot.wav");
		if (event.getSource() == PC5) {
			try {
				battle.purchaseWeapon(1, battle.getOriginalLanes().get(2));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
				e.printStackTrace();

			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(pl5.getText());
			pl5.setText((n + 1) + "");
		} else if (event.getSource() == SC5) {
			try {
				battle.purchaseWeapon(2, battle.getOriginalLanes().get(2));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(sl5.getText());
			sl5.setText((n + 1) + "");
		} else if (event.getSource() == VS5) {
			try {
				battle.purchaseWeapon(3, battle.getOriginalLanes().get(2));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(vl5.getText());
			vl5.setText((n + 1) + "");
		} else if (event.getSource() == WT5) {
			try {
				battle.purchaseWeapon(4, battle.getOriginalLanes().get(2));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");

			}
			int n = Integer.parseInt(wl5.getText());
			wl5.setText((n + 1) + "");
		}
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		render5(stage);
	}

	@FXML
	void passTurnButton5Action(ActionEvent event) {
		 AudioManager.playSoundEffect("click.wav");
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		battle.passTurn();
		render5(stage);
		if (battle.isGameOver()) {
			try {
				System.out.println("hello: " + battle.isGameOver());
				changeScenes("GameOver.fxml", stage);
				AudioManager.playSoundEffect("gameover.wav");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void changeScenes(String fxml, Stage stage) throws Exception {
//		currentScene=fxml;
		FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		stage.setScene(scene);

	}

	public void playButtonAction(ActionEvent event) {
		 AudioManager.playSoundEffect("click.wav");
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		try {
			changeScenes("ModeScreen.fxml", stage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@FXML
	public void nextButtonAction(ActionEvent event) {
		 AudioManager.playSoundEffect("click.wav");
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		try {
			changeScenes("InstructionsScreen.fxml", stage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	public void showScoreAction() {
		finalScore.setText("Final score: " + battle.getScore());

	}

	@FXML
	public void easyButtonAction(ActionEvent event) {
		 AudioManager.playSoundEffect("click.wav");
		hardButton.setDisable(true);
		nextButton.setVisible(true);
		try {
			battle = new Battle(1, 0, 384, 3, 250);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	public void hardButtonAction(ActionEvent event) {
		 AudioManager.playSoundEffect("click.wav");
		easyButton.setDisable(true);
		nextButton.setVisible(true);
		try {
			battle = new Battle(1, 0, 390, 5, 125);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	public void startButtonAction(ActionEvent event) {
		 AudioManager.playSoundEffect("click.wav");
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		if (battle.getOriginalLanes().size() == 3) {
			try {
				changeScenes("3lanes.fxml", stage);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				changeScenes("5lanes.fxml", stage);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@FXML
	public void handleLane13(ActionEvent event) {
		 AudioManager.playSoundEffect("shot.wav");
		if (event.getSource() == PC1) {
			try {
				battle.purchaseWeapon(1, battle.getOriginalLanes().get(0));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
				e.printStackTrace();

			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
				e.printStackTrace();

			}
			int n = Integer.parseInt(pl1.getText());
			pl1.setText((n + 1) + "");
		} else if (event.getSource() == SC1) {
			try {
				battle.purchaseWeapon(2, battle.getOriginalLanes().get(0));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
				e.printStackTrace();

			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(sl1.getText());
			sl1.setText((n + 1) + "");
		} else if (event.getSource() == VS1) {
			try {
				battle.purchaseWeapon(3, battle.getOriginalLanes().get(0));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
				e.printStackTrace();

			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(vl1.getText());
			vl1.setText((n + 1) + "");
		} else if (event.getSource() == WT1) {
			try {
				battle.purchaseWeapon(4, battle.getOriginalLanes().get(0));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
				e.printStackTrace();

			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(wl1.getText());
			wl1.setText((n + 1) + "");
		}
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		render(stage);
	}

	@FXML
	void handleLane23(ActionEvent event) {
		 AudioManager.playSoundEffect("shot.wav");
		if (event.getSource() == PC2) {
			try {
				battle.purchaseWeapon(1, battle.getOriginalLanes().get(1));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
				e.printStackTrace();

			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(pl2.getText());
			pl2.setText((n + 1) + "");
		} else if (event.getSource() == SC2) {
			try {
				battle.purchaseWeapon(2, battle.getOriginalLanes().get(1));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
				e.printStackTrace();

			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(sl2.getText());
			sl2.setText((n + 1) + "");
		} else if (event.getSource() == VS2) {
			try {
				battle.purchaseWeapon(3, battle.getOriginalLanes().get(1));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
				e.printStackTrace();

			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(vl2.getText());
			vl2.setText((n + 1) + "");
		} else if (event.getSource() == WT2) {
			try {
				battle.purchaseWeapon(4, battle.getOriginalLanes().get(1));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
				e.printStackTrace();

			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(wl2.getText());
			wl2.setText((n + 1) + "");
		}
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		render(stage);
	}

	@FXML
	void handleLane33(ActionEvent event) {
		 AudioManager.playSoundEffect("shot.wav");
		if (event.getSource() == PC3) {
			try {
				battle.purchaseWeapon(1, battle.getOriginalLanes().get(2));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
				e.printStackTrace();

			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(pl3.getText());
			pl3.setText((n + 1) + "");
		} else if (event.getSource() == SC3) {
			try {
				battle.purchaseWeapon(2, battle.getOriginalLanes().get(2));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(sl3.getText());
			sl3.setText((n + 1) + "");
		} else if (event.getSource() == VS3) {
			try {
				battle.purchaseWeapon(3, battle.getOriginalLanes().get(2));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");
			}
			int n = Integer.parseInt(vl3.getText());
			vl3.setText((n + 1) + "");
		} else if (event.getSource() == WT3) {
			try {
				battle.purchaseWeapon(4, battle.getOriginalLanes().get(2));
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Not enough resources, " + battle.getResourcesGathered());
			} catch (InvalidLaneException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				showErrorWindow("Action done on an invalid lane");

			}
			int n = Integer.parseInt(wl3.getText());
			wl3.setText((n + 1) + "");
		}
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		render(stage);
	}

	@FXML
	public void passTurnButton3Action(ActionEvent event) {
		 AudioManager.playSoundEffect("click.wav");
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		battle.passTurn();
		render(stage);
		if (battle.isGameOver()) {
			try {

				System.out.println("hello: " + battle.isGameOver());
				changeScenes("GameOver.fxml", stage);
				AudioManager.playSoundEffect("gameover.wav");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void render(Stage stage) {
		if (battle.isGameOver()) {
			try {
				changeScenes("GameOver.fxml", stage);
				AudioManager.playSoundEffect("gameover.wav");
//				finalScore.setText("Score:" + battle.getScore());

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			lane13.getChildren().clear();
			lane23.getChildren().clear();
			lane33.getChildren().clear();
			scoreLabel.setText("Score: " + battle.getScore());
			turnLabel.setText("Turn: " + battle.getNumberOfTurns());
			phaseLabel.setText("Phase: " + battle.getBattlePhase());
			resourcesLabel.setText("Resources: " + battle.getResourcesGathered());
			for (int i = 0; i < battle.getOriginalLanes().size(); i++) {
				Lane l = battle.getOriginalLanes().get(i);
				if (!l.isLaneLost()) {
					PriorityQueue<Titan> titans = new PriorityQueue<>();
					titans.addAll(l.getTitans());

					while (!titans.isEmpty()) {
						Titan t = titans.poll();
						ImageView titanImage = new ImageView();
						VBox v = new VBox();
						Label h = new Label(t.getCurrentHealth() + "");
						h.setStyle("-fx-text-fill: white; -fx-font-weight: bold;");
						DropShadow dropShadow = new DropShadow();
				        dropShadow.setColor(Color.BLACK);
				        dropShadow.setRadius(8);
				        h.setEffect(dropShadow);

						v.setPrefHeight(80);
						v.setPrefWidth(40);
						if (t instanceof PureTitan){
							
							titanImage.setImage(new Image(getClass().getResourceAsStream("pure.jpg")));}
						else if (t instanceof ColossalTitan){
							
							titanImage.setImage(new Image(getClass().getResourceAsStream("colossal.jpg")));}
						else if (t instanceof ArmoredTitan){
							
							titanImage.setImage(new Image(getClass().getResourceAsStream("armored.jpg")));}
						else if (t instanceof AbnormalTitan){
							
							titanImage.setImage(new Image(getClass().getResourceAsStream("abnormal.jpg")));}
						titanImage.setFitHeight(50);
						titanImage.setFitWidth(30);

						double yrange = lane13.getPrefHeight() - v.getPrefHeight();
						double ypos = Math.random() * yrange;
						v.getChildren().add(h);
						v.getChildren().add(titanImage);

						v.setLayoutX(t.getDistance());
						v.setLayoutY(ypos);
						switch (i) {
						case (0):
							lane13.getChildren().add(v);
							break;
						case (1):
							lane23.getChildren().add(v);
							break;
						case (2):
							lane33.getChildren().add(v);
							break;
						}

					}
					switch (i) {
					case (0):
						wallDanger1.setText("Danger Level: " + l.getDangerLevel());
						wallHealth1.setText("Health: " + l.getLaneWall().getCurrentHealth());
						break;
					case (1):
						wallDanger2.setText("Danger Level: " + l.getDangerLevel());
						wallHealth2.setText("Health: " + l.getLaneWall().getCurrentHealth());
						break;
					case (2):
						wallDanger3.setText("Danger Level: " + l.getDangerLevel());
						wallHealth3.setText("Health: " + l.getLaneWall().getCurrentHealth());
						break;
					}
				} else {
					switch (i) {
					case (0):
						laneImage1.setVisible(false);
						// wallHealth1.setText("Health: " + "0");
						wallHealth1.setText("Health: " + l.getLaneWall().getCurrentHealth());
						System.out.print("lane1");
						break;
					case (1):
						laneImage2.setVisible(false);
						// wallHealth2.setText("Health: " + "0");
						wallHealth2.setText("Health: " + l.getLaneWall().getCurrentHealth());
						System.out.print("lane2");
						break;
					case (2):
						laneImage3.setVisible(false);
						// wallHealth3.setText("Health: " + "0");
						wallHealth3.setText("Health: " + l.getLaneWall().getCurrentHealth());
						System.out.print("lane3");
						break;
					}
				}
			}
		}
	}

	public void render5(Stage stage) {
		if (battle.isGameOver()) {
			try {
				changeScenes("GameOver.fxml", stage);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			lane15.getChildren().clear();
			lane25.getChildren().clear();
			lane35.getChildren().clear();
			lane4.getChildren().clear();
			lane5.getChildren().clear();
			scoreLabel5.setText("Score: " + battle.getScore());
			turnLabel5.setText("Turn: " + battle.getNumberOfTurns());
			phaseLabel5.setText("Phase: " + battle.getBattlePhase());
			resourcesLabel5.setText("Resources: " + battle.getResourcesGathered());
			for (int i = 0; i < battle.getOriginalLanes().size(); i++) {
				Lane l = battle.getOriginalLanes().get(i);
				if (!l.isLaneLost()) {
					PriorityQueue<Titan> titans = new PriorityQueue<>();
					titans.addAll(l.getTitans());

					while (!titans.isEmpty()) {
						Titan t = titans.poll();
						ImageView titanImage = new ImageView();
						VBox v = new VBox();
						Label h = new Label(t.getCurrentHealth() + "");
						h.setStyle("-fx-text-fill: white; -fx-font-weight: bold;");
						DropShadow dropShadow = new DropShadow();
				        dropShadow.setColor(Color.BLACK);
				        dropShadow.setRadius(8);
				        h.setEffect(dropShadow);
						v.setPrefHeight(80);
						v.setPrefWidth(40);
						if (t instanceof PureTitan)
							titanImage.setImage(new Image(getClass().getResourceAsStream("pure.jpg")));
						else if (t instanceof ColossalTitan)
							titanImage.setImage(new Image(getClass().getResourceAsStream("colossal.jpg")));
						else if (t instanceof ArmoredTitan)
							titanImage.setImage(new Image(getClass().getResourceAsStream("armored.jpg")));
						else if (t instanceof AbnormalTitan)
							titanImage.setImage(new Image(getClass().getResourceAsStream("abnormal.jpg")));
						titanImage.setFitHeight(50);
						titanImage.setFitWidth(30);

						double yrange = lane4.getPrefHeight() - v.getPrefHeight();
						double ypos = Math.random() * yrange;
						v.getChildren().add(h);
						v.getChildren().add(titanImage);

						v.setLayoutX(t.getDistance());
						v.setLayoutY(ypos);
						switch (i) {
						case (0):
							lane15.getChildren().add(v);
							break;
						case (1):
							lane25.getChildren().add(v);
							break;
						case (2):
							lane35.getChildren().add(v);
							break;
						case (3):
							lane4.getChildren().add(v);
							break;
						case (4):
							lane5.getChildren().add(v);
							break;
						}

					}
					switch (i) {
					case (0):
						wallDanger15.setText("Danger Level: " + l.getDangerLevel());
						wallHealth15.setText("Health: " + l.getLaneWall().getCurrentHealth());
						break;
					case (1):
						wallDanger25.setText("Danger Level: " + l.getDangerLevel());
						wallHealth25.setText("Health: " + l.getLaneWall().getCurrentHealth());
						break;
					case (2):
						wallDanger35.setText("Danger Level: " + l.getDangerLevel());
						wallHealth35.setText("Health: " + l.getLaneWall().getCurrentHealth());
						break;
					case (3):
						wallDanger4.setText("Danger Level: " + l.getDangerLevel());
						wallHealth4.setText("Health: " + l.getLaneWall().getCurrentHealth());
						break;
					case (4):
						wallDanger5.setText("Danger Level: " + l.getDangerLevel());
						wallHealth5.setText("Health: " + l.getLaneWall().getCurrentHealth());
						break;
					}
				} else {
					switch (i) {
					case (0):
						laneImage15.setVisible(false);
						// wallHealth1.setText("Health: " + "0");
						wallHealth15.setText("Health: " + l.getLaneWall().getCurrentHealth());
						System.out.print("lane1");
						break;
					case (1):
						laneImage25.setVisible(false);
						// wallHealth2.setText("Health: " + "0");
						wallHealth25.setText("Health: " + l.getLaneWall().getCurrentHealth());
						System.out.print("lane2");
						break;
					case (2):
						laneImage35.setVisible(false);
						// wallHealth3.setText("Health: " + "0");
						wallHealth35.setText("Health: " + l.getLaneWall().getCurrentHealth());
						System.out.print("lane3");
						break;
					case (3):
						laneImage4.setVisible(false);
						// wallHealth3.setText("Health: " + "0");
						wallHealth4.setText("Health: " + l.getLaneWall().getCurrentHealth());
						System.out.print("lane4");
						break;
					case (4):
						laneImage5.setVisible(false);
						// wallHealth3.setText("Health: " + "0");
						wallHealth5.setText("Health: " + l.getLaneWall().getCurrentHealth());
						System.out.print("lane5");
						break;
					}
				}
			}
		}
	}

	@FXML
	void playAgainAction(ActionEvent event) {
		 AudioManager.playSoundEffect("click.wav");
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		try {
			changeScenes("First.fxml", stage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
