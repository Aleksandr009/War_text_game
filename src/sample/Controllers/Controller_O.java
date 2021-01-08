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

public class Controller_O {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but1_n;

    @FXML
    void initialize() {
        but1_n.setOnAction(event -> {
            but1_n.getScene().getWindow().hide();

            FXMLLoader loader4 = new FXMLLoader();
            loader4.setLocation(getClass().getResource("/sample/sample.fxml"));

            try {
                loader4.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root4 = loader4.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root4));
            stage.show();
        });
    }
}

