package com.example.cafeteria_poo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PersonalizacionController {
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
    private ToggleGroup Tamano;


    @FXML
    private ImageView imagen;

    @FXML
    private RadioButton rbGra;

    @FXML
    private RadioButton rbMed;

    @FXML
    private RadioButton rbPeque;


    @FXML
    void goToMenu(ActionEvent event) {
        System.out.println("Volviendo al menú");
        c.cargarMenu();
    }

    @FXML
    void goToCarrito(ActionEvent event) {
        System.out.println("Añadiendo al carrito");
        String size = "";

        if(rbGra.isSelected()){
            size = "Grande";
        }
        else if (rbMed.isSelected()) {
            size = "Mediano";
        }
        else if (rbPeque.isSelected()){
            size = "Pequeño";
        }
        c.setSize(size);
        c.cargarMenu();//Agregarlo a la lista de comprados
    }




}
