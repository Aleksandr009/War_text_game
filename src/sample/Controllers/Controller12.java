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

// Сюжетная ветвь Б
public class Controller12 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but13_d;

    @FXML
    void initialize() {
        but13_d.setOnAction(event -> {
            but13_d.getScene().getWindow().hide();

            FXMLLoader loader17 = new FXMLLoader();
            loader17.setLocation(getClass().getResource("/sample/samples/sample13.fxml"));

            try {
                loader17.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root17 = loader17.getRoot();
            Stage stage17 = new Stage();
            stage17.setScene(new Scene(root17));
            stage17.show();
        });
    }
}

