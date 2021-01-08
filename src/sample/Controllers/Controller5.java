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

// Сюжетная ветвь Б
public class Controller5 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but5_d;

    @FXML
    void initialize() {
        but5_d.setOnAction(event -> {
            but5_d.getScene().getWindow().hide();

            FXMLLoader loader11 = new FXMLLoader();
            loader11.setLocation(getClass().getResource("/sample/samples/sample7.fxml"));

            try {
                loader11.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root11 = loader11.getRoot();
            Stage stage11 = new Stage();
            stage11.setScene(new Scene(root11));
            stage11.show();
        });
    }
}

