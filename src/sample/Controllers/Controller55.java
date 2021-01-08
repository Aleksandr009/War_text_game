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

public class Controller55 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but28_d;

    @FXML
    void initialize() {
        but28_d.setOnAction(event -> {
            but28_d.getScene().getWindow().hide();

            FXMLLoader loader65 = new FXMLLoader();
            loader65.setLocation(getClass().getResource("/sample/samples/sample56.fxml"));

            try {
                loader65.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root65 = loader65.getRoot();
            Stage stage65 = new Stage();
            stage65.setScene(new Scene(root65));
            stage65.show();
        });
    }
}

