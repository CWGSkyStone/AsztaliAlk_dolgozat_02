package dev.skystone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.awt.Desktop;
import java.io.IOException;

public class AboutSceneController {

    @FXML
    void onClickBackButton(ActionEvent event) {
        App.setRoot("mainScene");
    }
    @FXML
    void onClickVisitTask(ActionEvent event) throws IOException {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(java.net.URI.create("https://szit.hu/doku.php?id=oktatas:programozas:feladatok:altalanos#feladat_0327"));
       }
    @FXML
    void onClickVisitSolution(ActionEvent event) throws IOException {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(java.net.URI.create("https://github.com/CWGSkyStone/AsztaliAlk_dolgozat_02"));
    }

}
