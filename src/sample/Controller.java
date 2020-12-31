package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    public TextField textField;
    @FXML
    private TextArea textArea;

    @FXML
    public void btnSend() {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }

    public void enter(KeyEvent keyEvent) {
        if (KeyCode.ENTER == keyEvent.getCode()){
            btnSend();
        }
    }
}
