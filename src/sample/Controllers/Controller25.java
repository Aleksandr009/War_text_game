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

public class Controller25 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but16_d;

    @FXML
    void initialize() {
        but16_d.setOnAction(event -> {
            but16_d.getScene().getWindow().hide();

            FXMLLoader loader30 = new FXMLLoader();
            loader30.setLocation(getClass().getResource("/sample/samples/sample26.fxml"));

            try {
                loader30.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root30 = loader30.getRoot();
            Stage stage30 = new Stage();
            stage30.setScene(new Scene(root30));
            stage30.show();
        });
    }
}

