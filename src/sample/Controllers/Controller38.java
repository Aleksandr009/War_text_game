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

public class Controller38 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but_1_d;

    @FXML
    private Button but_2_d;

    @FXML
    private Button but_3_d;

    @FXML
    void initialize() {
        but_1_d.setOnAction(event -> {
            but_1_d.getScene().getWindow().hide();

            FXMLLoader loader45 = new FXMLLoader();
            loader45.setLocation(getClass().getResource("/sample/samples/sample39.fxml"));

            try {
                loader45.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root45 = loader45.getRoot();
            Stage stage45 = new Stage();
            stage45.setScene(new Scene(root45));
            stage45.show();
        });


        but_2_d.setOnAction(event -> {
            but_2_d.getScene().getWindow().hide();

            FXMLLoader loader46 = new FXMLLoader();
            loader46.setLocation(getClass().getResource("/sample/samples/sample40.fxml"));

            try {
                loader46.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root46 = loader46.getRoot();
            Stage stage46 = new Stage();
            stage46.setScene(new Scene(root46));
            stage46.show();
        });


        but_3_d.setOnAction(event -> {
            but_3_d.getScene().getWindow().hide();

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

