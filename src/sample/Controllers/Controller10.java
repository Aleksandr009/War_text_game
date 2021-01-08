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
public class Controller10 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but10_d;

    @FXML
    void initialize() {
        but10_d.setOnAction(event -> {
            but10_d.getScene().getWindow().hide();

            FXMLLoader loader15 = new FXMLLoader();
            loader15.setLocation(getClass().getResource("/sample/samples/sample11.fxml"));

            try {
                loader15.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root15 = loader15.getRoot();
            Stage stage15 = new Stage();
            stage15.setScene(new Scene(root15));
            stage15.show();
        });
    }
}

