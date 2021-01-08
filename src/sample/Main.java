package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
// Начал создание 16 октября в пятницу вечером 2020 года
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("JavaFX");
        primaryStage.setScene(new Scene(root, 800, 550));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
// Завершил написание игры 8 января в пятницу, 2021 года в 13 : 05.
