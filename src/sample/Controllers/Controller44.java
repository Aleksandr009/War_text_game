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

public class Controller44 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but_o_y;

    @FXML
    private Button but_o_s;

    @FXML
    void initialize() {
        but_o_y.setOnAction(event -> {
            but_o_y.getScene().getWindow().hide();

            FXMLLoader loader53 = new FXMLLoader();
            loader53.setLocation(getClass().getResource("/sample/samples/sample45.fxml"));

            try {
                loader53.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root53 = loader53.getRoot();
            Stage stage53 = new Stage();
            stage53.setScene(new Scene(root53));
            stage53.show();
        });


        but_o_s.setOnAction(event -> {
            but_o_s.getScene().getWindow().hide();

            FXMLLoader loader54 = new FXMLLoader();
            loader54.setLocation(getClass().getResource("/sample/samples/sample46.fxml"));

            try {
                loader54.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root54 = loader54.getRoot();
            Stage stage54 = new Stage();
            stage54.setScene(new Scene(root54));
            stage54.show();
        });
    }
}

