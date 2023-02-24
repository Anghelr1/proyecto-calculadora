package com.example.calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class CalculadoraController {
    @FXML private MenuItem daltonicMode;

    //MODO DALTONISMO
    private static boolean modoDaltonico = false;
    public static boolean isModoDaltonico() {
        return modoDaltonico;
    }

    private void viewTagMode(){
        this.daltonicMode.setText("Hola mundo");
    }
}
