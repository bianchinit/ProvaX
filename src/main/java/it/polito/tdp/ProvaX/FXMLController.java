package it.polito.tdp.ProvaX;

import java.awt.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class FXMLController {

    @FXML
    private Label label;

    @FXML
    private Button btnCliccami;

    @FXML
    private TextArea txtArea;

    @FXML
    void handleButtonAction(ActionEvent event) {
    	System.out.println("Premuto bottone");
    }

}