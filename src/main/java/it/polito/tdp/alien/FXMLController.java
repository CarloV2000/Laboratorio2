/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.alien.model.Parola;
import it.polito.tdp.alien.model.Traduttore;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	private Traduttore model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonClear;

    @FXML
    private Button buttonTranslate;

    @FXML
    private TextArea txtAreaCentrale;

    @FXML
    private TextField txtParola;

    @FXML
    void doClear(ActionEvent event) {
    	this.txtAreaCentrale.clear();
    	this.model.mappaParolePerParolaAliena.clear();
    	this.txtParola.clear();
    }

    @FXML
    void doTranslate(ActionEvent event) {
    	String testoInserito = this.txtParola.getText();
    	model.inserisciNelTraduttoreOTraduci(testoInserito);
    	this.txtAreaCentrale.setText(model.inserisciNelTraduttoreOTraduci(testoInserito).toString());
    }

    @FXML
    void initialize() {
        assert buttonClear != null : "fx:id=\"buttonClear\" was not injected: check your FXML file 'Scene.fxml'.";
        assert buttonTranslate != null : "fx:id=\"buttonTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtAreaCentrale != null : "fx:id=\"txtAreaCentrale\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";

    }
    public void setModel(Traduttore t) {//creo metodo setModel()
    	this.model = t;
    }

}

