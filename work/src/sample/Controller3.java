package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller3 extends Dan {
    @FXML
    private TextField last_name;
    @FXML
    private TextField name;
    @FXML
    private TextField middle_name;
    @FXML
    private TextField qualification;
    @FXML
    private TextField profession;
    @FXML
    private TextArea about_me;
    @FXML
    private Button dann;
    @FXML
    private TextArea otv;


    @FXML
    void initialize() {
        last_name.setOnMouseClicked(event -> {
            boolean bl=true;
            if(bl){
                last_name.clear();
                bl=false;
            }
        });
        name.setOnMouseClicked(event -> {
            boolean bl=true;
            if(bl){
                name.clear();
                bl=false;
            }
        });
        middle_name.setOnMouseClicked(event -> {
            boolean bl=true;
            if(bl){
                middle_name.clear();
                bl=false;
            }
        });
        qualification.setOnMouseClicked(event -> {
            boolean bl=true;
            if(bl){
                qualification.clear();
                bl=false;
            }
        });profession.setOnMouseClicked(event -> {
            boolean bl=true;
            if(bl){
                profession.clear();
                bl=false;
            }
        });
        about_me.setOnMouseClicked(event -> {
            boolean bl=true;
            if(bl){
                about_me.clear();
                bl=false;
            }
        });
        dann.setOnAction(event -> {
            setLast_name(last_name.getText());
            setName1(name.getText());
            setMiddle_name(middle_name.getText());
            setQualification(qualification.getText());
            setProfession(profession.getText());
            setAbout_me(about_me .getText());
            arr();
        });
    }
}
