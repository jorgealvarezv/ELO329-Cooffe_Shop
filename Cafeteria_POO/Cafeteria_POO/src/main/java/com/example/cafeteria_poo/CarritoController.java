package com.example.cafeteria_poo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class CarritoController {

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
    void goToMenu(ActionEvent event) {
        System.out.println("al menu");
        c.cargarMenu();
    }

    @FXML
    void goToListo(ActionEvent event) {
        System.out.println("A finalizado el pedido");
        c.cargarListo();

    }




}
