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

public class Controller41 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but22_d;

    @FXML
    void initialize() {
        but22_d.setOnAction(event -> {
            but22_d.getScene().getWindow().hide();

            FXMLLoader loader50 = new FXMLLoader();
            loader50.setLocation(getClass().getResource("/sample/samples/sample42.fxml"));

            try {
                loader50.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root50 = loader50.getRoot();
            Stage stage50 = new Stage();
            stage50.setScene(new Scene(root50));
            stage50.show();
        });
    }
}

