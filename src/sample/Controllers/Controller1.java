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

public class Controller1 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but1_d;

    @FXML
    void initialize() {
        but1_d.setOnAction(event -> {
            but1_d.getScene().getWindow().hide();

            FXMLLoader loader6 = new FXMLLoader();
            loader6.setLocation(getClass().getResource("/sample/samples/sample2.fxml"));

            try {
                loader6.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root6 = loader6.getRoot();
            Stage stage6 = new Stage();
            stage6.setScene(new Scene(root6));
            stage6.show();
        });
    }
}

