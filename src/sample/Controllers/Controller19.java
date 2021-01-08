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

import javax.swing.*;

// Сюжетная ветвь А
public class Controller19 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but18_d;

    @FXML
    void initialize() {
         but18_d.setOnAction(event -> {
             but18_d.getScene().getWindow().hide();

             FXMLLoader loader24 = new FXMLLoader();
             loader24.setLocation(getClass().getResource("/sample/samples/sample20.fxml"));

             try {
                 loader24.load();
             } catch (IOException e) {
                 e.printStackTrace();
             }

             Parent root24 = loader24.getRoot();
             Stage stage24 = new Stage();
             stage24.setScene(new Scene(root24));
             stage24.show();
         });
    }
}

