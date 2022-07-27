package com.example.cafeteria_poo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ListoController {

    /*-----Instancia del controlador Principal-----*/
    private Controller c;
    /*-------------Getters and Setters-------------*/

    public Controller getC() {
        return c;
    }

    public void setC(Controller c) {
        this.c = c;
    }

    @FXML
    void goInicio(ActionEvent event) {

    }

    @FXML
    void goToMenu(ActionEvent event) {
        System.out.println("Volviendo al menú");
        c.deleteAll();
        c.cargarMenu();
    }

}
