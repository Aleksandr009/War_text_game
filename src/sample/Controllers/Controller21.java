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
// Сюжетная ветвь А
public class Controller21 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but19_d;

    @FXML
    void initialize() {
        but19_d.setOnAction(event -> {
            but19_d.getScene().getWindow().hide();

            FXMLLoader loader26 = new FXMLLoader();
            loader26.setLocation(getClass().getResource("/sample/samples/sample22.fxml"));

            try {
                loader26.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root26 = loader26.getRoot();
            Stage stage26 = new Stage();
            stage26.setScene(new Scene(root26));
            stage26.show();
        });
    }
}

