package it.polito.tdp.ProvaX;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
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
    void gestBottone(ActionEvent event) {
    	System.out.println("Premuto bottone");
    	for (int i=1; i<=5; i++) {
    	    txtArea.appendText("   Riga " + i + "\n");
    	    
    	    segnala("Aggiunto Rigo", "Titolo");
    	}
    }

    
    public static void segnala(String segnalazione, String intestazione)
    {
   		JOptionPane.showOptionDialog(null, 
   		      segnalazione, 
   		      intestazione, 
   		      JOptionPane.CLOSED_OPTION,
   		      JOptionPane.ERROR_MESSAGE,
   		      null, null, null);
    }
    
     
    
    public static void wait(int ms) {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}