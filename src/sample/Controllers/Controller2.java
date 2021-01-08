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

public class Controller2 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but3_d;

    @FXML
    void initialize() {
        but3_d.setOnAction(event -> {
            but3_d.getScene().getWindow().hide();

            FXMLLoader loader7 = new FXMLLoader();
            loader7.setLocation(getClass().getResource("/sample/samples/sample3.fxml"));

            try {
                loader7.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root7 = loader7.getRoot();
            Stage stage7 = new Stage();
            stage7.setScene(new Scene(root7));
            stage7.show();
        });
    }
}

