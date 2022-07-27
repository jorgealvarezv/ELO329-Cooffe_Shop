package com.example.cafeteria_poo;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    private Stage principal;
    private BorderPane borderPane;
    private ArrayList<Cafes> comprados;
    private ArrayList<Cafes> menu;
    private int total;
    private Cafes order;

    /*-----------Constructor---------*/
    public Controller(Stage _s){
        this.principal = _s;
        menu = new ArrayList<Cafes>();
        comprados = new ArrayList<Cafes>();
        /* Se crea el menú de cafes*/
        ArrayList<String> ingA = new ArrayList<String>();
        ingA.add("Espresso");
        Cafes espresso = new Cafes(1000,"Espresso",ingA,"CAFES/espresso.jpeg");
        this.menu.add(espresso);

        ingA.add("Agua");
        Cafes americano = new Cafes(1000, "Americano", ingA,"CAFES/americano.jpeg");
        this.menu.add(americano);

        ingA.add("Leche");
        Cafes latte = new Cafes(2500, "Latte", ingA,"CAFES/latte.jpeg");
        Cafes cappuccino = new Cafes(2500, "Cappuccino",ingA,"CAFES/capuccino.jpeg");

        this.menu.add(latte);
        this.menu.add(cappuccino);

        ingA.add("Hielo");

        Cafes frappe = new Cafes(3000,"Frappe", ingA,"CAFES/frappe.jpeg");
        this.menu.add(frappe);

        ArrayList<String> ingM = new ArrayList<>();
        ingM.add("Chocolate");
        ingM.add("Leche");
        ingM.add("Crema");

        Cafes chocolate = new Cafes(3000, "Chocolate",ingM,"CAFES/chocolate.jpeg");
        this.menu.add(chocolate);

        ingM.add("Espresso");
        Cafes mocha = new Cafes(3500, "Mocha",ingM,"CAFES/mocha.jpeg");
        this.menu.add(mocha);

        ArrayList<String> ingI = new ArrayList<>();
        ingI.add("Espresso");
        ingI.add("Whiskey");
        ingI.add("Crema");
        Cafes irish = new Cafes(3500, "Irish", ingI,"CAFES/irish.jpeg");
        this.menu.add(irish);


        cargarBase();
    }

    public void cargarBase(){
        try {
            //FXMLLoader base =  new FXMLLoader(Main.class.getResource("base.fxml"));
            FXMLLoader base = new FXMLLoader();
            base.setLocation(getClass().getResource("/com/example/cafeteria_poo/base.fxml"));
            borderPane = (BorderPane) base.load();
            Scene s = new Scene(borderPane);
            principal.setScene(s);
            principal.show();
            cargarMenu();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void cargarCarrito(){
        System.out.println("inicio carrito");
        try {
            FXMLLoader carrito = new FXMLLoader();
            carrito.setLocation(getClass().getResource("/com/example/cafeteria_poo/carrito.fxml"));
            Pane p = (Pane) carrito.load();
            int y = 150;
            for (Cafes c:comprados) {
                Label nombre = new Label(c.getNombre());
                Label sizee = new Label(c.getSize());
                nombre.setLayoutX(170);
                nombre.setLayoutY(y);
                nombre.setFont(Font.font("Gabriola", FontWeight.BOLD, FontPosture.REGULAR, 20));
                nombre.setTextFill(Color.rgb(219,193,175));
                p.getChildren().add(nombre);

                sizee.setLayoutX(270);
                sizee.setLayoutY(y);
                sizee.setFont(Font.font("Gabriola", FontWeight.BOLD, FontPosture.REGULAR, 20));
                sizee.setTextFill(Color.rgb(219,193,175));
                p.getChildren().add(sizee);

                total = total + c.getPrecio();
                y+=20;
            }
            Label totall = new Label("Total: " + total);
            totall.setLayoutX(250);
            totall.setLayoutY(y);
            totall.setFont(Font.font("Gabriola", FontWeight.BOLD, FontPosture.REGULAR, 20));
            totall.setTextFill(Color.rgb(219,193,175));
            p.getChildren().add(totall);
            System.out.println(total);
            borderPane.setCenter(p);
            CarritoController carritoC = carrito.getController();
            carritoC.setC(this);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void cargarListo(){
        System.out.println("inicio Listo");
        try {
            FXMLLoader listo = new FXMLLoader();
            listo.setLocation(getClass().getResource("/com/example/cafeteria_poo/listo.fxml"));
            Pane p = (Pane) listo.load();
            borderPane.setCenter(p);
            ListoController listoC = listo.getController();
            listoC.setC(this);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void cargarMenu(){
        System.out.println("inicio Menu");
        try {
            FXMLLoader menu = new FXMLLoader();
            menu.setLocation(getClass().getResource("/com/example/cafeteria_poo/menu.fxml"));
            Pane p = (Pane) menu.load();
            borderPane.setCenter(p);
            MenuController menuC = menu.getController();
            menuC.setC(this);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void setSize(String size){
        order.setSize(size);
        comprados.add(order);
        for (Cafes c:comprados) {
            System.out.println("Cafe: " + c.getNombre() + " Size: " + c.getSize());
        }
    }

    public void cargarPersonalizacion(String _order){
        System.out.println("inicio Personalizacion");
        try {
            FXMLLoader personalizacion = new FXMLLoader();
            personalizacion.setLocation(getClass().getResource("/com/example/cafeteria_poo/personalizacion.fxml"));

            Pane p = (Pane) personalizacion.load();

            //Se busca la orden seleccionada

            for (Cafes c:menu) {
                if(c.getNombre().equals(_order)) {
                    order = new Cafes(c.getPrecio(),c.getNombre(),c.getIngredientes(),c.getImagenPath());
                    break;
                }
                else{
                    order = new Cafes(0,"No existe",c.getIngredientes(),"No hay");
                }
            }

            //Se coloca el nombre de la ventana
            Label l = new Label(order.getNombre());
            l.setTextFill(Color.WHITE);
            l.setLayoutX(220);
            l.setLayoutY(50);
            l.setFont(Font.font("Gabriola", FontWeight.BOLD, FontPosture.REGULAR, 40));
            l.setTextFill(Color.rgb(219,193,175));
            p.getChildren().add(l);

            //Se coloca la imagen de cada cafe
            Image image = new Image("file:" + new File(order.getImagenPath()).getAbsolutePath());
            ImageView imageView = new ImageView(image);
            imageView.setLayoutX(89);
            imageView.setLayoutY(107);
            imageView.setScaleX(1);
            imageView.setScaleY(1);
            p.getChildren().add(imageView);


            /*order.setIngredientes("Azucar");
             * */
            borderPane.setCenter(p);
            PersonalizacionController personalizacionC = personalizacion.getController();
            personalizacionC.setC(this);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void deleteAll(){
        comprados.clear();
        total = 0;
    }



}


