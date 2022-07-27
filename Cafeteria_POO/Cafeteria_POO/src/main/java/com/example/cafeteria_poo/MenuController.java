
package com.example.cafeteria_poo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class MenuController {
    /*-----Instancia del controlador Principal-----*/
    private Controller c;
    private String cafe;
    /*-------------Getters and Setters-------------*/


    public Controller getC() {
        return c;
    }

    public void setC(Controller c) {
        this.c = c;
    }

    @FXML
    private Button americano;

    @FXML
    private Button cappuccino;

    @FXML
    private Button carrito;

    @FXML
    private Button chocolate;

    @FXML
    private Button espresso;

    @FXML
    private Button frappe;

    @FXML
    private Button irish;

    @FXML
    private Button latte;

    @FXML
    private Pane menu;

    @FXML
    private Button mocha;

    @FXML
    void gocarrito(ActionEvent event) {
        System.out.println("carrito");
        c.cargarCarrito();
    }

    @FXML
    void personalizacionAmer(ActionEvent event) {
        cafe = "Americano";
        System.out.println("americano");
        c.cargarPersonalizacion(cafe);
    }

    @FXML
    void personalizacionCap(ActionEvent event) {
        System.out.println("cappuccino");
        cafe = "Cappuccino";
        c.cargarPersonalizacion(cafe);
    }

    @FXML
    void personalizacionChco(ActionEvent event) {
        System.out.println("Chocolate");
        cafe = "Chocolate";
        c.cargarPersonalizacion(cafe);
    }

    @FXML
    void personalizacionEspres(ActionEvent event) {
        System.out.println("Espresso");
        cafe = "Espresso";
        c.cargarPersonalizacion(cafe);
    }

    @FXML
    void personalizacionFra(ActionEvent event) {
        System.out.println("Frappe");
        cafe = "Frappe";
        c.cargarPersonalizacion(cafe);
    }

    @FXML
    void personalizacionIr(ActionEvent event) {
        System.out.println("Irish");
        cafe = "Irish";
        c.cargarPersonalizacion(cafe);
    }

    @FXML
    void personalizacionLatte(ActionEvent event) {
        System.out.println("Latte");
        cafe = "Latte";
        c.cargarPersonalizacion(cafe);
    }

    @FXML
    void personalizacionMocha(ActionEvent event) {
        System.out.println("Mocha");
        cafe = "Mocha";
        c.cargarPersonalizacion(cafe);
    }

}
