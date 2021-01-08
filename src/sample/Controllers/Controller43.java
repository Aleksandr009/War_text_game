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

public class Controller43 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but24_d;

    @FXML
    void initialize() {
        but24_d.setOnAction(event -> {
            but24_d.getScene().getWindow().hide();

            FXMLLoader loader52 = new FXMLLoader();
            loader52.setLocation(getClass().getResource("/sample/samples/sample44.fxml"));

            try {
                loader52.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root52 = loader52.getRoot();
            Stage stage52 = new Stage();
            stage52.setScene(new Scene(root52));
            stage52.show();
        });
    }
}

