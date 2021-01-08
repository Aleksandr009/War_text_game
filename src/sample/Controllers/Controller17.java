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
public class Controller17 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but16_d;

    @FXML
    void initialize() {
        but16_d.setOnAction(event -> {
            but16_d.getScene().getWindow().hide();

            FXMLLoader loader22 = new FXMLLoader();
            loader22.setLocation(getClass().getResource("/sample/samples/sample18.fxml"));

            try {
                loader22.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root22 = loader22.getRoot();
            Stage stage22 = new Stage();
            stage22.setScene(new Scene(root22));
            stage22.show();
        });
    }
}

