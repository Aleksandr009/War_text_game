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

public class Controller11 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but11_y;

    @FXML
    private Button but12_p;

    @FXML
    void initialize() {
        but11_y.setOnAction(event -> {
                    but11_y.getScene().getWindow().hide();

                    FXMLLoader loader16 = new FXMLLoader();
                    loader16.setLocation(getClass().getResource("/sample/samples/sample12.fxml"));

                    try {
                        loader16.load();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    Parent root16 = loader16.getRoot();
                    Stage stage16 = new Stage();
                    stage16.setScene(new Scene(root16));
                    stage16.show();
            });



            but12_p.setOnAction(event1 -> {
                but12_p.getScene().getWindow().hide();

                FXMLLoader loader21 = new FXMLLoader();
                loader21.setLocation(getClass().getResource("/sample/samples/sample16.fxml"));

                try {
                    loader21.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Parent root21 = loader21.getRoot();
                Stage stage21 = new Stage();
                stage21.setScene(new Scene(root21));
                stage21.show();
            });
    }
}

