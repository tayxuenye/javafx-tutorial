import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * A GUI for Duke using FXML.
 */
public class Main extends Application {

    private Duke duke = new Duke();

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/MainWindow.fxml"));
            AnchorPane root = fxmlLoader.load();

            MainWindow mainWindow = fxmlLoader.getController();
            mainWindow.setDuke(duke);
            mainWindow.setupStage(root);  // ChatGPT assisted: set up the Stage with the root node

            mainWindow.show();  // ChatGPT assisted: Show the Stage
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
