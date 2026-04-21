module dev.skystone {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires java.desktop;

    opens dev.skystone to javafx.fxml;
    exports dev.skystone;
}
