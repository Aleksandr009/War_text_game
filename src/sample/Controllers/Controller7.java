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

// Ветвь Б
public class Controller7 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but7_d;

    @FXML
    void initialize() {
        but7_d.setOnAction(event -> {
            but7_d.getScene().getWindow().hide();

            FXMLLoader loader12 = new FXMLLoader();
            loader12.setLocation(getClass().getResource("/sample/samples/sample8.fxml"));

            try {
                loader12.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root12 = loader12.getRoot();
            Stage stage12 = new Stage();
            stage12.setScene(new Scene(root12));
            stage12.show();
        });
    }
}

