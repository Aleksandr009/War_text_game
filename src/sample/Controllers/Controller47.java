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

public class Controller47 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but_v_s;

    @FXML
    private Button but_d_k_b;

    @FXML
    void initialize() {
        but_v_s.setOnAction(event -> {
            but_v_s.getScene().getWindow().hide();

            FXMLLoader loader56 = new FXMLLoader();
            loader56.setLocation(getClass().getResource("/sample/samples/sample48.fxml"));

            try {
                loader56.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root56 = loader56.getRoot();
            Stage stage56 = new Stage();
            stage56.setScene(new Scene(root56));
            stage56.show();
        });


        but_d_k_b.setOnAction(event -> {
            but_d_k_b.getScene().getWindow().hide();

            FXMLLoader loader58 = new FXMLLoader();
            loader58.setLocation(getClass().getResource("/sample/samples/sample49.fxml"));

            try {
                loader58.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root58 = loader58.getRoot();
            Stage stage58 = new Stage();
            stage58.setScene(new Scene(root58));
            stage58.show();
        });
    }
}

