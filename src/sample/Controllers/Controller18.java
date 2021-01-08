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

// Сюжетная ветвь А
public class Controller18 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but17_d;

    @FXML
    void initialize() {
        but17_d.setOnAction(event -> {
            but17_d.getScene().getWindow().hide();

            FXMLLoader loader23 = new FXMLLoader();
            loader23.setLocation(getClass().getResource("/sample/samples/sample19.fxml"));

            try {
                loader23.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root23 = loader23.getRoot();
            Stage stage23 = new Stage();
            stage23.setScene(new Scene(root23));
            stage23.show();
        });
    }
}

