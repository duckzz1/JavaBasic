package fuck;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;


public class Fuck extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("Shit.fxml")), 800, 800);

//        Scene scene = new Scene(new Pane(), 800, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
