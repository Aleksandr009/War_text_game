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

public class Controller24 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but3_m;

    @FXML
    void initialize() {
        but3_m.setOnAction(event -> {
            but3_m.getScene().getWindow().hide();

            FXMLLoader loader29 = new FXMLLoader();
            loader29.setLocation(getClass().getResource("/sample/sample.fxml"));

            try {
                loader29.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root29 = loader29.getRoot();
            Stage stage29 = new Stage();
            stage29.setScene(new Scene(root29));
            stage29.show();
        });
    }
}

