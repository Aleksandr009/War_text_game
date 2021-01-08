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

public class Controller33 {

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

            FXMLLoader loader40 = new FXMLLoader();
            loader40.setLocation(getClass().getResource("/sample/sample.fxml"));

            try {
                loader40.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root40 = loader40.getRoot();
            Stage stage40 = new Stage();
            stage40.setScene(new Scene(root40));
            stage40.show();
        });
    }
}

