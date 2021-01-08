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

public class Controller36 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but_gla;

    @FXML
    private Button but_obo;

    @FXML
    void initialize() {
        but_gla.setOnAction(event -> {
            but_gla.getScene().getWindow().hide();

            FXMLLoader loader43 = new FXMLLoader();
            loader43.setLocation(getClass().getResource("/sample/samples/sample37.fxml"));

            try {
                loader43.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root43 = loader43.getRoot();
            Stage stage43 = new Stage();
            stage43.setScene(new Scene(root43));
            stage43.show();
        });


        but_obo.setOnAction(event -> {
            but_obo.getScene().getWindow().hide();

            FXMLLoader loader45 = new FXMLLoader();
            loader45.setLocation(getClass().getResource("/sample/samples/sample38.fxml"));

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
    }
}

