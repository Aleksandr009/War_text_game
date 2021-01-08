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

public class Controller52 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but27_d;

    @FXML
    void initialize() {
        but27_d.setOnAction(event -> {
            but27_d.getScene().getWindow().hide();

            FXMLLoader loader62 = new FXMLLoader();
            loader62.setLocation(getClass().getResource("/sample/samples/sample53.fxml"));

            try {
                loader62.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root62 = loader62.getRoot();
            Stage stage62 = new Stage();
            stage62.setScene(new Scene(root62));
            stage62.show();
        });
    }
}

