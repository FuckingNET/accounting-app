module com.example.taxiapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.xerial.sqlitejdbc;
    requires java.sql;


    opens com.example.taxiapp to javafx.fxml;
    exports com.example.taxiapp;
    exports com.example.taxiapp.entity;
    opens com.example.taxiapp.entity to javafx.fxml;
}