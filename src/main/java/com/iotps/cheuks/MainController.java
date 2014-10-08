package com.iotps.cheuks;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController implements Initializable {

    private MainApp application;
    
    @FXML
    private HBox header;

    public void setApp(MainApp application) {
        this.application = application;
    }

    @FXML
    private void processTest(ActionEvent event) {
        System.out.println("You clicked me!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ImageView background = new ImageView(new Image(getClass().getResourceAsStream("/styles/header.jpg")));
        background.setFitWidth(100);
        background.setFitHeight(100);
        header.getChildren().add(background);
    }
}
