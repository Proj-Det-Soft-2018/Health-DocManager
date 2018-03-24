package main;
import java.io.IOException;
import java.net.URL;

import org.apache.log4j.Logger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static final Logger logger = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
        launch(args);
	}
	
	@Override
	public void start(Stage palco) {
		URL arquivoFxml = this.getClass().getResource("/view/tela_principal.fxml");
		
		Parent fxmlParent;
		try {
			fxmlParent = FXMLLoader.load(arquivoFxml);
			palco.setScene(new Scene(fxmlParent, 940, 570));
			palco.setTitle("DocManager");		
			palco.show();
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}
	}
}