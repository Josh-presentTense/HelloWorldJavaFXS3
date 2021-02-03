package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Button button;

    @FXML
    private Label messageLabel;

    private DeckOfCards deckOfCards;

    /**
     * When the button is clicked, display something in the console
     */
    @FXML
    private void buttonPushed(){
        Card card = deckOfCards.dealTopCard();
        messageLabel.setText(card.toString());

    }

    /**This method is called when the scene loads*/
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        deckOfCards = new DeckOfCards();
        messageLabel.setText("");
    }
}
