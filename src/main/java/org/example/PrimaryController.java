package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import org.example.example.App;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
