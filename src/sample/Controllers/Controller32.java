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

public class Controller32 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button d;

    @FXML
    private Button b;

    @FXML
    private Button o;

    @FXML
    void initialize() {
        b.setOnAction(event -> {
            b.getScene().getWindow().hide();

            FXMLLoader loader37 = new FXMLLoader();
            loader37.setLocation(getClass().getResource("/sample/samples/sample33.fxml"));

            try {
                loader37.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root37 = loader37.getRoot();
            Stage stage37 = new Stage();
            stage37.setScene(new Scene(root37));
            stage37.show();
        });


        o.setOnAction(event -> {
            o.getScene().getWindow().hide();

            FXMLLoader loader38 = new FXMLLoader();
            loader38.setLocation(getClass().getResource("/sample/samples/sample34.fxml"));

            try {
                loader38.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root38 = loader38.getRoot();
            Stage stage38 = new Stage();
            stage38.setScene(new Scene(root38));
            stage38.show();
        });


        d.setOnAction(event -> {
            d.getScene().getWindow().hide();

            FXMLLoader loader39 = new FXMLLoader();
            loader39.setLocation(getClass().getResource("/sample/samples/sample35.fxml"));

            try {
                loader39.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root39 = loader39.getRoot();
            Stage stage39 = new Stage();
            stage39.setScene(new Scene(root39));
            stage39.show();
        });
    }
}

