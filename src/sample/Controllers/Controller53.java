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

public class Controller53 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but_n_s;

    @FXML
    private Button but_p_t;

    @FXML
    void initialize() {
        but_n_s.setOnAction(event -> {
            but_n_s.getScene().getWindow().hide();

            FXMLLoader loader63 = new FXMLLoader();
            loader63.setLocation(getClass().getResource("/sample/samples/sample54.fxml"));

            try {
                loader63.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root63 = loader63.getRoot();
            Stage stage63 = new Stage();
            stage63.setScene(new Scene(root63));
            stage63.show();
        });


        but_p_t.setOnAction(event -> {
            but_p_t.getScene().getWindow().hide();

            FXMLLoader loader65 = new FXMLLoader();
            loader65.setLocation(getClass().getResource("/sample/samples/sample55.fxml"));

            try {
                loader65.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root65 = loader65.getRoot();
            Stage stage65 = new Stage();
            stage65.setScene(new Scene(root65));
            stage65.show();
        });
    }
}

