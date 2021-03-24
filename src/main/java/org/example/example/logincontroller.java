package org.example.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class logincontroller {
    @FXML
    TextField login;
    public void login(ActionEvent actionEvent) throws IOException {
        try {

            if (login.getText().contains("gmail")) {
                JavaFXApp.setRoot("personale");
                //find ud af: java check if string is integer
            }
            if (login.getText().contains("char")) {
                JavaFXApp.setRoot("new"); //lav en ny scene/side
                //find ud af: java check if string is integer
            }
        } finally {

        }
    }
}
