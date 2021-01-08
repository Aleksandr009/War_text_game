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

public class Controller30 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but19_d;

    @FXML
    void initialize() {
        but19_d.setOnAction(event -> {
            but19_d.getScene().getWindow().hide();

            FXMLLoader loader35 = new FXMLLoader();
            loader35.setLocation(getClass().getResource("/sample/samples/sample31.fxml"));

            try {
                loader35.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root35 = loader35.getRoot();
            Stage stage35 = new Stage();
            stage35.setScene(new Scene(root35));
            stage35.show();
        });
    }
}

