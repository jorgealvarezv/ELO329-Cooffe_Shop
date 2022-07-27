module com.example.cafeteria_poo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.cafeteria_poo to javafx.fxml;
    exports com.example.cafeteria_poo;
}