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
// Сдесь происходит ветвление сюжета
public class Controller3 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but_z;

    @FXML
    private Button but_n_z;

    @FXML
    void initialize() {
        but_z.setOnAction(event -> {
            but_z.getScene().getWindow().hide();
       // Сюжетная ветвь А
            FXMLLoader loader8 = new FXMLLoader();
            loader8.setLocation(getClass().getResource("/sample/samples/sample4.fxml"));

            try {
                loader8.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root8 = loader8.getRoot();
            Stage stage8 = new Stage();
            stage8.setScene(new Scene(root8));
            stage8.show();
        });


        but_n_z.setOnAction(event -> {
            but_n_z.getScene().getWindow().hide();
       // Сюжетная ветвь Б
            FXMLLoader loader9 = new FXMLLoader();
            loader9.setLocation(getClass().getResource("/sample/samples/sample5.fxml"));

            try {
                loader9.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root9 = loader9.getRoot();
            Stage stage9 = new Stage();
            stage9.setScene(new Scene(root9));
            stage9.show();
        });
    }
}

