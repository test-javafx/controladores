package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class FormularioController implements Initializable {

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtResultado;

    @FXML
    void onClick(ActionEvent event) {

        this.txtResultado.setText(this.txtNombre.getText());

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
