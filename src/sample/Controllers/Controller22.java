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

public class Controller22 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but20_d;

    @FXML
    void initialize() {
        but20_d.setOnAction(event -> {
            but20_d.getScene().getWindow().hide();

            FXMLLoader loader27 = new FXMLLoader();
            loader27.setLocation(getClass().getResource("/sample/samples/sample23.fxml"));

            try {
                loader27.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root27 = loader27.getRoot();
            Stage stage27 = new Stage();
            stage27.setScene(new Scene(root27));
            stage27.show();
        });
    }
}

