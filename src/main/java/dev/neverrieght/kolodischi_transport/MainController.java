package dev.neverrieght.kolodischi_transport;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class MainController {
    @FXML
    private Label welcomeText;

    @FXML
    private HBox StopsBox;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}