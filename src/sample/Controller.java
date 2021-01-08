package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but_n_i;

    @FXML
    private Button but_o_i;

    @FXML
    private Button but_k;

    @FXML
    void initialize() {
        but_n_i.setOnAction(event -> {
            but_n_i.getScene().getWindow().hide();

            FXMLLoader loader1 = new FXMLLoader();
            loader1.setLocation(getClass().getResource("/sample/samples/sample1.fxml"));

            try {
                loader1.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root1 = loader1.getRoot();
            Stage stage1 = new Stage();
            stage1.setScene(new Scene(root1));
            stage1.show();
        });

        but_o_i.setOnAction(event -> {
            but_o_i.getScene().getWindow().hide();

            FXMLLoader loader2 = new FXMLLoader();
            loader2.setLocation(getClass().getResource("/sample/samples/sample_O.fxml"));

            try {
                loader2.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root2 = loader2.getRoot();
            Stage stage2 = new Stage();
            stage2.setScene(new Scene(root2));
            stage2.show();
        });

        but_k.setOnAction(event -> {
            but_k.getScene().getWindow().hide();

            FXMLLoader loader3 = new FXMLLoader();
            loader3.setLocation(getClass().getResource("/sample/samples/sample_K.fxml"));

            try {
                loader3.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root3 = loader3.getRoot();
            Stage stage3 = new Stage();
            stage3.setScene(new Scene(root3));
            stage3.show();
        });
    }
}

