package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {
    @FXML
    private Button button;

    /**
     * When the button is clicked, display something in the console
     */
    @FXML
    private void buttonPushed(){
        System.out.println("The button was pushed");

    }
}
