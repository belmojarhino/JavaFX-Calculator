module com.devmoisa.javafxcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.devmoisa.javafxcalculator to javafx.fxml;
    exports com.devmoisa.javafxcalculator;
}