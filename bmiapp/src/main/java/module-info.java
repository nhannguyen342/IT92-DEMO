module com.ntn.bmiapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ntn.bmiapp to javafx.fxml;
    exports com.ntn.bmiapp;
}
