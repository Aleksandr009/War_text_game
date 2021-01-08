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

// Время 22:52, 1 января в пятницу 2021 года создал все окна, контроллеры и основной сюжет

public class Controller56 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but29_d;

    @FXML
    void initialize() {
        but29_d.setOnAction(event -> {
            but29_d.getScene().getWindow().hide();

            FXMLLoader loader66 = new FXMLLoader();
            loader66.setLocation(getClass().getResource("/sample/samples/sample57.fxml"));

            try {
                loader66.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root66 = loader66.getRoot();
            Stage stage66 = new Stage();
            stage66.setScene(new Scene(root66));
            stage66.show();
        });
    }
}

