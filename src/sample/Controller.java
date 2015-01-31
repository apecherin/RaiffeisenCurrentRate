package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class Controller {
    @FXML
    public TextField inpt_ammount;

    @FXML
    private void showATMS(ActionEvent event) {
        System.out.println("showATMS");
    }

    @FXML
    private void calculateWidrawAmmount(ActionEvent event) {
        float result;
        String a = inpt_ammount.getText();
        if (Main.validateInputAmmount(a)) {
            int value = inpt_ammount.getText();
            result = inpt_ammount * 68;
        } else {
            inpt_ammount.requestFocus();
        }
    }

    @FXML
    private void exitFromApp(ActionEvent event) {
        if (Noty.ConfirmDialog("Please confirm your action", "Are you confirm exit?", "Exit")) {
            Platform.exit();
        }
    }

}

