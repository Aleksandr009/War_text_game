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

public class Controller29 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but4_m;

    @FXML
    void initialize() {
        but4_m.setOnAction(event -> {
            but4_m.getScene().getWindow().hide();

            FXMLLoader loader34 = new FXMLLoader();
            loader34.setLocation(getClass().getResource("/sample/sample.fxml"));

            try {
                loader34.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root34 = loader34.getRoot();
            Stage stage34 = new Stage();
            stage34.setScene(new Scene(root34));
            stage34.show();
        });
    }
}

