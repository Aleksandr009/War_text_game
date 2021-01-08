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

public class Controller16 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but2_m;

    @FXML
    void initialize() {
        but2_m.setOnAction(event -> {
            but2_m.getScene().getWindow().hide();

            FXMLLoader loader21 = new FXMLLoader();
            loader21.setLocation(getClass().getResource("/sample/sample.fxml"));

            try {
                loader21.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root21 = loader21.getRoot();
            Stage stage21 = new Stage();
            stage21.setScene(new Scene(root21));
            stage21.show();
        });
    }
}

