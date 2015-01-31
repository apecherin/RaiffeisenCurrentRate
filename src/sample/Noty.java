package sample;

import javafx.scene.control.Dialogs;
import javafx.stage.Stage;

public class Noty {
    public static void AlertMessage(String message, String subject, String title) {
        Stage dialog = new Stage();
        Dialogs.showErrorDialog(dialog, message, subject, title);
    }

    public static boolean ConfirmDialog(String message, String subject, String title) {
        Stage dialog = new Stage();

        Dialogs.DialogResponse response = Dialogs.showConfirmDialog(dialog, message, subject, title, Dialogs.DialogOptions.YES_NO);
        if (response == Dialogs.DialogResponse.YES) {
            return true;
        } else {
            return false;
        }
    }
}
