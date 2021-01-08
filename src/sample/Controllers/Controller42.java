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

public class Controller42 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but23_d;

    @FXML
    void initialize() {
        but23_d.setOnAction(event -> {
            but23_d.getScene().getWindow().hide();

            FXMLLoader loader51 = new FXMLLoader();
            loader51.setLocation(getClass().getResource("/sample/samples/sample43.fxml"));

            try {
                loader51.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root51 = loader51.getRoot();
            Stage stage51 = new Stage();
            stage51.setScene(new Scene(root51));
            stage51.show();
        });
    }
}

