package dev.skystone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AboutSceneController {

    @FXML
    void onClickBackButton(ActionEvent event) {
        App.setRoot("mainScene");
    }

}
