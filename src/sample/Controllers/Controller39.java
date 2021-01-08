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

public class Controller39 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but2_2_d;

    @FXML
    private Button but3_3_d;

    @FXML
    void initialize() {
        but2_2_d.setOnAction(event -> {
            but2_2_d.getScene().getWindow().hide();

            FXMLLoader loader47 = new FXMLLoader();
            loader47.setLocation(getClass().getResource("/sample/samples/sample40.fxml"));

            try {
                loader47.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root47 = loader47.getRoot();
            Stage stage47 = new Stage();
            stage47.setScene(new Scene(root47));
            stage47.show();
        });

        but3_3_d.setOnAction(event -> {
            but3_3_d.getScene().getWindow().hide();

            FXMLLoader loader49 = new FXMLLoader();
            loader49.setLocation(getClass().getResource("/sample/samples/sample41.fxml"));

            try {
                loader49.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root49 = loader49.getRoot();
            Stage stage49 = new Stage();
            stage49.setScene(new Scene(root49));
            stage49.show();
        });
    }
}

