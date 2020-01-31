package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.File;
import java.nio.file.Files;

public class Controller {

    @FXML
    private Button btnCreateFile;

    @FXML
    private Button btnRemoveFile;

    @FXML
    private Button btnLoadFile;

    @FXML
    private void clickCreateFile(ActionEvent event) {
        btnCreateFile.setText("You've clicked Create file");
    }

    @FXML
    private void clickRemoveFile(ActionEvent event) {
        btnCreateFile.setText("You've clicked Remove file");
    }

    @FXML
    private void loadFiles(ActionEvent event) {
        File file = new File(".");
        String[] files = file.list();
    }

}
