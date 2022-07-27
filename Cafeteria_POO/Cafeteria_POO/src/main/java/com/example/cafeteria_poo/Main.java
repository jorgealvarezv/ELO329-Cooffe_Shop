package com.example.cafeteria_poo;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override

    public void start(Stage arg0) throws Exception {
        new Controller(arg0);

    }





}

