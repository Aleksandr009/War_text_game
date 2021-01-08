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

public class Controller54 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but11_m;

    @FXML
    void initialize() {
        but11_m.setOnAction(event -> {
            but11_m.getScene().getWindow().hide();

            FXMLLoader loader64 = new FXMLLoader();
            loader64.setLocation(getClass().getResource("/sample/sample.fxml"));

            try {
                loader64.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root64 = loader64.getRoot();
            Stage stage64 = new Stage();
            stage64.setScene(new Scene(root64));
            stage64.show();
        });
    }
}

