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
public class Controller9 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but9_d;

    @FXML
    void initialize() {
        but9_d.setOnAction(event -> {
            but9_d.getScene().getWindow().hide();

            FXMLLoader loader14 = new FXMLLoader();
            loader14.setLocation(getClass().getResource("/sample/samples/sample10.fxml"));

            try {
                loader14.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root14 = loader14.getRoot();
            Stage stage14 = new Stage();
            stage14.setScene(new Scene(root14));
            stage14.show();
        });
    }
}

