package sample;

import javafx.fxml.FXML;
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
        String a = inpt_ammount.getText();
        Main.validateInputAmmount(a);
    }

    @FXML
    private void exitFromApp(ActionEvent event) {
        System.out.println("exitFromApp");
    }

}

