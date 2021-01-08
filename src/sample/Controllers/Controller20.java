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

public class Controller20 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but_y;

    @FXML
    private Button but_p;

    @FXML
    void initialize() {
        but_y.setOnAction(event -> {
            but_y.getScene().getWindow().hide();

            FXMLLoader loader25 = new FXMLLoader();
            loader25.setLocation(getClass().getResource("/sample/samples/sample21.fxml"));

            try {
                loader25.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root25 = loader25.getRoot();
            Stage stage25 = new Stage();
            stage25.setScene(new Scene(root25));
            stage25.show();
        });

        but_p.setOnAction(event -> {
            but_p.getScene().getWindow().hide();

            FXMLLoader loader28 = new FXMLLoader();
            loader28.setLocation(getClass().getResource("/sample/samples/sample24.fxml"));

            try {
                loader28.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root28 = loader28.getRoot();
            Stage stage28 = new Stage();
            stage28.setScene(new Scene(root28));
            stage28.show();
        });
    }
}

