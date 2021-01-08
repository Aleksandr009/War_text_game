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
public class Controller13 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but14_d;

    @FXML
    void initialize() {
        but14_d.setOnAction(event -> {
            but14_d.getScene().getWindow().hide();

            FXMLLoader loader18 = new FXMLLoader();
            loader18.setLocation(getClass().getResource("/sample/samples/sample14.fxml"));

            try {
                loader18.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root18 = loader18.getRoot();
            Stage stage18 = new Stage();
            stage18.setScene(new Scene(root18));
            stage18.show();
        });
    }
}

