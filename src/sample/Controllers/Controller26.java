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

public class Controller26 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but17_d;

    @FXML
    void initialize() {
        but17_d.setOnAction(event -> {
            but17_d.getScene().getWindow().hide();

            FXMLLoader loader31 = new FXMLLoader();
            loader31.setLocation(getClass().getResource("/sample/samples/sample27.fxml"));

            try {
                loader31.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root31 = loader31.getRoot();
            Stage stage31 = new Stage();
            stage31.setScene(new Scene(root31));
            stage31.show();
        });
    }
}

