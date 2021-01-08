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

public class Controller49 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but26_d;

    @FXML
    void initialize() {
        but26_d.setOnAction(event -> {
            but26_d.getScene().getWindow().hide();

            FXMLLoader loader58 = new FXMLLoader();
            loader58.setLocation(getClass().getResource("/sample/samples/sample50.fxml"));

            try {
                loader58.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root58 = loader58.getRoot();
            Stage stage58 = new Stage();
            stage58.setScene(new Scene(root58));
            stage58.show();
        });
    }
}

