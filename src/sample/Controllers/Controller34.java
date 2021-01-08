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

public class Controller34 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but5_m;

    @FXML
    void initialize() {
        but5_m.setOnAction(event -> {
            but5_m.getScene().getWindow().hide();

            FXMLLoader loader41 = new FXMLLoader();
            loader41.setLocation(getClass().getResource("/sample/sample.fxml"));

            try {
                loader41.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root41 = loader41.getRoot();
            Stage stage41 = new Stage();
            stage41.setScene(new Scene(root41));
            stage41.show();
        });
    }
}

