module mazmorra {
    requires javafx.controls;
    requires javafx.fxml;

    opens mazmorra to javafx.fxml;
    exports mazmorra;
}
