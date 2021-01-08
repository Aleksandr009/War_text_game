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

public class Controller40 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but7_m;

    @FXML
    void initialize() {
        but7_m.setOnAction(event -> {
            but7_m.getScene().getWindow().hide();

            FXMLLoader loader48 = new FXMLLoader();
            loader48.setLocation(getClass().getResource("/sample/sample.fxml"));

            try {
                loader48.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root48 = loader48.getRoot();
            Stage stage48 = new Stage();
            stage48.setScene(new Scene(root48));
            stage48.show();
        });
    }
}

