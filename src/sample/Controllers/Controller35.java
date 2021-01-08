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

public class Controller35 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but21_d;

    @FXML
    void initialize() {
        but21_d.setOnAction(event -> {
            but21_d.getScene().getWindow().hide();

            FXMLLoader loader42 = new FXMLLoader();
            loader42.setLocation(getClass().getResource("/sample/samples/sample36.fxml"));

            try {
                loader42.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root42 = loader42.getRoot();
            Stage stage42 = new Stage();
            stage42.setScene(new Scene(root42));
            stage42.show();
        });
    }
}


