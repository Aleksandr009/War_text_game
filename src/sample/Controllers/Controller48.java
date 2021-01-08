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

public class Controller48 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but9_m;

    @FXML
    void initialize() {
        but9_m.setOnAction(event -> {
            but9_m.getScene().getWindow().hide();

            FXMLLoader loader57 = new FXMLLoader();
            loader57.setLocation(getClass().getResource("/sample/sample.fxml"));

            try {
                loader57.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root57 = loader57.getRoot();
            Stage stage57 = new Stage();
            stage57.setScene(new Scene(root57));
            stage57.show();
        });
    }
}

