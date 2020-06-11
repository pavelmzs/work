package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private Button zak;
    @FXML
    private Button cli;

    @FXML
    void initialize() {
        zak.setOnAction(event -> {
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("zak.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Scene scene1 = new Scene(root);
            Stage stage2 = new Stage();
            stage2.setScene(scene1);
            stage2.setTitle("Работодатель");
            stage2.show();
        });
        cli.setOnAction(event -> {
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("kli.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Scene scene1 = new Scene(root);
            Stage stage2 = new Stage();
            stage2.setScene(scene1);
            stage2.setTitle("Клиент-соискатель");
            stage2.show();
        });
    }
}
