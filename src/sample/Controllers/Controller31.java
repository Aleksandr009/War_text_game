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

public class Controller31 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but20_d;

    @FXML
    void initialize() {
        but20_d.setOnAction(event -> {
            but20_d.getScene().getWindow().hide();

            FXMLLoader loader36 = new FXMLLoader();
            loader36.setLocation(getClass().getResource("/sample/samples/sample32.fxml"));

            try {
                loader36.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root36 = loader36.getRoot();
            Stage stage36 = new Stage();
            stage36.setScene(new Scene(root36));
            stage36.show();
        });
    }
}

