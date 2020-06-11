package sample;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller2 extends Dan {

    @FXML
    private TextField name;
    @FXML
    private TextField vid;
    @FXML
    private TextField tel;
    @FXML
    private TextField adres;
    @FXML
    private Button dann;

    @FXML
    void initialize() {
        vid.setAlignment(Pos.CENTER_RIGHT);
        adres.setAlignment(Pos.CENTER_RIGHT);
        name.setOnMouseClicked(event -> {
            boolean bl=true;
            if(bl){
                name.clear();
                bl=false;
            }
        });
        vid.setOnMouseClicked(event -> {
            boolean bl=true;
            if(bl){
                vid.clear();
                bl=false;
            }
        });
        tel.setOnMouseClicked(event -> {
            boolean bl=true;
            if(bl){
                tel.clear();
                bl=false;
            }
        });
        adres.setOnMouseClicked(event -> {
            boolean bl=true;
            if(bl){
                adres.clear();
                bl=false;
            }
        });
        dann.setOnAction(event -> {
            setName(name.getText());
            setVid(vid.getText());
            setTel(tel.getText());
            setAdres(adres.getText());
            arr();
        });
    }
}
