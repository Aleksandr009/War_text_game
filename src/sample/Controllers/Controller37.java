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

public class Controller37 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but6_m;

    @FXML
    void initialize() {
        but6_m.setOnAction(event -> {
            but6_m.getScene().getWindow().hide();

            FXMLLoader loader44 = new FXMLLoader();
            loader44.setLocation(getClass().getResource("/sample/sample.fxml"));

            try {
                loader44.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root44 = loader44.getRoot();
            Stage stage44 = new Stage();
            stage44.setScene(new Scene(root44));
            stage44.show();
        });
    }
}

