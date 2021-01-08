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

public class Controller45 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but8_m;

    @FXML
    void initialize() {
        but8_m.setOnAction(event -> {
            but8_m.getScene().getWindow().hide();

            FXMLLoader loader54 = new FXMLLoader();
            loader54.setLocation(getClass().getResource("/sample/sample.fxml"));

            try {
                loader54.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root54 = loader54.getRoot();
            Stage stage54 = new Stage();
            stage54.setScene(new Scene(root54));
            stage54.show();
        });
    }
}

