package application;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;



public class Oving1b extends Application {
@Override
public void start(Stage primaryStage) throws IOException{
	Parent root = FXMLLoader.load(Oving1b.class.getResource("Example1.fxml"));
	primaryStage.setScene(new Scene(root));
	primaryStage.show();
}

public static void main(String[] args) {
	launch(args);
}
}
