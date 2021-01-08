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

// Сюхетная ветвь Б
public class Controller8 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but8_d;

    @FXML
    void initialize() {
        but8_d.setOnAction(event -> {
            but8_d.getScene().getWindow().hide();

            FXMLLoader loader13 = new FXMLLoader();
            loader13.setLocation(getClass().getResource("/sample/samples/sample9.fxml"));

            try {
                loader13.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root13 = loader13.getRoot();
            Stage stage13 = new Stage();
            stage13.setScene(new Scene(root13));
            stage13.show();
        });
    }
}

