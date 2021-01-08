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

public class Controller27 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but18_d;

    @FXML
    void initialize() {
        but18_d.setOnAction(event -> {
            but18_d.getScene().getWindow().hide();

            FXMLLoader loader32 = new FXMLLoader();
            loader32.setLocation(getClass().getResource("/sample/samples/sample28.fxml"));

            try {
                loader32.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root32 = loader32.getRoot();
            Stage stage32 = new Stage();
            stage32.setScene(new Scene(root32));
            stage32.show();
        });
    }
}

