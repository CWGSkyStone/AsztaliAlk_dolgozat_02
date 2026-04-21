/*
* File: MainController.java
* Author: Szabó József
* Copyright: 2026, Szabó József
* Group: Szoft I/N
* Date: 2026-04-21
* Github: https://github.com/CWGSkyStone
* Licenc: MIT
*/

package dev.skystone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField firstRadiusField;

    @FXML
    private TextField heightField;

    @FXML
    private TextField secondRadiusField;

    @FXML
    private TextField volumeField;

    @FXML
    void onClickAboutButton(ActionEvent event) {
        App.setRoot("aboutScene");
    }

    @FXML
    void onClickCalcButton(ActionEvent event) {
        this.startCalc();
    }

    void startCalc(){
        double height = Double.parseDouble(heightField.getText());
        double firstRadius = Double.parseDouble(firstRadiusField.getText());
        double secondRadius = Double.parseDouble(secondRadiusField.getText());

        double volume = Cone.calcVolume(height, firstRadius, secondRadius);
        String volumeString = String.format("%.3f", volume);

        volumeField.setText(String.valueOf(volumeString));

        String line = makeLine(height, firstRadius, secondRadius, volume);
        FileHandler.writeToFile(line);
    }

    String makeLine(double height, double firstRadius, double secondRadius, double volume){
        return height + ";" + firstRadius + ";" + secondRadius + ";" + volume + "\n";
    }

}
