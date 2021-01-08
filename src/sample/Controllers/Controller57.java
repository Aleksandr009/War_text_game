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

public class Controller57 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but12_m;

    @FXML
    void initialize() {
        but12_m.setOnAction(event -> {
            but12_m.getScene().getWindow().hide();

            FXMLLoader loader67 = new FXMLLoader();
            loader67.setLocation(getClass().getResource("/sample/sample.fxml"));

            try {
                loader67.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root67 = loader67.getRoot();
            Stage stage67 = new Stage();
            stage67.setScene(new Scene(root67));
            stage67.show();
        });
    }
}

