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

public class Controller_K {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but2_n;

    @FXML
    void initialize() {
        but2_n.setOnAction(event -> {
            but2_n.getScene().getWindow().hide();

            FXMLLoader loader5 = new FXMLLoader();
            loader5.setLocation(getClass().getResource("/sample/sample.fxml"));

            try {
                loader5.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root5 = loader5.getRoot();
            Stage stage5 = new Stage();
            stage5.setScene(new Scene(root5));
            stage5.show();
        });
    }
}

