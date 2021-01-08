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

public class Controller50 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but_v_p;

    @FXML
    private Button but_str;

    @FXML
    void initialize() {
        but_v_p.setOnAction(event -> {
            but_v_p.getScene().getWindow().hide();

            FXMLLoader loader59 = new FXMLLoader();
            loader59.setLocation(getClass().getResource("/sample/samples/sample51.fxml"));

            try {
                loader59.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root59 = loader59.getRoot();
            Stage stage59 = new Stage();
            stage59.setScene(new Scene(root59));
            stage59.show();
        });


        but_str.setOnAction(event -> {
            but_str.getScene().getWindow().hide();

            FXMLLoader loader61 = new FXMLLoader();
            loader61.setLocation(getClass().getResource("/sample/samples/sample52.fxml"));

            try {
                loader61.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root61 = loader61.getRoot();
            Stage stage61 = new Stage();
            stage61.setScene(new Scene(root61));
            stage61.show();
        });
    }
}

