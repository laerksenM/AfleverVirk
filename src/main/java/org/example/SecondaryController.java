package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import org.example.example.App;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}