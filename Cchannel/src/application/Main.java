package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private AnchorPane anchorPanePrincipal;
	
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("VistaCchanel.fxml"));
		
		anchorPanePrincipal = (AnchorPane) loader.load();
		primaryStage.setTitle("WELCOME TO THE UNIVERSITY");
		primaryStage.setScene(new Scene(anchorPanePrincipal));
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
