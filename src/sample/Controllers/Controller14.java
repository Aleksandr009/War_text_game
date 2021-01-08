package sample.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

// Сюжетная ветвь Б
public class Controller14 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but15_d;

    @FXML
    void initialize() {
        but15_d.setOnAction(event -> {
            but15_d.getScene().getWindow().hide();

            FXMLLoader loader19 = new FXMLLoader();
            loader19.setLocation(getClass().getResource("/sample/samples/sample15.fxml"));

            try {
                loader19.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root19 = loader19.getRoot();
            Stage stage19 = new Stage();
            stage19.setScene(new Scene(root19));
            stage19.show();
        });
    }
}

