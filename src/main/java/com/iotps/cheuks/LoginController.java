package com.iotps.cheuks;

import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginController implements Initializable {

    private MainApp application;
    @FXML private TextField userName;
    @FXML private PasswordField passwordField;

    public void setApp(MainApp application) {
        this.application = application;
    }

    @FXML
    private void processLogin(ActionEvent event) {
    	//System.out.println("userName:"+userName.getText()+"   passwordField:"+passwordField.getText());
        System.out.println("You clicked me!");
      //  application.gotoMainFrame();
         application.gotoRegisterFrame();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
