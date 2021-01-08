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
public class Controller4 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but4_d;

    @FXML
    void initialize() {
        but4_d.setOnAction(event -> {
            but4_d.getScene().getWindow().hide();

            FXMLLoader loader10 = new FXMLLoader();
            loader10.setLocation(getClass().getResource("/sample/samples/sample6.fxml"));

            try {
                loader10.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root10 = loader10.getRoot();
            Stage stage10 = new Stage();
            stage10.setScene(new Scene(root10));
            stage10.show();
        });
    }
}

