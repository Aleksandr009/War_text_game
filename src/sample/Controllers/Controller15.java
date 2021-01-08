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
public class Controller15 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but1_m;

    @FXML
    void initialize() {
        but1_m.setOnAction(event -> {
            but1_m.getScene().getWindow().hide();

            FXMLLoader loader20 = new FXMLLoader();
            loader20.setLocation(getClass().getResource("/sample/sample.fxml"));

            try {
                loader20.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root20 = loader20.getRoot();
            Stage stage20 = new Stage();
            stage20.setScene(new Scene(root20));
            stage20.show();
        });
    }
}

