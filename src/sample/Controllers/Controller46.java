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

public class Controller46 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but25_d;

    @FXML
    void initialize() {
        but25_d.setOnAction(event -> {
            but25_d.getScene().getWindow().hide();

            FXMLLoader loader55 = new FXMLLoader();
            loader55.setLocation(getClass().getResource("/sample/samples/sample47.fxml"));

            try {
                loader55.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root55 = loader55.getRoot();
            Stage stage55 = new Stage();
            stage55.setScene(new Scene(root55));
            stage55.show();
        });
    }
}

