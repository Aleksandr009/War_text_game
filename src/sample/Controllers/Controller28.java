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

public class Controller28 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but_z_v_d;

    @FXML
    private Button but_k_g;

    @FXML
    void initialize() {
        but_z_v_d.setOnAction(event -> {
            but_z_v_d.getScene().getWindow().hide();

            FXMLLoader loader33 = new FXMLLoader();
            loader33.setLocation(getClass().getResource("/sample/samples/sample29.fxml"));

            try {
                loader33.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root33 = loader33.getRoot();
            Stage stage33 = new Stage();
            stage33.setScene(new Scene(root33));
            stage33.show();
        });

        but_k_g.setOnAction(event -> {
            but_k_g.getScene().getWindow().hide();

            FXMLLoader loader35 = new FXMLLoader();
            loader35.setLocation(getClass().getResource("/sample/samples/sample30.fxml"));

            try {
                loader35.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root35 = loader35.getRoot();
            Stage stage35 = new Stage();
            stage35.setScene(new Scene(root35));
            stage35.show();
        });
    }
}

