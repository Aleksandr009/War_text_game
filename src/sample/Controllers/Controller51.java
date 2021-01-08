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

public class Controller51 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but10_m;

    @FXML
    void initialize() {
        but10_m.setOnAction(event -> {
            but10_m.getScene().getWindow().hide();

            FXMLLoader loader60 = new FXMLLoader();
            loader60.setLocation(getClass().getResource("/sample/sample.fxml"));

            try {
                loader60.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root60 = loader60.getRoot();
            Stage stage60 = new Stage();
            stage60.setScene(new Scene(root60));
            stage60.show();
        });
    }
}

