module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
    exports com.example.demo.GUI;
    opens com.example.demo.GUI to javafx.fxml;
}